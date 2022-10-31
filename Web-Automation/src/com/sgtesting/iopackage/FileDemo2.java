package com.sgtesting.iopackage;

import java.io.File;

public class FileDemo2 {

	public static void main(String[] args) {
            //  createFile();
			//	renameFile();
			//	deleteFile();
			fileCollections();
		}
		private static void createFile()
		{
			try
			{
				File f1=new File("E:\\EXAMPLE\\Welcome\\TestingDemo.txt");
				f1.createNewFile();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void renameFile()
		{
			File f1=new File("E:\\EXAMPLE\\Welcome\\TestingDemo.txt");
			File f2=new File("E:\\EXAMPLE\\Welcome\\TestingDemoNew.txt");
			f1.renameTo(f2);
		}

		private static void deleteFile()
		{
			File f2=new File("E:\\EXAMPLE\\Welcome\\TestingDemoNew.txt");
			boolean v1=f2.delete();
			System.out.println("Is File deleted ?:"+v1);
		}

		private static void fileCollections()
		{
			File f1=new File("E:\\EXAMPLE\\Welcome");
			File f2[]=f1.listFiles();
			for(int i=0;i<f2.length;i++)
			{
				if(f2[i].isFile()==true)
				{
					String path=f2[i].getPath();
					System.out.println(path);
				}
			}

	}

}
