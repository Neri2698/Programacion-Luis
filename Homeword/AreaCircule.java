/*****************************
AreaCircule.java

This program calculate the area of a circule
******/

import java.util.Scanner;
public class AreaCircule{
  public static void main (String[]args){
    Scanner userData= new Scanner (System.in);
    double R;
    System.out.print("Introduzca el radio: ");
    R = userData.nextDouble();
    double resultado;
    resultado= 3.1416*(R*R);
    System.out.println("El area del circulo es: " + resultado);
  }
}
