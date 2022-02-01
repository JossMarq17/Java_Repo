package circulo;

import java.util.Scanner;

public class circleProperties {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Escribe el radio del circulo: ");
		int radio = console.nextInt();
		console.nextLine();
		
		double area = (3.1416 * radio * radio);
		double perimetro = (2 * 3.1416 * radio);
		
		System.out.println("El área es igual a: " + area);
		System.out.println("El perimetro es igual a: " + perimetro);

		
	}

}
