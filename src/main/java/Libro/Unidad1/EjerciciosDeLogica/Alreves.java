/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Unidad1.EjerciciosDeLogica;

import java.util.Scanner;
/**
 *
 * @author Jonathan AL
 */
public class Alreves 
{
    public static void main(String[] args)
    {
        int A=-1;
        int UM,C,D,U;
        Scanner scanner = new Scanner(System.in);
       
        A=0;
        System.out.println("Capture un numero entre 0 y 9,999: ");
        A = scanner.nextInt();
            
        if (A<0 && A>9999) 
        {
            System.out.println("Numero fuera de rango");
        }
        else
        {
            if (A>=0 && A<=9) 
            {
                U=A;
                System.out.println (U);
            }
            if (A>=10 && A<=99) 
            {
                U = A % 10;
                A = A / 10;
                // decenas
                D = A % 10;
                A = A / 10;
                    
                System.out.println (U + "" + D);
            }
            if (A>=100 && A<=999) 
            {
                U = A % 10;
                A = A / 10;
                // decenas
                D = A % 10;
                A = A / 10;
                // centenas
                C = A % 10;
                A = A / 10;
                   
                System.out.println (U + "" + D + "" + C);
            }
            if (A>=1000 && A<=9999) 
            {
                U = A % 10;
                A = A / 10;
                // decenas
                D = A % 10;
                A = A / 10;
                // centenas
                C = A % 10;
                A = A / 10;
                // unidades de millar
                UM = A % 10;
                A = A / 10;
                    
                System.out.println (U + "" + D + "" + C + "" + UM);
            }
        }      
    }
}
