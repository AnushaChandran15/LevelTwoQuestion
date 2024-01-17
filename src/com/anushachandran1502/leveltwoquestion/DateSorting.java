package com.anushachandran1502.leveltwoquestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DateSorting {
	public static void main(String[] args) throws IOException {
		DateSorting dateSorting=new DateSorting();
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number dates");
		int n=Integer.parseInt(buff.readLine());
		String[][] dateStr=new String[n][3];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<dateStr[i].length;j++)
			{
				System.out.println("Index : "+i);
				String date=buff.readLine();
				dateStr[i]=date.split("\\/");
			}
		}
		System.out.println(Arrays.deepToString(dateStr));
	}
}
