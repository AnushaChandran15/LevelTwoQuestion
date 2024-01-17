package com.anushachandran1502.leveltwoquestion;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayCircularEle {
	public static void main(String[] args) {
		TwoDArrayCircularEle circular=new TwoDArrayCircularEle();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N*N");
		int n=scanner.nextInt();
		int[][] arr=new int[n][n];
		arr=circular.matrixIntput(n,arr,scanner);
		System.out.println(Arrays.deepToString(arr));
		
	}

	private int[][] matrixIntput(int n, int[][] arr, Scanner scanner) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println("Index : "+ i);
				arr[i][j]=scanner.nextInt();
			}
		}
		return arr;
	}

}
