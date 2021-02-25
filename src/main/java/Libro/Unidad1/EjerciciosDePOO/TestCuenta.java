/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Unidad1.EjerciciosDePOO;

/**
 *
 * @author Jonathan AL
 */
public class TestCuenta 
{
    public static void main(String[] args) 
    {
         
        Cuenta cuenta_1 = new Cuenta("Pedro", 300);
        Cuenta cuenta_2 = new Cuenta("Fernando", 300);
         
        //Ingresa dinero en las cuentas
        cuenta_1.ingresar(300);
        cuenta_2.ingresar(400);
         
        //Retiramos dinero en las cuentas
        cuenta_1.retirar(500);
        cuenta_2.retirar(100);
         
        //Muestro la informacion de las cuentas
        System.out.println(cuenta_1); 
        System.out.println(cuenta_2);
         
    }
}
