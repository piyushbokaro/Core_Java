package fileHandling;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class SearchFile {

	static int TOTAL_NUMBER_OF_FILES_IN_TARGET_FOLDER = 0;
	static int FILE_OCCURENCE_NUMBER = 0;
	public static HashMap<String, String> SELECTEDFILEMAP = new HashMap<>();
	public static ArrayList<String> FILELIST = new ArrayList<>();
	public static String SOURCE_PARENT_FOLDER = "H:\\Recovery\\Pics\\Engagement&Marriage\\lucky";
	public static String FILE_TO_SEARCH = "Picture 480";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.println("Total Number of Files: " + TOTAL_NUMBER_OF_FILES_IN_TARGET_FOLDER + " Total Time: " + (endTime-startTime)*.001 + " Seconds");
	}
	
	public static void listFiles(File file){
		if(file.isDirectory()){
			for (File file1 : file.listFiles()) {
				listFiles(file1);
			}
		} else {
			TOTAL_NUMBER_OF_FILES_IN_TARGET_FOLDER++;
			if(file.getName().contains(".")){
				String fileFromDisk = file.getName().substring(0, file.getName().lastIndexOf('.'));
				if(FILE_TO_SEARCH.equalsIgnoreCase(fileFromDisk)){
					System.out.println("Found in : " + file.getAbsolutePath());
				}
			}
		}
	}
}
