/*************************************
*Luis Uriel Victoriano Juárez
InputData.java

This program displays a personalized Helo greeting
**************************************/

import java.util.Scanner;

public class InputData{
  public static void main(String[]args){
    Scanner userData = new Scanee(System.in);
    String name;
    System.out.println("Enter your name");
    name = userData.nextLine();

    System.out.println("Hello"+ " ! ");
  }
}
