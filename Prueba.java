package prueba;

import java.util.Scanner;

public class Prueba {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Ingrese su carrera: ");
        String carrera = scanner.nextLine();

        System.out.println("\nInformación ingresada");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
    }
}
