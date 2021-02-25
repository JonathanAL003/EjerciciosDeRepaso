/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Unidad1.Ejercicios;

import java.util.Scanner;
/**
 *
 * @author Jonathan AL
 */
public class Circunferencia 
{
    public static void main(String[] args)
    {
        double radio,circunferencia;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Capture el radio del circulo: ");
        radio = scanner.nextDouble();
        circunferencia = 2 * radio * Math.PI;
        System.out.println("La circunferencia del cirulo es: " + circunferencia);
    }
}
