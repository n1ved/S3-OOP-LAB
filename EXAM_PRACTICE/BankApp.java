/*
 * Write a java program to design a GUI for bank transactions with three textboxes 
 * to enter account number , Account Holder name , and ammount to be withdrawn.
 * and withdraw button . On clicking the withdraw button , if the ammount withdrawn is above 25000,
 * Display a Message "The Limit Exceeded" , Otherwise "The Transaction Success" . Save the details in a file
 * called bankdetails.txt
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileOutputStream;

public class BankApp {
    JFrame frame;
    JTextField accNumField , accNameField , amountWithdrawnField;
    JButton withdrawButton;
    JLabel statusLabel , accNameLabel , accNumLabel , amountWithdrawnLabel;
    float amtWithdrawn = 0;
    BankApp(){
        frame = new JFrame("Bank Transaction");
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(8,1));

        accNumLabel = new JLabel("Enter Account Number");
        accNumField = new JTextField();
        accNameLabel = new JLabel("Enter Account Holder Name");
        accNameField = new JTextField();
        amountWithdrawnLabel = new JLabel("Enter Amount to Withraw");
        amountWithdrawnField = new JTextField();
        statusLabel = new JLabel();

        withdrawButton = new JButton("Withdraw");
        withdrawButton.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    amtWithdrawn = Float.parseFloat(amountWithdrawnField.getText());
                    if(amtWithdrawn > 25000){
                        statusLabel.setText("Transaction Limit Exceeded");
                    }
                    else{
                        statusLabel.setText("Transaction Successful");
                        try{
                            File file = new File("bankdetails.txt");
                            FileOutputStream fos = new FileOutputStream(file);
                            StringBuilder str = new StringBuilder();
                            str.append("Account Number      : "+accNumField.getText()+"\n");
                            str.append("Account Holder Name : "+accNameField.getText()+"\n");
                            str.append("Ammount Withdrawn   : "+amtWithdrawn+"\n");
                            for(int i =0 ; i<str.length() ; i++)
                                fos.write(str.charAt(i));
                            fos.close();

                        }
                        catch(Exception e){
                            System.out.println(e.getStackTrace());
                        }
                    }
                };
            }
        );

        frame.add(accNumLabel);
        frame.add(accNumField);
        frame.add(accNameLabel);
        frame.add(accNameField);
        frame.add(amountWithdrawnLabel);
        frame.add(amountWithdrawnField);
        frame.add(withdrawButton);
        frame.add(statusLabel);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new BankApp();
    }
}
