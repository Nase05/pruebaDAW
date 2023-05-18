package tema6.repaso;

import java.util.Scanner;

public class Aplicacion {
	public static void main(String[] args) {
		
	
	Scanner teclado = new Scanner(System.in);
	Alumno[] arrayAlumno = new Alumno[10];
	char opcion;
	int posicion;
	
	do {
		System.out.println("");
		System.out.println("\tMENÚ PRINCIPAL");
		System.out.println("\t==============");
		System.out.println("\tC. CREATE");
		System.out.println("\tR READ");
		System.out.println("\tU UPDATE");
		System.out.println("\tD DELETE");
		System.out.println("\tE EXIT");
		System.out.print("\t\tEscribe la opción: ");
		opcion = teclado.nextLine().charAt(0);
		switch (opcion) {
		case 'C':
			String nombre;
			int edad;
			boolean estadoCivil;
			
			System.out.println("Inserte la posición en la que equieres crear el alumno");
			posicion = Integer.parseInt(teclado.nextLine());
			System.out.println("Inserta un Nombre");
			nombre = teclado.nextLine();
			System.out.println("Inserta una Edad");
			edad = Integer.parseInt(teclado.nextLine());
			System.out.println("Inserta un estado civil(true/false)");
			estadoCivil = Boolean.parseBoolean(teclado.nextLine());
			
			arrayAlumno[posicion] = new Alumno(nombre, edad, estadoCivil);
			break;
		case 'R':
			for (int i = 0; i < arrayAlumno.length; i++) {
				System.out.println(arrayAlumno[i]);
			}
			break;
		case 'U':
			System.out.println("Inserte la posición en la qu equieres crear el alumno");
			posicion = Integer.parseInt(teclado.nextLine());
			System.out.println("Inserta su nuevo Nombre");
			nombre = teclado.nextLine();
			System.out.println("Inserta su nueva Edad");
			edad = Integer.parseInt(teclado.nextLine());
			System.out.println("Inserta su nuevo estado civil(true/false)");
			estadoCivil = Boolean.parseBoolean(teclado.nextLine());
			
			arrayAlumno[posicion] = new Alumno(nombre, edad, estadoCivil);
			break;
		case 'D':
			System.out.println("Indique la posicion en la que quieres borrar el alumno");
			posicion = Integer.parseInt(teclado.nextLine());
			arrayAlumno[posicion] = null;
			break;
		case 'E':
			break;
		default:
			System.out.println("La opción elegida NO ES VÁLIDA");
			break;
		}
	} while (opcion != 'E');
	

	}
	
}
