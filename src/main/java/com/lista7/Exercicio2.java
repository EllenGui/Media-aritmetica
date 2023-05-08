package com.lista7;
import java.util.Scanner;

public class Exercicio2
{
    public static void main( String[] args )
    {
    Scanner leia = new Scanner (System.in);
    double num1,num2,soma,media;
    System.out.println("Informe o primeiro número: ");  
    num1 = leia.nextDouble();  
    System.out.println("Informe o segundo número: ");
    num2 = leia.nextDouble();
    soma = num1 + num2;
    media = soma/2;
    System.out.println("A media dos numeros informados é de: " + media);
    leia.close();
    }

    public double num1(double num1) {
        return num1;
    }

    public double num2(double num2) {
        return num2;
    }

    public double soma(double num1 , double num2) {
        return num1+num2;
    }

    public double media(double soma) {
        return soma/2;
    }

   
}
    
