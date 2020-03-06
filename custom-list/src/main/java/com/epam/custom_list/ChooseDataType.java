package com.epam.custom_list;

import java.util.Scanner;

public class ChooseDataType {

	public void add(ListOperations<Object> lt) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the datatype 1.Integer 2.String 3.Double 4.Float 5.Exit");
		
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter integer value");
			lt.add(sc.nextInt());
			break;
		case 2:
			System.out.println("Enter string value");
			lt.add(sc.next());
			break;
		case 3:
			System.out.println("Enter double value");
			lt.add(sc.nextDouble());
			break;
		case 4:
			System.out.println("Enter float valule");
			lt.add(sc.nextFloat());
			break;
		default:
			System.out.println("Enter valid input");
		}
		
	}

}
