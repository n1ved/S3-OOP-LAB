import javax.swing.*;
import java.awt.event.*;
class TicTacToe implements ActionListener{
	JFrame frame;
	JButton[] b ;
    JButton resetBtn;
	JLabel label;
    int counter = 0;
    TicTacToe(){
		frame = new JFrame("TicTacToe");
		b = new JButton[9];
        resetBtn = new JButton("Reset game");
		label = new JLabel("Player 1's turn");
		
		frame.setSize(500 , 500);

        //Initialisiing all cells with null value
        for(int i=0 ; i<9 ; i++){
            b[i] = new JButton();
            b[i].setText(null);
        }
		
        //Can do this in a loop but lazy
		b[0].setBounds(175 , 100 , 50 , 50);
		b[1].setBounds(225 , 100 , 50 , 50);
		b[2].setBounds(275 , 100 , 50 , 50);
		b[3].setBounds(175 , 150 , 50 , 50);
		b[4].setBounds(225 , 150 , 50 , 50);
		b[5].setBounds(275 , 150 , 50 , 50);
		b[6].setBounds(175 , 200 , 50 , 50);
		b[7].setBounds(225 , 200 , 50 , 50);
		b[8].setBounds(275 , 200 , 50 , 50);
        label.setBounds(175 , 250 , 150 , 50);
        resetBtn.setBounds(175 , 300 , 150 , 50);
        
        resetBtn.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent ae){
                    for(int i=0 ; i<9 ; i++)
                        b[i].setText(null);
                    label.setText("Player 1's turn");
                }
            }
        );
		
        for(int i=0 ; i<9 ; i++){
            b[i].addActionListener(this);
            frame.add(b[i]);
        }


		frame.add(label);
        frame.add(resetBtn);
        resetBtn.setVisible(false);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
            //Get source can return a an object !!!!
			JButton currentBtn = (JButton)ae.getSource();
            if(currentBtn.getText() == null){
                if(counter%2 == 0){
                    currentBtn.setText("X");
                    label.setText("Player 2's turn");
                }else{
                    currentBtn.setText("O");
                    label.setText("Player 1's turn");
                }
                counter++;
            }
            int winner = haveSomeoneWon();
            if (winner == 0)
                return;
            if(winner == 1){
                label.setText("Player 1 Won !");
            }
            else{
                label.setText("Player 2 Won !");
            }
            //Add a new button to reset the game
            resetBtn.setVisible(true);
	}
    public int haveSomeoneWon(){

        //To reduce using .getText on everywhere
        String[] data = new String[9];
        for(int i=0 ; i<9 ; i++){
            data[i] = b[i].getText();
            if(data[i] == null)
                data[i] = Integer.toString(i) ; //To avoid winning with empty values
        }

        if(data[0] == data[1] && data[0] == data[2])
            return getWinnerDigit(data[0]);
        else if(data[0] == data[4] && data[0] == data[8])
            return getWinnerDigit(data[0]);
        else if(data[0] == data[3] && data[0] == data[6])
            return getWinnerDigit(data[0]);
        else if(data[1] == data[4] && data[1] == data[7])
            return getWinnerDigit(data[1]);
        else if(data[2] == data[4] && data[6] == data[2])
            return getWinnerDigit(data[2]);
        else if(data[5] == data[2] && data[8] == data[2])
            return getWinnerDigit(data[2]);
        else if(data[3] == data[4] && data[3] == data[5])
            return getWinnerDigit(data[3]);
        else if(data[6] == data[7] && data[6] == data[8])
            return getWinnerDigit(data[6]);
        else
            return 0;
   

    }

    public int getWinnerDigit(String text){
        if(text == "X")
            return 1;
        return 2;
    }
	
	public static void main(String args[]){
		new TicTacToe();
	}	
}