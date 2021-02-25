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
public class Cuadratica 
{
    public static void main(String[]args)
    {
        double a,b,c, determinante,x1,x2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Capture el coeficiente a:");
        a = entrada.nextDouble();
        System.out.println("Capture el coeficiente b:");
        b = entrada.nextDouble();
        System.out.println("Capture el coeficiente c:");
        c = entrada.nextDouble();
        
        determinante = Math.pow(b,2) - (4*a*c); //(b*b) - (4*a*c);
        if(determinante >= 0)
        {
            x1 = (-b + Math.sqrt(determinante) / (2*a));
            x2 = (-b - Math.sqrt(determinante) / (2*a));
            System.out.println("Solucion de x1: " + x1);
            System.out.println("Solucion de x2: " + x2);
        }
        else
        {
            System.out.println("No existen soluciones reales para el problema");
        }
            
    }
}
