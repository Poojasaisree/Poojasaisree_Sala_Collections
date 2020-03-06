package com.epam.custom_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeInput {
	static ListOperations<Object> lt = new ListOperations<Object>();
	static Scanner sc = new Scanner(System.in);
	static int f = 1;

	static void selectOperations() {
		
		
		
		while(f == 1) {
			System.out.println("Choose the operations to be performed on list:  1.Add an element 2.Fetch an element 3.Remove an element 4.Print the values 5.Get the length of list 6.Exit");
			int choice = sc.nextInt();
			chooseOperations(choice);
			
		}
	}

	public static void chooseOperations(int choice) {
		switch(choice) {
			case 1:
				ChooseDataType d = new ChooseDataType();
				d.add(lt); 
				
				break;
			case 2:
				System.out.println("Enter the index");
				int in = sc.nextInt();
				System.out.println("The element at index " + in + " is " + lt.get(in));
				break;
			case 3:
				System.out.println("Enter the index of the element to be removed ");
				int index = sc.nextInt();
				lt.remove(index);
				System.out.println("List after removed element" + lt);
				break;
			case 4:
				System.out.println("Elements of the list " + lt);
				break;
			case 5:
				System.out.println("List size " + lt.size());
				break;
			case 6:
				f = 0;
				break;
			default:
				System.out.println("Enter valid input");
			}
		}
		
	}

