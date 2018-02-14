/******************************
AreaOfRectangule

Luis Uriel Victoriano Juarez

This program calculate the area of ​​a rectangle
******************************/

import java.util.Scanner;
public class AreaOfRectangule{
  public static void main (String[]args)
  {
    Scanner userData= new Scanner (System.in);
    double A;
    System.out.print("Introduzca la altura:");
    A = userData.nextDouble();
    double B;
    System.out.print("Introduzca la base:");
    B = userData.nextDouble();
    double resultado;
    resultado=(B)*(A);
    System.out.println("El area del rectangulo es:" + resultado);
  }
}
