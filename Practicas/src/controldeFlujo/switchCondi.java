package controldeFlujo;
import java.util.Scanner;

public class switchCondi {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Elige una opci�n: ");
		String enter = console.nextLine();
		
		switch(enter){
			case "1":
				System.out.println("Elegiste opci�n 1");
				break;
			case "2":
				System.out.println("Elegiste opci�n 2");
				break;
			default:
				System.out.println("Elecci�n incorrecta");
				break;
		}
		

	}

}
