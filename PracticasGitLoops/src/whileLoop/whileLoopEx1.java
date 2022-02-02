package whileLoop;
import java.util.Scanner;

public class whileLoopEx1 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
        
        int num;
        int i=1;
        
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
        console.close();
                
        System.out.println("Multiplication Table of " + num);
        
       //TODO implement While loop to get print 
        while(i<=10) {
        	System.out.println(i*num);
        	
        	i++;
        }

	}

}
