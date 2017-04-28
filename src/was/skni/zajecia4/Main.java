package was.skni.zajecia4;

import javax.swing.*;

/**
 * Created by Daniel on 27.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Ksiegarnia");
        Forma forma = new Forma();
        forma.init();
        mainFrame.setContentPane(forma.getPanel1());
        mainFrame.pack();
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
