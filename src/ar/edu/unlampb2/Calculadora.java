package ar.edu.unlampb2;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado;

		Scanner teclado = new Scanner(System.in);

		do {

			System.out.println("Ingrese el primer numero");
			a = teclado.nextInt();

			System.out.println("Ingrese el segundo numero");
			b = teclado.nextInt();

			System.out.println(
					"Ingrese su operación \n 1) para sumar \n 2) para restar \n 3) para multiplicar \n 4) para dividir");

			opcion = teclado.nextInt();
		}

		while (opcion < 1 && opcion > 4);

		switch (opcion) {

		case 1:
			System.out.println("El resultado de la suma es: "+(resultado=a+b));
			break;
		case 2:
			System.out.println("El resultado de la resta es: "+(resultado=a-b));
			break;
		case 3:
			System.out.println("El resultado de la multiplicacion es: "+(resultado=a*b));
			break;
		case 4:
			if (b != 0) {
				System.out.println("El resultado de la division es: "+(resultado=a/b));
			} else {
				System.out.println("No se puede dividir por Cero ");
			}
			
		}
	}
}
