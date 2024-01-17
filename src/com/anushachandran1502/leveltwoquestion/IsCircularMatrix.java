package com.anushachandran1502.leveltwoquestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class IsCircularMatrix {
	
	public static void main(String[] args) throws IOException {
		IsCircularMatrix isCircular=new IsCircularMatrix();
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Rows");
		int row=Integer.parseInt(buff.readLine());
		int[][] matrix=new int[row][row];
//		int[][] matrix1=new int[row][row];
//		Scanner scanner=new Scanner(System.in);
//		for(int i=0;i<row;i++)
//		{				System.out.println("Index "+ i);
//
//			for(int j=0;j<row;j++)
//			{
//				matrix1[i][j]=scanner.nextInt();
//			}
//		}
//		System.out.println(Arrays.deepToString(matrix1));
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.println("Index : "+ i + j);
				matrix[i][j]=Integer.parseInt(buff.readLine());
			}
		}
		System.out.println(Arrays.deepToString(matrix));
		boolean result=isCircular.isMatrixCircular(row,matrix);
		System.out.println(result);
	}

	private boolean isMatrixCircular(int row, int[][] matrix) {
		for(int i=0;i<row-1;i++)
		{ 
	if(matrix[i][matrix[i].length-1]==matrix[i+1][0] && Arrays.equals(Arrays.copyOfRange(matrix[i], 0, row-1), Arrays.copyOfRange(matrix[i+1], 1, row)))
			{
				continue;
			}
	else
	{
		return false;
	}
//			if(matrix[i][matrix[i].length-1]!=matrix[i+1][0])
//			{
//				return false;
//			}
//			for(int j=0;j<row-1;j++)
//			{
//				if(matrix[i][j]!=matrix[i+1][j+1])
//				{
//					return false;
//				}
//			}
		}
		return true;
	}
}
