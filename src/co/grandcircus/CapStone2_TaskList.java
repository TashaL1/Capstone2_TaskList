package co.grandcircus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CapStone2_TaskList {

	public static void main(String[] args) {

		System.out.println("Welcome to the Task Manager!");
		Scanner scan = new Scanner(System.in);
		ArrayList<Task> taskList = new ArrayList<>();
		while (true) {
			System.out.printf(" 1. List task\n 2. Add task\n 3. Delete task\n 4. Mark task complete\n 5. Quit\n");
			int userInput = Validator.getInt(scan, "What would you like to do? ", 1, 5);
			// int userInput = scan.nextInt();
			switch (userInput) {
			case 1:
				System.out.println("LIST TASK:");
				int n = 1;
				for (Task t : taskList) {
					System.out.println(n++ + " " + t);
				}
				break;

			case 2:
				System.out.println("ADD TASK:");
				System.out.println("Name: ");
				String name = scan.nextLine();
				System.out.println("Description: ");
				String desc = scan.nextLine();
				System.out.println("Due Date: (yyyy-mm-dd)");
				LocalDate dueDate = LocalDate.parse(scan.nextLine());
				taskList.add(new Task(name, desc, dueDate));

				break;

			case 3:
				System.out.println("DELETE TASK:");
				int n1 = 1;
				for (Task t : taskList) {
					System.out.println(n1++ + " " + t);
				}
				int delete = Validator.getInt(scan,"Which task number would you like to delete? " , 1, taskList.size());
				taskList.remove(delete -1);
				System.out.println("TASK DELETED!");
				break;

			case 4:
				System.out.println("MARK TASK COMPLETE:");
				int n2 = 1;
				for (Task t : taskList) {
					System.out.println(n2++ + " " + t);
				}
				System.out.println("Which task number would you like to complete? "); 
				int completed = scan.nextInt();
				taskList.get(completed -1).setCompleted(true);
				System.out.println("TASK COMPLETED!");
				break;

			case 5:
				System.out.println("Are you sure you want to quit? ");
				String cont = "y";
				while (cont.equalsIgnoreCase("y")) {
					cont = scan.next();
					System.out.println("Have a great day!");
				}
				break;
			}
			
		}
		//scan.close();

	}

}
