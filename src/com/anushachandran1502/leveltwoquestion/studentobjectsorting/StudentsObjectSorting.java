package com.anushachandran1502.leveltwoquestion.studentobjectsorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.anushachandran1502.leveltwoquestion.studentobjectsorting.dto.Student;

public class StudentsObjectSorting{
	private static ArrayList<Student> studentsList=new ArrayList<Student>();
	public static void main(String[] args){
		StudentsObjectSorting stdObjSort=new StudentsObjectSorting();
		Student object=new Student();
		Scanner scanner=new Scanner(System.in);
		int n=0;
		while(n<=2)
		{	
			int current=object.getId();
			studentsList=stdObjSort.getStudentInfo(current,studentsList,scanner);
			current++;
			n++;
			object.setId(current);
		}
        studentsList = stdObjSort.studentsNameListSortingOrder(studentsList);

		System.out.println(studentsList);
		for(Student st:studentsList)
		{
			System.out.println(st.getName());
			System.out.println(Arrays.toString(st.getDob()));
		}
	}
	private ArrayList<Student> studentsNameListSortingOrder(ArrayList<Student> studentsList) {
		Collections.sort(studentsList);
		return studentsList;
	}
	private ArrayList<Student> getStudentInfo(int current,ArrayList<Student> studentsList, Scanner scanner) {
		System.out.println("Enter the Student Name");
		String name=scanner.nextLine();
		System.out.println("Enter the Date of Birth (dd mm yyyy)");
		String[] dob=scanner.nextLine().split(" ");
		studentsList.add(new Student(name,dob));
		return studentsList;
	}
	

}
