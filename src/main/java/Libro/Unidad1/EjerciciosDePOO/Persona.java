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
public class Persona 
{
    private String nombre;
    private int edad;
    private final String RFC;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() 
    {
        nombre = "";
        edad = 0;
        RFC = generaRFC(); 
        sexo = 'H';
        peso = 0.0;
        altura = 0.0;
    }

    public Persona(String nombre, int edad, char sexo) 
    { 
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.RFC = generaRFC();
        this.sexo = 'H';
        //this.peso = 0.0;
        //this.altura = 0.0;
    }

    public Persona(String nombre, int edad, String RFC, char sexo, double peso, double altura) 
    { 
        this.nombre = nombre;
        this.edad = edad;
        this.RFC = generaRFC();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void calcularIMC() 
    {
        final int DEBAJO_PESO_IDEAL = -1;
        final int PESO_IDEAL = 0;
        final int SOBREPESO = 1;
        double imc;

        imc = peso / altura * altura;

        if (imc < 18.5) 
        {
            //System.out.println(DEBAJO_PESO_IDEAL);
            System.out.println("DEBAJO DEL PESO IDEAL");
        } 
        else if (imc >= 18.5 && imc <= 25) 
        {
            //System.out.println(PESO_IDEAL);
            System.out.println("PESO IDEAL");
        } 
        else 
        {
            //System.out.println(SOBREPESO);
            System.out.println("SOBREPESO");
        }

    }

    public boolean esMayorDeEdad() 
    {
        if (edad >= 18) 
        {
            System.out.println("Es mayor de edad");
            return true;
        } 
        else 
        {
            System.out.println("Es menor de edad");
            return false;
        }
    }

    private void comprobarSexo(char sexo) 
    {
        if (sexo != 'H' || sexo != 'M') 
        {
            sexo = 'H';
        }
    }

    public String toString(String nombre, int edad, String RFC, char sexo, double peso, double altura) 
    {
        return nombre + " / " + edad + " / " + RFC + " / " + sexo + " / " + peso + " / " + altura;
    }
    
    public String toString() 
    {
        return nombre + " / " + edad + " / " + RFC + " / " + sexo + " / " + peso + " / " + altura;
    }
    
    public String toString(String nombre, int edad, char sexo)
    {
        return nombre + " / " + edad + " / " + sexo;
    }

    /*private String generaRFC() 
    {
        double numero;
        int numero2;
        int rfcrandom=0;
        char letra;
        String juegoCaracteres;
        String nif;

        for (int i = 0; i < 8; i++) 
        {
            numero = Math.floor(Math.random() * (0 - 9) + 9);
            numero2 = (int) numero;
            rfcrandom = rfcrandom*10+numero2;           
        }               
        juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKET";
        int modulo = rfcrandom % 23;
        letra = juegoCaracteres.charAt(modulo);
        nif = (""+rfcrandom+letra+"");
       
        return nif; 
    }*/
    
    private String generaRFC() 
    {
        double numero,numero3;
        int numero2,numero1;
        int rfcrandom=0;
        char letra;
        String cad = " ";
        String juegoCaracteres;
        String nif;
        for (int i = 0; i < 4; i++) 
        {
            numero3 = Math.floor(Math.random() * (1 - 26) + 26);
            numero1 = (int) numero3;
            letra=(char)numero1;
            cad = cad + letra;
                       
        }
        for (int i = 0; i < 6; i++) 
        {
            numero = Math.floor(Math.random() * (0 - 9) + 9);
            numero2 = (int) numero;
            rfcrandom = rfcrandom*10+numero2;           
        }               
        nif = (""+ cad + rfcrandom +"");
       
        return nif;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public void setEdad(int edad) 
    {
        this.edad = edad;
    }

    public void setSexo(char sexo) 
    {
        this.sexo = sexo;
    }

    public void setPeso(double peso) 
    {
        this.peso = peso;
    }

    public void setAltura(double altura) 
    {
        this.altura = altura;
    }
}
