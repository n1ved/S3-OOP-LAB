import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class TrafficSignal implements ActionListener{
    JFrame frame;
    JButton red, yellow, green;
    JRadioButton redButton, yellowButton, greenButton;
    TrafficSignal(){
        frame = new JFrame("Traffic Signal");
        frame.setSize(500 , 500);
        frame.setLayout(null);
        red = new JButton("");
        yellow = new JButton("");
        green = new JButton("");

        red.setBounds(225, 50, 50, 50);
        yellow.setBounds(225, 100, 50, 50);
        green.setBounds(225, 150, 50, 50);

        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        redButton.setBounds(150, 200, 100, 50);
        yellowButton.setBounds(250, 200, 100, 50);
        greenButton.setBounds(350, 200, 100, 50);

        ButtonGroup bg = new ButtonGroup();
        bg.add(redButton);
        bg.add(yellowButton);
        bg.add(greenButton);

        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        frame.add(red);
        frame.add(yellow);
        frame.add(green);
        frame.add(redButton);
        frame.add(yellowButton);
        frame.add(greenButton);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(redButton.isSelected()){
            red.setBackground(Color.RED);
            yellow.setBackground(Color.WHITE);
            green.setBackground(Color.WHITE);
        }
        else if(yellowButton.isSelected()){
            red.setBackground(Color.WHITE);
            yellow.setBackground(Color.YELLOW);
            green.setBackground(Color.WHITE);
        }
        else if(greenButton.isSelected()){
            red.setBackground(Color.WHITE);
            yellow.setBackground(Color.WHITE);
            green.setBackground(Color.GREEN);
        }
    }
    public static void main(String[] args) {
        new TrafficSignal();
    }
}
