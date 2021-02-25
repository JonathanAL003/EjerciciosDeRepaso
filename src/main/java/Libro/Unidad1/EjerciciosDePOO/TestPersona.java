/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Unidad1.EjerciciosDePOO;

import java.util.Scanner;
/**
 *
 * @author Jonathan AL
 */
public class TestPersona 
{
    public static void main(String[] args) 
    {  
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String n = scanner.next();
        System.out.println("Introduce tu edad: ");
        int ed = scanner.nextInt();
        if(ed<0  && ed>115)
         {
             ed = 18; 
         }
        System.out.println("Introduce tu sexo (H o M): ");
        char sx = scanner.next().charAt(0);
        System.out.println("Introduce tu peso: ");
        double p = scanner.nextDouble();
        if (p<1) 
        {
            p= 75;
        }
        System.out.println("Introduce tu altura: ");
        double alt = scanner.nextDouble();
        if (alt<.1) 
        {
            alt = 1.65;
        }

        Persona o1 = new Persona (n, ed, "", sx, p, alt);     
        Persona o2 = new Persona(n, ed, sx);         
        Persona o3 = new Persona();       
       
        System.out.println(o1);
        o1.calcularIMC();
        o1.esMayorDeEdad();
        
        System.out.println(o2);
        o2.calcularIMC();
        o2.esMayorDeEdad();
        
        o3.setNombre("Jonathan");
        o3.setEdad(19);
        o3.setSexo('H');
        o3.setPeso(73);
        o3.setAltura(1.75);
        System.out.println(o3);
        o3.calcularIMC();
        o3.esMayorDeEdad();
       
        /*System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);*/
    }
}
