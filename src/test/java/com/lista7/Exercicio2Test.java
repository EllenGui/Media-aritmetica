package com.lista7;

import org.junit.Test;


public class Exercicio2Test {
  @Test 
  public void testeSegundaAtv(){
    Exercicio2 tSegundaAtv = new Exercicio2();
    double num1 = tSegundaAtv.num1(5.5);
    double num2 = tSegundaAtv.num2(5.5);
    double soma = tSegundaAtv.soma(num1, num2);
    double media = tSegundaAtv.media(soma/2);
    
  }  
}