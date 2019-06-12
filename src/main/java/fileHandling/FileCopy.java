package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FileCopy {

	static int TOTAL_NUMBER_OF_FILES_IN_SOURCE_FOLDER = 0;
	public static HashMap<String, String> SELECTEDFILEMAP = new HashMap<>();
	public static ArrayList<String> FILELIST = new ArrayList<>();
	public static String TARGET_PARENT_FOLDER = "D:\\Selected Photos";
	public static String SOURCE_PARENT_FOLDER = "H:\\Recovery\\Pics\\Engagement&Marriage\\lucky";
	public static String SELECTED_FILE_LIST = "Meri Shaadi.properties";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getSelectedFileNameAndCreateFolder();
		System.out.println("No of Target Files :" + FILELIST.size());
		File file = new File(SOURCE_PARENT_FOLDER);
		Calendar calendar = Calendar.getInstance();
		long startTime = calendar.getTimeInMillis();
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File file2 : files) {
				listFiles(file2);
			}
		}
		calendar = Calendar.getInstance();
		long endTime = calendar.getTimeInMillis();
		System.out.println("Total Number of Files: " + TOTAL_NUMBER_OF_FILES_IN_SOURCE_FOLDER + " Total Time: " + (endTime-startTime));

		/*Set<String> uniqueSet = new HashSet<String>(FILELIST);
		for (String temp : uniqueSet) {
			System.out.println(temp + ": " + Collections.frequency(FILELIST, temp));
		}*/
	}
	
	public static void getSelectedFileNameAndCreateFolder(){
		File file = new File(SELECTED_FILE_LIST);
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
			while(scanner.hasNext()){
				String line = scanner.nextLine();
				String[] lineItem = line.split("=");
				String key = lineItem[0];
				String value = lineItem[1];
				File folder = new File(TARGET_PARENT_FOLDER + "\\" + key);
				folder.mkdir();
				SELECTEDFILEMAP.put(key, value);
				String[] fileList = value.split(",");
				System.out.println("In " + key + " No of Files:" + fileList.length);
				for (String fileName : fileList) {
					FILELIST.add(fileName.trim());
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(null != scanner){
				scanner.close();
			}
		}
	}
	
	public static void listFiles(File file){
		if(file.isDirectory()){
			for (File file1 : file.listFiles()) {
				listFiles(file1);
			}
		} else {
			TOTAL_NUMBER_OF_FILES_IN_SOURCE_FOLDER++;
			copyFile(file);
		}
	}
	
	public static void copyFile(File file){
		String fileName = file.getName().substring(0, file.getName().lastIndexOf('.'));
	//	System.out.println(file.getName() + "::" + fileName + "::" + FILELIST);
		if(FILELIST.contains(fileName)){
			System.out.println(file.getName() + "::::::::::::::::::::::::::::::::::::::::::" + fileName);
			for (String key : SELECTEDFILEMAP.keySet()) {
				for (String tempValue : SELECTEDFILEMAP.get(key).split(",")) {
					if(fileName.equalsIgnoreCase(tempValue.trim())){
						FileInputStream inputStream = null;
						FileOutputStream outputStream = null;
						
						try {
							File newFile = new File(TARGET_PARENT_FOLDER + "\\" +key + "\\" + file.getName());
							inputStream = new FileInputStream(file);
							outputStream = new FileOutputStream(newFile);
							byte[] buffer = new byte[1024];
							int length;
							//copy the file content in bytes 
							while ((length = inputStream.read(buffer)) > 0){
								outputStream.write(buffer, 0, length);
							}
							inputStream.close();
							outputStream.close();
							System.out.println("File Name : " + file.getName() + " Copied to " + TARGET_PARENT_FOLDER + "\\" + key + " Successfully");
							break;
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
}
