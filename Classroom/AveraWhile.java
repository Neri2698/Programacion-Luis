/******************************************
AveraWhile.java

Luis Uriel Victoriano Juarez

This program calculates the average of ten grates
********************************************/
import javax.swing.JOptionPane;
  public class AveraWhile{
    public static void main(String[] args){
    int counter = 1, totalStudens;
    double score =0, totalScore =0, averageScore =0;


    totalStudens = Integer.parseInt(JOptionPane.showInputDialog("Enter number of studens"));

    while(counter <= totalStudents){
      score = Double .paeseDouble(JOptionPane.showInputDialog("Enter the score" +  counter));
      totalStudents += socre;
      counter ++;
    }
    averageScore = totalScore / totalStudents;
    JOptionPane.showMessageDialog(null, "The average is"+ averageScore);
  }
}
