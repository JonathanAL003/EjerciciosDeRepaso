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
public class NumerosIguales 
{
    public static void main(String[] args)
    {
        double Numero1, Numero2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Capture el primer numero: ");
        Numero1 = scanner.nextDouble();
        System.out.println("Capture el segundo numero: ");
        Numero2 = scanner.nextDouble();
        if (Numero1 == Numero2) 
        {
            System.out.println("Son el mismo numero " + Numero1  +" - " + Numero2);
        }
        else
        {
            System.out.println("Son distintos numeros " + Numero1  +" - " + Numero2);
        }        
    }
}
