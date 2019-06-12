
/**
 * Under Testing......
 * Not Completed......
 * Not Working........
 */

package com.piyush;
import java.io.*;

public class FileSearch {
	public static void main(String[] args) {
		String fileName="";
		boolean flag=true;
		File file=null;
		String driveName="";
		int count=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
			do {
				System.out.print("Enter a filename with extension ::");
				fileName=br.readLine();
				File[] roots = File.listRoots();
				for(int i=0;i<roots.length;i++)	{
					driveName=""+roots[i];
					driveName=driveName.substring(0,2);
					file=new File(driveName+"\\"+fileName);
					System.out.println("Root["+i+"]:" + roots[i]);
					if(file.exists()) {
						count++;
					} else {
						flag=false;
					}
				}				
				if(count!=0) {
					System.out.println("File "+fileName+" exists at "+count+" Places");
				}else {
					System.out.println("File "+fileName+" does not exists");
				}
			}	while(flag==false);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
