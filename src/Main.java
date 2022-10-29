
import javax.swing.*;


public class Main extends JFrame {
    public static void main(String[] args) {
        Logic calc = new Logic();
        calc.pack();
        calc.setLocationRelativeTo(null);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);
    }
}