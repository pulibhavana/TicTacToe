package tw_games;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

public class TicTacToe extends Frame implements ActionListener {

	JFrame frame=new JFrame(); 
	JTextField[][] textfield; 
	int count=0;

	public TicTacToe(int width, int length){ 
		frame.setLayout(new GridLayout(width,length)); 
		textfield= new JTextField[width][length];
		for(int x=0; x<length; x++){
			for(int y=0; y<width; y++){
				textfield[x][y]=new JTextField();
				textfield[x][y].addActionListener(this);
			    frame.add(textfield[x][y]);
			}
		}
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack(); 
		frame.setVisible(true); 
	}

	public void actionPerformed(ActionEvent e) 
	{  
		    int k=0;
			count=count+1;
			if(count<=9)
			{
				for(int x=0;x<3;x++)
				{
					//System.out.println(textfield[0][0].getText());
					//System.out.println(textfield[0][0].getText().equals("x"));
					if(textfield[x][0].getText().equals("x") && textfield[x][1].getText().equals("x") && textfield[x][2].getText().equals("x"))
						System.out.println("X is winner");
					if(textfield[x][0].getText().equals("o") && textfield[x][1].getText().equals("o") && textfield[x][2].getText().equals("o"))
						System.out.println("O is winner");
					
				}
				for(int y=0;y<3;y++)
				{
					if(textfield[0][y].getText().equals("x") && textfield[1][y].getText().equals("x") && textfield[2][y].getText().equals("x"))
						System.out.println("X is winner");
					if(textfield[0][y].getText().equals("o") && textfield[1][y].getText().equals("o") && textfield[2][y].getText().equals("o"))
						System.out.println("o is winner");
				}
				
				if(textfield[k][k].getText().equals("x") && textfield[k+1][k+1].getText().equals("x") && textfield[k+2][k+2].getText().equals("x"))
						System.out.println("X is winner");
				if(textfield[k][k].getText().equals("o") && textfield[k+1][k+1].getText().equals("o") && textfield[k+2][k+2].getText().equals("o"))
						System.out.println("o is winner");
				
				if(textfield[0][2].getText().equals("x") && textfield[1][1].getText().equals("x") && textfield[2][0].getText().equals("x"))
					System.out.println("X is winner");
			    if(textfield[0][2].getText().equals("o") && textfield[1][1].getText().equals("o") && textfield[2][0].getText().equals("o"))
					System.out.println("o is winner");
				
				
			}
			else
			{
				System.out.println("Game ends here!!");
			}
			
	}

	



	public static void main(String[] args)
	{
		TicTacToe t=new TicTacToe(3,3);

	}
}


