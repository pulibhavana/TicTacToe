package tw_games;

public class TicTacToe  {

	String[] grid=new String[9];
	int chance=0,position;
	players p1=new players(1);
	players p2=new players(2);
	Board bo=new Board();
	public void inputFromPlayer()
	{
		while(!gameEnds())
		{
			switch(chance%2)
			{
				case 0: position=p1.player_input();
						while(!validateInput(position))
						{
							System.out.println("the position is filled!");
							position=p1.player_input();
						}
						grid[position]=p1.variable;
						chance++;
						break;
				
				case 1: position=p2.player_input();
						while(!validateInput(position))
						{
							System.out.println("the position is filled!");
							position=p2.player_input();

						}
						grid[position]=p2.variable;
						chance++;
						break;
				
			}
		}
	}
	
	
	public boolean validateInput(int input)
	{
		if(grid[input]==null)
			return true;
		return false;
		
	}
	public boolean gameEnds()
	{
		boolean rowFlag,colFlag,ldFlag,rdFlag,movesFlag;
		
		movesFlag=bo.gamedraw(grid);
		rowFlag=bo.row_check(grid);
		colFlag=bo.col_check(grid);
		ldFlag=bo.left_diagonal_check(grid);
		rdFlag=bo.right_diagonal_check(grid);
		
		
		return (movesFlag||rowFlag || colFlag ||ldFlag || rdFlag);
	}
	
	
		
	
	public static void main(String[] args)
	{
		TicTacToe tictactoe =new TicTacToe();
		tictactoe.inputFromPlayer();
	}
	
	
}

	
	


	
	
	
	





