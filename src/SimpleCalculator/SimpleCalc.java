package SimpleCalculator;

import javax.swing.*;

public class SimpleCalc extends JFrame {

    private JPanel mainPanel;
    private JButton btnCompute;
    private JTextField tfNumber1;
    private JPanel buttonPanel;
    private JPanel fieldPanel;
    private JPanel num1Panel;
    private JPanel operatorPanel;
    private JPanel num2Panel;
    private JPanel resultPanel;
    private JComboBox cbOperations;
    private JPanel calcPanel;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalc() {
        SimpleCalc c = this;
        btnCompute.addActionListener(e-> {
            int num1 = Integer.parseInt(tfNumber1.getText());
            int num2 = Integer.parseInt(tfNumber2.getText());
            int ans;
            if (cbOperations.getSelectedItem() == "+") {
                ans = num1 + num2;
            } else if (cbOperations.getSelectedItem() == "-") {
                ans = num1 - num2;
            } else if (cbOperations.getSelectedItem() == "*") {
                ans = num1 * num2;
            } else {
                ans = num1 / num2;
            }
            lblResult.setText(String.valueOf(ans));
        });
    }
    public static void main(String[] args) {
        SimpleCalc c = new SimpleCalc();
        c.setContentPane(c.mainPanel);
        c.setVisible(true);
        c.setSize(700,250);
        c.setTitle("Simple Calculator");
        c.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
