import javax.swing.*;
import java.util.Random;

public class switchCase {

    public static void main(String[]args){

        String benutzerEingabe = JOptionPane.showInputDialog("geben Sie eine Zeichenkette ein");

        switch (benutzerEingabe){
            case "20":{
                int zwanzig = Integer.parseInt(benutzerEingabe);
                JOptionPane.showMessageDialog(null,zwanzig*27);
                break;
            }
            case "Peter Pan":{
                JOptionPane.showMessageDialog(null,"Bangarang");
            }
            default:{
                System.err.println("Fehler");
            }

        }

    }
}
