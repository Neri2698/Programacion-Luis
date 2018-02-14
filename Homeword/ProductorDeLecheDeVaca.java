/**************************************
LecheDeVaca.java

Luis Uriel Victoriano Juarez


This program calculates when you are paid to deliver gallons of milk
 ************************************/
import java.util.Scanner;
public class ProductorDeLecheDeVaca{
  public static void main(String[]args){
    int litros;
    final double litrosDeUnGalon =3.785;
    int precioDeUnGalon;
    double ganancia;
    System.out.println("Cantidad de litros que entregara: ");
    Scanner L= new Scanner (System.in);
    litros = L.nextInt();
    final double galones= litros/litrosDeUnGalon;
    System.out.println("Produce "+galones+" Galones ");
    System.out.println("Ingresa el precio del galon");
    Scanner PG= new Scanner (System.in);
    precioDeUnGalon=PG.nextInt();
    ganancia= galones*precioDeUnGalon;
    System.out.println("Ganancia por la entrega de la leche es de: "+ganancia);
  }
}
