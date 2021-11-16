package Demo;
import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("EXO JAVA");
        f.setSize(390, 550);
        f.setLocation(100, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel labelAnnee = new JLabel("Veuillez rentrer une année");
        labelAnnee.setBounds(50, 50, 200, 30);
        JTextField anneeField = new JTextField();
        anneeField.setBounds(50, 100, 200, 30);
        JLabel labelFinalAnee = new JLabel();
        labelFinalAnee.setBounds(50, 150, 200, 30);
        JButton buttonAnnee=new JButton("Bisextile ?");
        buttonAnnee.setBounds(50,200,95,30);
        buttonAnnee.addActionListener(e -> testBis(anneeField, labelFinalAnee));
        JLabel labelPremier = new JLabel("Veuillez rentrer un nombre");
        labelPremier.setBounds(50, 250, 200, 30);
        JTextField premierField = new JTextField();
        premierField.setBounds(50, 300, 200, 30);
        JLabel labelFinalPremier = new JLabel();
        labelFinalPremier.setBounds(50, 350, 300, 30);
        JButton buttonPremier=new JButton("Premier ?");
        buttonPremier.setBounds(50,400,95,30);
        buttonPremier.addActionListener(e -> testPremier(premierField, labelFinalPremier));
        f.add(buttonAnnee);
        f.add(labelAnnee);
        f.add(labelFinalAnee);
        f.add(anneeField);
        f.add(labelPremier);
        f.add(premierField);
        f.add(labelFinalPremier);
        f.add(buttonPremier);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void testBis(JTextField anneeField, JLabel labelFinalAnee)
    {
        if (Integer.parseInt(anneeField.getText()) % 4 == 0 && Integer.parseInt(anneeField.getText()) % 100 != 0 || Integer.parseInt(anneeField.getText()) % 400 == 0) {
            labelFinalAnee.setText("Année bisextile !");
        } else {
            labelFinalAnee.setText("Année non bissextile !");
        }
    }

    public static void testPremier(JTextField premierField, JLabel labelFinalPremier)
    {
        int b = Integer.parseInt(premierField.getText());
        boolean isPrime = true;

        if (b == 1)
        {
            labelFinalPremier.setText("Par contre 1 c'est illégal ça mon reuf");
        }

        else if (b > 1)
        {
            for (int i = 2; i < b; i++) {
                if (b % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                labelFinalPremier.setText(b + " est un nombre premier");
            } else {
                labelFinalPremier.setText(b + " n'est pas un nombre premier");
            }
        }

        else {
            labelFinalPremier.setText("Le nombre n'est pas un nombre premier");
        }

    }
}

