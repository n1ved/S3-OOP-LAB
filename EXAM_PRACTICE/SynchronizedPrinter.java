import javax.swing.*;
import java.awt.event.*;
public class SynchronizedPrinter {
    JFrame frame;
    JTextField textField;
    JButton button;
    static int n = 0;

    static void printDataSync(String data){
        for(int i=0 ; i<n ; i++){
            System.out.println(data);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    class ThrikkakaraThread extends Thread{
        public void run(){
            printDataSync("Thrikkakara");
        }
    }

    class KochiThread extends Thread{
        public void run(){
            printDataSync("Kochi");
        }
    }

    SynchronizedPrinter(){
        frame = new JFrame();
        frame.setSize(300,200);

        textField = new JTextField();
        textField.setBounds(50,0,200,50);

        button = new JButton("Print");
        button.setBounds(75,50,100,50);

        button.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    ThrikkakaraThread tt = new ThrikkakaraThread();
                    KochiThread kt = new KochiThread();
                    n = Integer.parseInt(textField.getText());
                    tt.start();
                    kt.start();
                }
            }
        );

        frame.add(textField);
        frame.add(button);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SynchronizedPrinter();
    }
}
