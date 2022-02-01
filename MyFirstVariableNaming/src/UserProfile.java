import java.util.Scanner;

public class UserProfile {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Escribe tu nombre: ");
		String name = console.nextLine();
		
		System.out.println("Escribe tu edad: ");
		int age = console.nextInt();
		console.nextLine();
		
		System.out.println("Cuál es tu genero?: ");
		String gender = console.nextLine();
		
		System.out.println("Cuál es tu trabajo?: ");
		String job = console.nextLine();
		
		System.out.println("Escribe tu nacionalidad: ");
		String nationality = console.nextLine();
		
		System.out.println("Escribe tu tipo de sangre: ");
		String blood = console.nextLine();
		
		int year = 2022 - age;
		
		System.out.println("Hola " + name + ", tienes " + age + " años. Tu genero es : " + gender + " y trabajas como " + job + ". Eres de nacionalidad " + nationality + " y tu tipo de sangre es " + blood );
		System.out.println("Naciste en el año de " + year);
		

	}

}
