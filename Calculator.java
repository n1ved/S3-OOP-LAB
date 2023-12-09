import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;

public class Calculator {
    JFrame frame;
    JButton addButton;
    JButton subButton;
    JButton divButton;
    JButton multiButton;
    JTextField inputOne;
    JTextField inputTwo;
    JLabel resultLabel;
    Calculator(){
        frame = new JFrame("Swing Calculator");

        frame.setSize(500 , 500);
        frame.setLayout(null);

        inputOne = new JTextField();
        inputTwo = new JTextField();

        inputOne.setBounds(175,50,150, 50);
        inputTwo.setBounds(175,110,150, 50);

        addButton = new JButton("+");
        subButton = new JButton("-");
        divButton = new JButton("/");
        multiButton = new JButton("*");

        addButton.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    int a = Integer.parseInt(inputOne.getText());
                    int b = Integer.parseInt(inputTwo.getText());
                    int r = a+b;
                    resultLabel.setText(r+"");
                }
            }
        );
        subButton.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    int a = Integer.parseInt(inputOne.getText());
                    int b = Integer.parseInt(inputTwo.getText());
                    int r = a-b;
                    resultLabel.setText(r+" ");
                }
            }
        );
        divButton.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    int a = Integer.parseInt(inputOne.getText());
                    int b = Integer.parseInt(inputTwo.getText());
                    try{
                        int r = a/b;
                        resultLabel.setText(r+" ");
                    }
                    catch(Exception er){
                        resultLabel.setText("Error : "+er.getMessage());
                    }
                }
            }
        );
        multiButton.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    int a = Integer.parseInt(inputOne.getText());
                    int b = Integer.parseInt(inputTwo.getText());
                    int r = a*b;
                    resultLabel.setText(r+" ");
                }
            }
        );

        addButton.setBounds(150, 200, 50, 50);
        subButton.setBounds(200, 200, 50, 50);
        multiButton.setBounds(250, 200, 50, 50);
        divButton.setBounds(300, 200, 50, 50);

        JLabel titleLabel = new JLabel("Result");
        resultLabel = new JLabel();
        
        titleLabel.setBounds(50 , 275 , 100 , 50);
        resultLabel.setBounds(50, 300, 400, 50);

        frame.add(inputOne);
        frame.add(inputTwo);
        frame.add(addButton);
        frame.add(subButton);
        frame.add(divButton);
        frame.add(multiButton);
        frame.add(resultLabel);
        frame.add(titleLabel);

        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Calculator();
    }
}
