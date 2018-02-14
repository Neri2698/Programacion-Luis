/**********************************
FreeFries.java

Luis Uriel Victoriano Juarez
This program reads points scored by home team and the oppsing team and determines IF the fans win free french fries

**********************************/
import javax.swing.JOptionPane;
//Para ultilizar modo grafico GUI

public class FreeFries{
  public static void main(String[]args){
    int homePoints; //pointd scored by home team
    int opponentPoints; //points scored by opposing team

    homePoints = Integer.parseint(JOptionPane.ShowInputDialog("Enter home points"));

    opponentPoints = Integer.parseint(JOptionPane.ShowInputDialog("Enter opponent points"));

    if (homePoints > opponentPonits && homePoints >= 100) {
      JOptionPane.ShowInputDialog(null, "A free order of French Fries for White Tigers Fans");

    }
}
