package com.anushachandran1502.leveltwoquestion;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayInputStreamToConsole {
	
	public static void main(String[] args) throws IOException {
		byte[] arr= {1,2,3,44,5,6};
		ByteArrayInputStream bis=new ByteArrayInputStream(arr);
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		int i;
		while((i=bis.read())!=-1)
		{
			System.out.println(i);
		}
		System.out.flush();
		bis.close();
	}

}
