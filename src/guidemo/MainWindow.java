/*
 * Created by JFormDesigner on Tue Sep 12 11:57:11 EDT 2023
 */

package guidemo;

import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author James
 */
public class MainWindow extends JFrame {
    public MainWindow() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - James
        label2 = new JLabel();
        checkBox1 = new JCheckBox();
        label3 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- label2 ----
        label2.setText("Number Guessing Game");
        contentPane.add(label2, "cell 0 0");

        //---- checkBox1 ----
        checkBox1.setText("Hard Mode");
        contentPane.add(checkBox1, "cell 0 1");

        //---- label3 ----
        label3.setText("Enter a Number Between 1 and 5");
        contentPane.add(label3, "cell 0 2");
        contentPane.add(textField1, "cell 1 2 7 1");

        //---- button1 ----
        button1.setText("Submit Guess");
        contentPane.add(button1, "cell 0 3");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - James
    private JLabel label2;
    private JCheckBox checkBox1;
    private JLabel label3;
    private JTextField textField1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
