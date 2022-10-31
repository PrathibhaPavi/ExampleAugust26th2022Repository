package com.sgtesting.iopackage;

import java.io.BufferedReader;
import java.io.FileReader;

public class BefferedReaderDemo {

	public static void main(String[] args) {
		readContent();

	}
	
	private static void readContent()
	{
		FileReader fr=null;
		BufferedReader br=null;
		try
		{
			fr=new FileReader("E:\\EXAMPLE\\Welcome\\Sample.txt");
			br=new BufferedReader(fr);
			
			String strLine=null;
			
			while((strLine=br.readLine())!=null)
			{
				System.out.println(strLine);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
