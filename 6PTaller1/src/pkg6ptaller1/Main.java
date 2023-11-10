/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6ptaller1;

import java.util.Scanner;

/**
 * Jilmar Gonzalez
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner numero = new Scanner(System.in);
        
        double a = 0, b = 0;
        double suma, resta, mult, div;
        
        System.out.println("---------------------------------------------");
        System.out.println("   Universidad de las Fuerzas Amardas Espe");
        System.out.println("\nNombres: \tJilmar Gonzalez, Edith Chuico");
        System.out.println("Docente: \tVeronica Martinez");
        System.out.println("Fecha: \t\t10/11/2023");
        System.out.println("---------------------------------------------");
        
       System.out.print("\nPrimer numero: ");
        while(!numero.hasNextInt()){
            System.out.println("Numero incorrecto");
            System.out.print("\nPrimer numero: ");
            numero.next();
        }
        a = numero.nextInt();
        
        System.out.print("\nSegundo numero: ");
        while(!numero.hasNextInt()){
            System.out.println("Numero incorrecto");
            numero.next();
            System.out.println("\nSegundo numero: ");
        }
        b = numero.nextInt();
        
        suma = a + b;
        resta = a - b;
        mult = a * b;
        div = a / b;
        
        System.out.println("\nLa suma de los numeros es: " + suma);
        System.out.println("La resta de los numeos es: " + resta);
        System.out.println("La multiplicacion de los numeros es: " + mult);
        System.out.println("La division de los numeros es: " + div);
        
        
    }
    
}
