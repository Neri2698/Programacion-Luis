/***************************************
 WhileLoop.java
whhile=mientras
 Luis Uriel Victoriano Juarez
 This program makes entries in a brital registry
  *************************************/

  import javax.swing.JOptionPane;
  public class WhileLoop{
    public static void main (String[] args) {
    String registry = "";
    char more;
    String mad;


    more = JOptionPane.showInputDialog("Do you want to create a bridal registry? (y/n)").charAt (0);
    while (more  == 'y'){
      registry += JOptionPane.showInputDialog("Enter item");
      registry += JOptionPane.showInputDialog("Enter store \n");
      more = JOptionPane.showInputDialog("Any more items? (y/n") . charAt(0);
      if (!registry.equals("") ){
        JOptionPane.showInputDialog(null, "\n Bridal regustry\n "+ registry );
      }
      // end whhile
    }
  }
}
