package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class OrderSystem extends JFrame {

    private JPanel mainPanel;
    private JButton btnOrder;
    private JPanel btnPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public OrderSystem() {
        btnOrder.addActionListener(e-> {
            double price = 0;
            if (cPizza.isSelected()) price+=100;
            if (cBurger.isSelected()) price+=80;
            if (cFries.isSelected()) price+=65;
            if (cSoftDrinks.isSelected()) price+=55;
            if (cTea.isSelected()) price+=50;
            if (cSundae.isSelected()) price+=40;
            if (rb5.isSelected()) price-=price/20;
            if (rb10.isSelected()) price-=price/10;
            if (rb15.isSelected()) price-=3*price/20;
            JOptionPane.showMessageDialog(null, "The total price is Php" + price);
        });
    }

    public static void main(String[] args) {
        OrderSystem os = new OrderSystem();
        os.setContentPane(os.mainPanel);
        os.setVisible(true);
        os.setSize(400,400);
        os.setTitle("Food Ordering System");
        os.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
