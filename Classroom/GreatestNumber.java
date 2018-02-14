/********************************************
GreatesNumber.java

Luis Uriel Victoriano Juarez
This program finds the greatest of three nnumbers
**********************************************/
import javax.swing.JOptionPane;
public class GreatestNumber{
  public static void main(String[] args){
    double numberOne, numberTwo, numberThree;
    numberOne = Double.parseDouble(JOptionPane.showInputDialog("Entey the first number"));
    //30
    numberTwo = Double.parseDouble(JOptionPane.showInputDialog("Entry the second number"));
    //10
    numberThree = Double.parseDouble(JOptionPane.showInputDialog("Entry the third number"));
    //80

    if (numberOne > numberTwo){
      if (numberOne > numberThree){
        JOptionPane.showMessageDialog(null, "The greatest number is" + numberOne);

      }//end if
    }//end if
    if (numberTwo > numberOne){
      if (numberTwo > numberThree){
        JOptionPane.showMessageDialog(null, "The greatest number is" + numberTwo);

      }//end if
    }//end if
    if (numberThree > numberOne){
      if (numberThree > numberTwo){
        JOptionPane.showMessageDialog(null, "The greatest number is" + numberThree);
      }//end if
    }//end if
    /*
    if (numberOne > numberTwo){
      if (numerOne > numberThree){
        JOptionPane.showMessageDialog(null, "The greatest number is" + numerOne);

      }//end if
    }//end if
    if (numberTwo > numerOne){
      if (numberTwo > numberThree){
        JOptionPane.showMessageDialog(null, "The greatest number is" + numerTwo);

      }//end if
    }//end if
    if (numberThree > numberOne){
      if (numberThree > numberTwo){
        JOptionPane.showMessageDialog(null, "The greatest number is" + numberThree);
      }//end if
    }//end if
    */
    if (numberOne > numberTwo && numberOne > numberThree){
      JOptionPane.showMessageDialog(null, "The greatest number is" + numberOne);
    }else if(numberTwo > numberOne && numberTwo > numberThree){
      JOptionPane.showMessageDialog(null, "The greatest number is" + numberTwo);
    }else if(numberThree > numberOne && numberThree > numberTwo){
      JOptionPane.showMessageDialog(null, "The greatest number is" + numberThree);
    }
   }
  }
