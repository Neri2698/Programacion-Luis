/*
EXAM
DIEGO PEREZ CARRILLO
LUIS URIEL VICTORIANO JUAREZ
THIS IS THE CLASS THAT IMPLEMENTS THE CLASSES BELONGING TO APPLIANCES
*/
import javax.swing.*;
public class ImplementElectrodomesticos{

    public static void main(String[] args) {
        Electrodomestico listaElectrodomesticos[]=new Electrodomestico[10];
        listaElectrodomesticos[0]=new Electrodomestico();
        listaElectrodomesticos[1]=new Lavadora(150, 30);
        listaElectrodomesticos[2]=new Television(500, 80, 'E', "BLACK", 42, false);
        listaElectrodomesticos[3]=new Electrodomestico();
        listaElectrodomesticos[4]=new Electrodomestico(600, 20, 'D', "GRAY");
        listaElectrodomesticos[5]=new Lavadora(300, 40, 'Z', "WHITE", 40);
        listaElectrodomesticos[6]=new Television(250, 70);
        listaElectrodomesticos[7]=new Lavadora(400, 100, 'A', "GREEN", 15);
        listaElectrodomesticos[8]=new Television(200, 60, 'C', "ORANGE", 30, true);
        listaElectrodomesticos[9]=new Electrodomestico(50, 10);

        double sumaElectrodomesticos=0;
        double sumaTelevisiones=0;
        double sumaLavadoras=0;

        for(int i=0;i<listaElectrodomesticos.length;i++){

            if(listaElectrodomesticos[i] instanceof Electrodomestico){
                sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Lavadora){
                sumaLavadoras+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Television){
                sumaTelevisiones+=listaElectrodomesticos[i].precioFinal();
            }
        }
        JOptionPane.showMessageDialog(null,"the total sum of the appliances is "+sumaElectrodomesticos);
        JOptionPane.showMessageDialog(null,"the total amount of the washing machines sum is "+sumaLavadoras);
        JOptionPane.showMessageDialog(null,"the total of thesum of the prices of the televisions is "+sumaTelevisiones);
        JOptionPane.showMessageDialog(null,"the total sum is "+(sumaElectrodomesticos+sumaLavadoras+sumaTelevisiones));
    }//end main
}//end class ImplementElectrodomesticos
