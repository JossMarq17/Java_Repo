package funcionesGit;
import java.util.Scanner;

public class practica1 {
	
	 private static void printNameLength(String name)
	    {
		 	System.out.println("Name lenght: " + name.length());
	    }

	    private static void printNameCharacters(String name)
	    {
	    	
	    	 for (int i=0; i<=name.length()-1;i++) {
	         	System.out.println(name.charAt(i));
	         }
	    }

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
        String name;
        String lname;
        
        System.out.print("Enter your name: ");
        name = console.nextLine();
        System.out.print("Enter your last name: ");
        lname = console.nextLine();
        
        console.close();
        
        System.out.println("Full name: " + name + " " +lname);
        
        printNameLength(name);
        
        printNameCharacters(name);
        
        

	}

}
