package inputOutputStream;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileRenaming {
	static String filePath = "D:\\Songs\\Mix";
	static String replaceString = " [Songspk.name]";
	static String replaceStringWith = "";
	static String regex = "[/][0-9][1-9][ ][-][ ]";

	public static void main(String[] args) {
		File fileDirectory = new File(filePath);
		if(fileDirectory.isDirectory()){
			File[] listOfFiles = fileDirectory.listFiles();
			System.out.println("No Of files ::" + listOfFiles.length);
			for(File file:listOfFiles){
				renameFileName(file);
			}
		} else {
			System.out.println(false);
		}
	}

	public static void renameFileName(File file){
		if(!file.isDirectory()){
			String fileName = file.getName().replace(filePath, "");
			if(fileName.contains(replaceString)){
				fileName = fileName.replace(replaceString, replaceStringWith);
				System.out.print(fileName + " ::: Useless String Removed :):)");
			} else {
				System.out.print(fileName + " ::: No Useless String found :D:D");
			}
			fileName = replaceNumberIfPresent(fileName);
			file.renameTo(new File(filePath + "\\" + fileName.trim()));
		}
	}

	public static String replaceNumberIfPresent(String fileName){
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(fileName);
		if(matcher.find()){
			fileName = fileName.replaceFirst(regex, "");
			System.out.println("\t Numbers Removed :)");
		} else {
			System.out.println("\t No Numbers found :(");
		}
		return fileName;
	}
}
