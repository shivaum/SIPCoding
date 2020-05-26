import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

// import java.util.*;

public class hw4 {

	// Question 2
	public static int[] newArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
        	arr[i] = 2 * arr[i] + 1;
        }
  		return arr; 
	}

	public static void main(String[] args) throws InterruptedException {
		// Question 1
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String first = scan.nextLine();
		System.out.print("Enter your middle name: ");
		String middle = scan.nextLine();
		System.out.print("Enter your last name: ");
		String last = scan.nextLine();
		System.out.println("Full name: " + first+ " " + middle + " " + last);

		System.out.print("Enter your age: ");
		while(scan.hasNext()){  
            //Print int value  
            if(scan.hasNextInt()){  
                System.out.println("Age: "+ scan.next());
                break;  
            }  
            else{  
                System.out.print("Please enter valid number: ");
                scan.next();  
            }  
        }

        System.out.print("Enter your grade: ");
		while(scan.hasNext()){  
            //Print int value  
            if(scan.hasNextInt()){  
                System.out.println("Grade: "+ scan.next());
                break;
            }  
            else{  
                System.out.print("Please enter valid number: ");
                scan.next();  
            }  
        }

        // Question 2

		int[] a = {2, 3,4,5};

		System.out.println(newArray(a));
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}

		// Question 3

		String importantInfo[] = {
            "Mares eat oats",
            "Does eat oats",
            "Little lambs eat ivy",
            "A kid will eat ivy too"
        };

        for (int i = 0; i < importantInfo.length; i++) {
            //Pause for 15 seconds
            Thread.sleep(1000);
            //Print a message
            System.out.println(importantInfo[i]);
        }
	
	}
}