
import java.util.Scanner;

class MyFirstInput {
	 public static void main(String[] args) {
		 Scanner console = new Scanner(System.in);
		 
	     System.out.println("Please enter your name ");
	     String name = console.nextLine();
	     
	   //String name = console.readLine();

	   System.out.println("My name is "+ name);
	 }
	}