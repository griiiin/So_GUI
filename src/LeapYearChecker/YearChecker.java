package LeapYearChecker;

import javax.swing.*;

public class YearChecker extends JFrame {
    private JPanel mainPanel;
    private JTextField tfYear;
    private JButton btnCheckYear;
    private JPanel inputPanel;

    public YearChecker() {
        YearChecker yc = this;
        btnCheckYear.addActionListener(e-> {
            int input;
            input = Integer.parseInt(tfYear.getText());
            if (input%4==0 && !(input%100==0)) {
                JOptionPane.showMessageDialog(null, "Leap year");
            } else {
                JOptionPane.showMessageDialog(null, "Not a leap year");
            }
        });
    }



    public static void main(String[] args) {
        YearChecker yc = new YearChecker();
        yc.setContentPane(yc.mainPanel);
        yc.setVisible(true);
        yc.setSize(300,150);
        yc.setTitle("Leap Year Checker");
        yc.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
