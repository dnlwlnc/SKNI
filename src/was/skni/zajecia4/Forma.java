package was.skni.zajecia4;

import sun.rmi.server.InactiveGroupException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by Daniel on 27.04.2017.
 */
public class Forma {
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JTextField imieTF;
    private JTextField nazwiskoTF;
    private JTextField dzienTF;
    private JTextField pieniadzeTF;
    private JTextField miesiacTF;
    private JTextField rokTF;
    private JButton dodajButton;
    private JTextField idNumberTF;
    private JButton szukajButton;
    private JTextField sprawdzImieTF;
    private JTextField sprawdzPieniadzeTF;
    private JTextField sprawdzStanPosiadaniaTF;
    private JTextField autorTF;
    private JTextField cenaTF;
    private JButton dodajKsiazkeButton;
    private JComboBox comboBox1;
    private JTextField sprawdzAutorTF;
    private JTextField sprawdzCenaTF;
    private JButton kupButton;

    private Pracownik p = new Pracownik("Waldek", "Waldiemar", new Date(1987, 4, 29), 2500, 1000);

    public void init() {
        dodajButton.addActionListener(new dodajKupujacegoAL());
        szukajButton.addActionListener(new szukajKupujacegoAL());
        dodajKsiazkeButton.addActionListener(new dodajKsiazkeAL());
        comboBox1.addActionListener(new comboBoxAL());
        kupButton.addActionListener(new kupAL());
    }

    private class dodajKupujacegoAL implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String imie = imieTF.getText();
                String nazwisko = nazwiskoTF.getText();
                int rok = Integer.parseInt(rokTF.getText());
                int dzien = Integer.parseInt(dzienTF.getText());
                int miesiac = Integer.parseInt(miesiacTF.getText());
                int pieniadze = Integer.parseInt(pieniadzeTF.getText());
                Kupujacy kupujacy = new Kupujacy(imie, nazwisko, new Date(rok, miesiac, dzien), pieniadze);

            } catch (NumberFormatException ne) {
                JOptionPane.showMessageDialog(panel1, "Niepoprawna data");
            }
        }
    }

    private class szukajKupujacegoAL implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                Kupujacy kupujacy = Kupujacy.findById(Integer.parseInt(idNumberTF.getText()));
                sprawdzImieTF.setText(kupujacy.getFirstName());
                sprawdzPieniadzeTF.setText(Integer.toString(kupujacy.getMoney()));
                sprawdzStanPosiadaniaTF.setText(String.valueOf(kupujacy.getBooksBought().size()));
            } catch (NumberFormatException ne) {
                JOptionPane.showMessageDialog(panel1, "Niepoprawna data");
            }
        }
    }

    private class dodajKsiazkeAL implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                String autor = autorTF.getText();
                int cena = Integer.parseInt(cenaTF.getText());
                Book ksiazka = new Book(autor, cena);
                p.addBookAvailable(ksiazka);
                comboBox1.addItem(autor);

            } catch (NumberFormatException ne) {
                JOptionPane.showMessageDialog(panel1, "Niepoprawna data");
            }
        }
    }

    private class comboBoxAL implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String autor = (String) comboBox1.getSelectedItem();
                for(int i = 0; i < p.getBooksAvailable().size(); i++) {
                    if (p.getBooksAvailable().get(i).getAuthor() == autor) {
                        sprawdzCenaTF.setText(Integer.toString(p.getBooksAvailable().get(i).getPrice()));
                    }
                }
            } catch (NumberFormatException ne) {
                JOptionPane.showMessageDialog(panel1, "Niepoprawna data");
            }
        }
    }

    private class kupAL implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Kupujacy kup = Kupujacy.findById(Integer.parseInt(idNumberTF.getText()));
                String autor = (String) comboBox1.getSelectedItem();
                Book ksiazka = null;

                for(int i = 0; i < p.getBooksAvailable().size(); i++) {
                    if (p.getBooksAvailable().get(i).getAuthor() == autor) {
                        ksiazka = p.getBooksAvailable().get(i);
                    }
                }

                kup.buyBook(ksiazka, p);
                comboBox1.removeItem(autor);
            } catch (NumberFormatException ne) {
                JOptionPane.showMessageDialog(panel1, "Niepoprawna data");
            }
        }
    }



    public JPanel getPanel1() {
        return panel1;
    }
}
