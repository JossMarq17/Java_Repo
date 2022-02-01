package ejerciciosGit;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Ingresa el monto de venta");
		int venta = console.nextInt();
		
		if (venta <= 1000 && venta >= 0) {
			System.out.println("No se aplica comisión");
		} else if (venta > 1000 && venta <= 5000) {
			System.out.println("La comisión es de " + venta*0.1);
		} else if (venta > 5000 && venta <= 10000) {
			System.out.println("La comisión es de " + venta*0.2);
		} else {
			System.out.println("La comisión es de " + venta*0.3);
		}

	}

}
