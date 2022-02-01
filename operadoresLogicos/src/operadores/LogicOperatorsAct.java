package operadores;
import java.util.Scanner;

public class LogicOperatorsAct {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Ingresa la calificación: ");
		int grade = console.nextInt();
		
		if(grade >= 0 && grade <= 10) {
			if (grade >= 0 && grade <= 3) {
				System.out.println("Failed");
			} else if (grade > 3 && grade <= 5) {
				System.out.println("Insufficient");
			} else if (grade > 5 && grade <= 9) {
				System.out.println("Good");
			} else {
				System.out.println("Excellent Grade");
			}
		}else {
			System.out.println("Error");
		}

	}

}
