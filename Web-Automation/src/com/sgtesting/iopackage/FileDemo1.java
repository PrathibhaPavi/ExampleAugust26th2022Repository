package com.sgtesting.iopackage;

import java.io.File;

public class FileDemo1 {

	public static void main(String[] args) {
				File f1=new File("E:\\EXAMPLE\\Welcome\\Test.txt");
				//Display Name of the File
				String name=f1.getName();
				System.out.println("File Name :"+name);
				//Display Path of the File
				String path1=f1.getAbsolutePath();
				System.out.println("File Path :"+path1);
				//Display Folder Path
				String path2=f1.getParent();
				System.out.println("Folder Path :"+path2);
				//Read Permission
				boolean v1=f1.canRead();
				System.out.println("Does it have Read Permission?:"+v1);
				//Read Permission
				boolean v2=f1.canWrite();
				System.out.println("Does it have Write Permission?:"+v2);
				//Read Permission
				boolean v3=f1.canExecute();
				System.out.println("Does it have Execute Permission?:"+v3);
				//Is it a File?
				boolean v4=f1.isFile();
				System.out.println("Is it a File ?:"+v4);
				//Is it a Folder?
				boolean v5=f1.isDirectory();
				System.out.println("Is it a Folder?:"+v5);
			}

	}

