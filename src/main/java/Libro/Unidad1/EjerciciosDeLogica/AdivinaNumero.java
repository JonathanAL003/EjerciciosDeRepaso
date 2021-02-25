/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Unidad1.EjerciciosDeLogica;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Jonathan AL
 */
public class AdivinaNumero 
{
    public static void main(String[] args)
    {
        Random r = new Random();
        int A = r.nextInt(1000); // genera un número entre 0 y 999
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int B = 0;
        System.out.println("Adivina el número secreto entre 0 y 999. ¿Que número es?");
        B = scanner.nextInt();       
        while (A != B)
        {
            i++; // incrementa variable contador
            if (A > B) 
            {
                System.out.println("El número a adivinar es más grande. Intentelo otra vez");
                B = scanner.nextInt();
            } 
            else 
            {
		System.out.println("El número a adivinar es más chico. Intentelo otra vez");
                B = scanner.nextInt();
            }
        }
        System.out.println("Felicitaciones ha dado con el número en " + i + " intentos");
    }
}
