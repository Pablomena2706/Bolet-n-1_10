package Lectura;

import java.util.Scanner;

@SuppressWarnings("resource")

public class Exercise1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String nombre;
		String apellidos;
		int edad;
		String dirección;
		String estudiante;
		boolean estudiante1;
		double altura;

		System.out.println("Introduce tu nombre: ");
		nombre = keyboard.nextLine();
		System.out.println("Nombre: " + nombre);

		System.out.println("Introduce tus apellidos: ");
		apellidos = keyboard.nextLine();
		System.out.println("Apellidos: " + apellidos);

		System.out.println("Introduce tu dirección(calle,número,código postal y provincia) :");
		dirección = keyboard.nextLine();
		System.out.println("Dirección: " + dirección);

		System.out.println("Introduce tu edad: ");
		edad = keyboard.nextInt();
		System.out.println("Edad: " + edad);

		System.out.println("Introduce tu altura :");
		altura = keyboard.nextDouble();
		System.out.println("Altura: " + altura);

		System.out.println("¿Eres estudiante?:");
		estudiante1 = keyboard.nextBoolean();
		estudiante = estudiante1 ? "Si " : "No ";
		System.out.println(estudiante + "eres estudiante");

	}
}
