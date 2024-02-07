/*
 *  Write a java Program taht reads the following data from a textfield on clicking "save" button
 *  and saves it to a file called "inputdata.txt" and do the following:
 *      Java is a popular programming language, created in 1995.
 *      It is owned by Oracle, and more than 3 billion devices run Java.
 *      Java is an object oriented programming language.
 *  Once the lines are written, write a function named displayfiledetails() that reads the file
 * and displays the number of words in the file (use string tokenizer )
 */


import java.awt.event.*;
import java.io.*;
import java.util.StringTokenizer;
import javax.swing.*;

public class TextSaveApp{
    JFrame frame;
    JTextField textField;
    JButton saveButton;
    static JLabel detailsLabel;
    static File file = new File("inputdata.txt");

    static void displayfiledetails(){
        try{
            FileInputStream fis = new FileInputStream(file);
            int c;
            StringBuilder readString = new StringBuilder();
            while((c = fis.read()) != -1){
                readString.append((char)c);
            }

            StringTokenizer tokens = new StringTokenizer(readString.toString());
            int wordCount = tokens.countTokens();
            detailsLabel.setText("The File Countains "+ wordCount+" Words");
            fis.close();
        }
        catch(Exception e){
            System.out.println(e.getStackTrace());
        }

    }

    TextSaveApp(){
        frame = new JFrame("Text Details");
        frame.setSize(500,500);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50 , 50 , 400 , 200);

        saveButton = new JButton("Save");
        saveButton.setBounds(200 , 300 , 100 , 50);

        detailsLabel = new JLabel();
        detailsLabel.setBounds(100 , 400 , 300 , 50);
        
        saveButton.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent ae){
                    try{
                        FileOutputStream fos = new FileOutputStream(file);
                        String str = textField.getText();
                        for(int i=0 ; i<str.length(); i++){
                            fos.write(str.charAt(i));
                        }
                        fos.close();
                        displayfiledetails();
                    }
                    catch(Exception e){
                        System.out.println(e.getStackTrace());
                    }
                }
            }
        );


        frame.add(textField);
        frame.add(saveButton);
        frame.add(detailsLabel);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new TextSaveApp();
    }
}