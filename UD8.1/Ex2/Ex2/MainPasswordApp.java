package Ex2;

import java.util.Scanner;

public class MainPasswordApp {

	public static void main(String[] args) {
		int longitud;
		Scanner teclado = new Scanner (System.in);
		
		//Introducimos la longitud de la contraseņa
		System.out.println("Introduce la longitud");
		longitud = teclado.nextInt();
		
		//Creamos el objeto con la longitud
		Password contraseņa1 = new Password (longitud);
		
		//Imprimimos el resultado
		System.out.println(contraseņa1.toString());

		teclado.close();
	}

}
