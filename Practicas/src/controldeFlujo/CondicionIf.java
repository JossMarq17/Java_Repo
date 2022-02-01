package controldeFlujo;
import java.util.Scanner;

public class CondicionIf {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("¿Cuál es tu edad?");
		int age = console.nextInt();
		
		if(age >= 18 && age <= 150) {
			System.out.println("Eres mayor de edad");
		} else if (age > 0 && age < 18) {
			System.out.println("Eres menor de edad");
		} else {
			System.out.println("Esta fuera del rango");
			};

	}

}
