package inputOutputStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileRenamingWithArguement {
	static String filePath = "";
	static String replaceString = "";
	static String replaceStringWith = "";
	static String regex = "";
	
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Please Enter the FilePath 								::");
			filePath = bufferedReader.readLine();
			System.out.println("Please Enter the String You want to be Replaced			::");
			replaceString = bufferedReader.readLine();
			System.out.println("Please Enter the String You want to be Replaced	with	::");
			replaceStringWith = bufferedReader.readLine();
			System.out.println("Please Enter Regex If any Pattern needs to be replaced	::");
			regex = bufferedReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(filePath != null) {
			File fileDirectory = new File(filePath);
			if(fileDirectory.isDirectory()){
				System.out.println(true);
				File[] listOfFiles = fileDirectory.listFiles();
				System.out.println("No Of files ::" + listOfFiles.length);
				for(File file:listOfFiles){
					renameFileName(file);
				}
			} else {
				System.out.println(false);
			}
		}
	}
	
	public static void renameFileName(File file){
		if(!file.isDirectory()){
			String fileName = file.getName().replace(filePath, "");
			if(file.getName().contains(replaceString)) {
				fileName = fileName.replace(replaceString, replaceStringWith);
				fileName = replaceNumberIfPresent(fileName);
				file.renameTo(new File(filePath + "\\" + fileName));
			} else {
				fileName = replaceNumberIfPresent(fileName);
				file.renameTo(new File(filePath + "\\" + fileName));
			}
			
		}
	}

	public static String replaceNumberIfPresent(String fileName){
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(fileName);
		if(matcher.find()){
			fileName = fileName.replaceFirst(regex, "");
			System.out.println(fileName + "\t\t Completed :)");
		} else {
			System.out.println(fileName + " Skipped :(");
		}
		return fileName;
	}
}
