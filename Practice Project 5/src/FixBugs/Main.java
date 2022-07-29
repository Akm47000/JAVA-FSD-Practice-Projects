package FixBugs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static ArrayList<Integer> arrlist = new ArrayList<Integer>();
	private static ArrayList<Integer> expenses = new ArrayList<Integer>();

	public static void addSampleExpenses() {
		expenses.add(2500);
		expenses.add(10000);
		expenses.add(450);
		expenses.add(500);
		expenses.add(11000);
		expenses.addAll(arrlist);

	}

	public static void main(String[] args) {

		addSampleExpenses();
		System.out.println("\n**************************************\n");
		System.out.println("\tWelcome to TheDesk \n");
		System.out.println("**************************************");
		optionsSelection();

	}

	private static void optionsSelection() {
		System.out.println("\n**************************************\n");
		String[] arr = { "1. I wish to review my expenditure", "2. I wish to add my expenditure",
				"3. I wish to delete my expenditure", "4. I wish to sort the expenditures",
				"5. I wish to search for a particular expenditure", "6. Close the application" };
		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int slen = arr1.length;
		for (int i = 0; i < slen; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("\nEnter your choice:\t");
		Scanner sc = new Scanner(System.in);
		int options = sc.nextInt();
		for (int j = 1; j <= slen; j++) {
			if (options == j) {
				switch (options) {
				case 1:
					System.out.println("Your saved expenses are listed below: \n");
					System.out.println(expenses + "\n");
					optionsSelection();
					break;
				case 2:
					System.out.println("Enter the value to add your Expense: \n");
					int value = sc.nextInt();
					expenses.add(value);
					System.out.println("Your value is updated\n");
					expenses.addAll(arrlist);
					System.out.println(expenses + "\n");
					optionsSelection();

					break;
				case 3:
					System.out.println(
							"You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
					int con_choice = sc.nextInt();
					if (con_choice == options) {
						expenses.clear();
						System.out.println(expenses + "\n");
						System.out.println("All your expenses are erased!\n");
					} else {
						System.out.println("Oops... try again!");
					}
					optionsSelection();
					break;
				case 4:
					sortExpenses(expenses);
					optionsSelection();
					break;
				case 5:
					searchExpenses(expenses);
					optionsSelection();
					break;
				case 6:
					closeApp();
					break;
				default:
					System.out.println("You have made an invalid choice!");
					break;
				}
			}
		}
		if (options > slen)
			System.out.println("You have made an invalid choice!");
	}

	private static void closeApp() {
		System.out.println("Closing your application... \nThank you!");
	}

	private static void searchExpenses(ArrayList<Integer> arrayList) {
		int leng = arrayList.size();
		System.out.println("Enter the expense you need to search:\t");
		Scanner sc = new Scanner(System.in);
		int expense = sc.nextInt();
		int result = linearSearch(arrayList, expense);
		System.out.println();
		if (result != -1) {
			System.out.println("Element found at " + result);
		} else {
			System.out.println("Not found ");
		}
	}

	private static int linearSearch(ArrayList<Integer> arri, int key) {
		Integer[] arr = arri.toArray(new Integer[0]);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	private static void sortExpenses(ArrayList<Integer> arrayList) {
		int arrlength = arrayList.size();

		int array[] = arrayList.stream().mapToInt(i -> i).toArray();

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Elements of array after sorted");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}