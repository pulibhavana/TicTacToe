package tw_games;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

class sample implements ActionListener {

	JFrame frame =new JFrame();
	static JTextField[][] textfield;
	int filledFields=0,length=3,width=3;
	protected sample()
	{
		frame.setLayout(new GridLayout(length,width)); 
		textfield= new JTextField[length][width];
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
		   
			
			filledFields=filledFields+1;
			if(filledFields<=9)
			{
				TicTacToe.rowCheck();
				TicTacToe.columnCheck();
				TicTacToe.leftDiagonalCheck();
				TicTacToe.rightDiagonalCheck();
			}
			else
			{
				System.out.println("Game ends here!!");
			}
			
	}
	
	
}		
	
	

	


public class TicTacToe extends sample
{
	
	
	public static void rowCheck()
	{
		int rowCount;
		String textInRowFields;
		for(int rowIndex=0;rowIndex<3;rowIndex++)
		{
			if(!textfield[rowIndex][0].getText().isEmpty())
			{
				textInRowFields=textfield[rowIndex][0].getText();
			
				rowCount=0;
				for(int columnIndex=1;columnIndex<3;columnIndex++)
				{
			
					if(textfield[rowIndex][columnIndex].getText().equals(textInRowFields))
						rowCount+=1;
				}
				if(rowCount==2)
					System.out.println(textInRowFields+" is winner");
			}
		}
	}
	public static void columnCheck()
	{
		int columnCount;
		String textInColumnFields;
		for(int rowIndex=0;rowIndex<3;rowIndex++)
		{
            textInColumnFields=textfield[0][rowIndex].getText();
			if(!textInColumnFields.isEmpty())
			{
				columnCount=0;
				for(int columnIndex=1;columnIndex<3;columnIndex++)
				{
					if(textfield[columnIndex][rowIndex].getText().equals(textInColumnFields))
						columnCount+=1;
				
					
				}
				if(columnCount==2)
					System.out.println(textInColumnFields+" is winner");
			}	
		}
	}
	public static void leftDiagonalCheck()
	{
		int leftDiagonalCount=0;
		String textInLeftDiagonalFields;
		textInLeftDiagonalFields=textfield[0][0].getText();
		if(!textInLeftDiagonalFields.isEmpty())
		{
			for(int leftDiagonalIndex=1;leftDiagonalIndex<3;leftDiagonalIndex++)
			{
				if(textfield[leftDiagonalIndex][leftDiagonalIndex].getText().equals(textInLeftDiagonalFields))
					leftDiagonalCount+=1;

			}
			if(leftDiagonalCount==2)
				System.out.println(textInLeftDiagonalFields+" is winner");
	
			
		}
		

	}
	public static void rightDiagonalCheck()
	{
		int rightDiagonalCount=0;
		String textInRightDiagonalFields;
		textInRightDiagonalFields=textfield[0][2].getText();
		if(!textInRightDiagonalFields.isEmpty())
		{
			for(int rowDiagIndex=1,colDiagIndex=1;rowDiagIndex<3&colDiagIndex>=0;rowDiagIndex++,colDiagIndex--)
			{
				if(textfield[rowDiagIndex][colDiagIndex].getText().contentEquals(textInRightDiagonalFields))
					rightDiagonalCount+=1;
				

			}
			if(rightDiagonalCount==2)
				System.out.println(textInRightDiagonalFields+" is winner");
	
			
		}
		

	}
	public static void main(String[] args)
	{
		TicTacToe tictactoe=new TicTacToe();
		
	}
	
	
	

}



