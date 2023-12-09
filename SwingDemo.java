import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingDemo implements ActionListener{
    JFrame frame= new JFrame("Calculator");
    JButton button = new JButton("+");
    final JTextField num1Field = new JTextField();
    final JTextField num2Field = new JTextField();
    JLabel resLabel = new JLabel();
    SwingDemo(){
        
        num1Field.setBounds(100 , 120 , 100 , 50);
        num2Field.setBounds(100,170,100,50);
        button.setBounds(175, 230 , 100, 50);
        button.addActionListener(this);
        resLabel.setBounds(100,270,100,30);

        frame.add(num1Field);
        frame.add(num2Field);
        frame.add(button);
        frame.add(resLabel);
        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        try{
            String num1String = num1Field.getText();
            String num2String = num2Field.getText();
            int n1 = Integer.parseInt(num1String);
            int n2 = Integer.parseInt(num2String);
            int r = n1+n2;
            resLabel.setText(num1String + "+" + num2String + " is "+ r);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    public static void main(String[] args) {
      new SwingDemo();
    }
}
