package operadores;

import java.util.Scanner;
public class ejercicioJava1 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Ingresa tu usuario: ");
		String user = console.nextLine();
		
		System.out.println("Ingresa tu contraseña: ");
		String password1 = console.nextLine();
		
		System.out.println("Confirma tu contraseña: ");
		String password2 = console.nextLine();
		
		int validation1 = password1.compareTo(password2);
		
		if (password1.equals(password2)) {
			System.out.println("Correcto");
			
			System.out.println("Ingresa tu calificación: ");
			double grade = console.nextDouble();
			
			int newGrade = (int)grade;
			
			System.out.println("Tu calificación final es: " + newGrade);
		} else {
			System.out.println("Incorrecto");
		}

	}

}
