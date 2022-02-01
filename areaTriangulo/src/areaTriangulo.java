
import java.util.Scanner; //Library import

public class areaTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner s= new Scanner(System.in);

		   System.out.println ("Ingresa la base");
		   double base= s.nextDouble();

		  System.out.println ("Ingresa altura");
		  double altura= s.nextDouble();

		   double area =(base*altura)/2;

		   System.out.println("El area del triángulo es: " + area);

	}

}
