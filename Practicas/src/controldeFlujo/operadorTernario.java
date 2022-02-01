package controldeFlujo;
import java.util.Scanner;

public class operadorTernario {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("¿Cuál es tu edad?");
		int age = console.nextInt();
		 
		System.out.println(age >= 18 && age <= 150 ? "Eres mayor de edad":(age >= 0 && age < 18 ? "Eres menor de edad" : "Fuera del rango"));

	}

}
