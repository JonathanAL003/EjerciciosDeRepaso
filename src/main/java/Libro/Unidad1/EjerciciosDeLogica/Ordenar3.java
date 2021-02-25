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
public class Ordenar3 
{
    public static void main(String[] args)
    {
        int A,B,C;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Capture el primer numero: ");
        A = scanner.nextInt();
        System.out.println("Capture el segundo numero: ");
        B = scanner.nextInt();
        System.out.println("Capture el tercer numero: ");
        C = scanner.nextInt();
        if (A>B && B>C) 
        {
            System.out.println(A + ", " + B + ", " + C);
        }
        else
        {
            if (A>C && C>B) 
            {
                System.out.println(A + ", " + C + ", " + B);
            }
            else
            {
                if(B>A && A>C)
                {
                    System.out.println(B + ", " + A + ", " + C);
                }
                else
                {
                    if(B>C && C>A)
                    {
                        System.out.println(B + ", " + C + ", " + A);
                    }
                    else
                    {
                        if(C>A && A>B)
                        {
                            System.out.println(C + ", " + A + ", " + B);
                        }
                        else
                        {
                            if(C>B && B>A)
                            {
                                System.out.println(C + ", " + B + ", " + A);
                            }
                            else
                            {
                                if (A==B && B==C) 
                                {
                                     System.out.println("Es el mismo numero: " +A);
                                }
                                else
                                {
                                    if (A==B && A>C) 
                                    {
                                        System.out.println(A + ", " + B + ", " + C);
                                    }
                                    else
                                    {
                                        if (A==B && A<C) 
                                        {
                                            System.out.println(C + ", " + A + ", " + B);
                                        }
                                        else
                                        {
                                            if (A==C && A>B) 
                                            {
                                                System.out.println(A + ", " + C + ", " + B);
                                            }
                                            else
                                            {
                                                if (A==C && A<B) 
                                                {
                                                    System.out.println(B + ", " + A + ", " + C);
                                                }
                                                else
                                                {
                                                    if (B==C && A>B) 
                                                    {
                                                        System.out.println(A + ", " + B + ", " + C);
                                                    }
                                                    else
                                                    {
                                                        if (B==C && A<B) 
                                                        {
                                                            System.out.println(B + ", " + C + ", " + A);
                                                        }                                                        
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }  
    }
}
