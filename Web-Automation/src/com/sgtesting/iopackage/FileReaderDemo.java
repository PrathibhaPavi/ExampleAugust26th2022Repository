package com.sgtesting.iopackage;

import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {
		readContent();

	}
	
	private static void readContent()
	{
		FileReader fr=null;
		int n=0;
		try
		{
			fr=new FileReader("E:\\EXAMPLE\\Welcome\\Sample.txt");
			while(true)
			{
				n=fr.read();
				if(n==-1)
				{
					break;
				}
				char ch=(char) n;
				System.out.print(ch);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				/*
				 * If file is invalid,It provides Exception in while
				 * Create FileReader object
				 * If we try to close the same object,It provides NP
				 * So in order to handle Exception finally block
				 * should contain try catch
				 */
				fr.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
