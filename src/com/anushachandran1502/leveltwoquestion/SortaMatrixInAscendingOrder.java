package com.anushachandran1502.leveltwoquestion;

import java.util.Arrays;
import java.util.Scanner;

public class SortaMatrixInAscendingOrder {
	
	public static void main(String[] args) {
		SortaMatrixInAscendingOrder sortMatrix=new SortaMatrixInAscendingOrder();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the row");
		int row=scanner.nextInt();
		int[][] arr=new int[row][row];
		arr=sortMatrix.inputMatrixArray(row,arr,scanner);
		System.out.println("Enter the Direction");
		System.out.println("1.Vetrical\n2.Horizondal\n3.Diagonal");
		int direction=scanner.nextInt();
		switch(direction)
		{
		case 1:
			arr=sortMatrix.vetricalAscenOrderDirection(row,arr,direction);
			break;
		case 2:
			arr=sortMatrix.horiZondalascenOrderDirection(row,arr,direction);
			break;
		case 3:
			arr=sortMatrix.diagonalAscenOrderDirection(row,arr,direction);
			break;	
		}
	}
	
	private int[][] diagonalAscenOrderDirection(int row, int[][] arr, int direction) {
		return null;
	}

	private int[][] horiZondalascenOrderDirection(int row, int[][] arr, int direction) {
		return null;
	}

	private int[][] vetricalAscenOrderDirection(int row, int[][] arr, int direction) {
		int[] sortArr=new int[row];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row;j++)
			{
				sortArr[j]=arr[j][i];
			}
			sortArr=sortTheArray(sortArr);
			//reCreation
		}
		return null;
	}
	private int[] sortTheArray(int[] sortArr) {
		Arrays.sort(sortArr);
		return sortArr;
	}

	private int[][] inputMatrixArray(int row, int[][] arr, Scanner scanner) {
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.println("Index :"+i+j);
				arr[i][j]=scanner.nextInt();
			}
		}
		return arr;
	}

}
