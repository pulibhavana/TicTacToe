package tw_games;

public class TicTacToe  {

	String[] grid=new String[9];
	int[] validMoves=new int[9];
	int chance=0,choose;
	players p1=new players(1);
	players p2=new players(2);
	boolean rowFlag,colFlag,ldFlag,rdFlag,movesFlag;
	GameResults gp=new GameResults();
	public void inputFromPlayer()
	{
		while(!gameResults())
		{
			if(chance%2==0 && chance<9)
			{
				player1validate();
				chance++;
			}
			else
			{
				if(chance<9)
				{
					player2validate();
					chance++;
				}
				
			}
			
			
		}
	}
	
	public void player1validate()
	{
		choose=p1.player_input(1);
		while(!validateInput(choose))
		{
			System.out.print("choose another position");
			p1.player_input(1);
		}
		grid[choose]=p1.variable;
		
	}
	
	public void player2validate()
	{
		choose=p2.player_input(2);
		while(!validateInput(choose))
		{
			System.out.println(" The position is filled \n "
					+ "choose another position");
			p2.player_input(2);
		}
		grid[choose]=p2.variable;
	}
	
	public boolean validateInput(int input)
	{
		if(validMoves[input]==0)
		{
			validMoves[input]=1;
			return true;
		}
		else
			return false;
		
	}
	public boolean gameResults()
	{
		
		movesFlag=gp.gameends(grid);
		rowFlag=gp.row_check(grid);
		colFlag=gp.col_check(grid);
		ldFlag=gp.left_diagonal_check(grid);
		rdFlag=gp.right_diagonal_check(grid);
		
		
		return (movesFlag||rowFlag || colFlag ||ldFlag || rdFlag);
	}
	
	
		
	
	public static void main(String[] args)
	{
		TicTacToe tictactoe =new TicTacToe();
		tictactoe.inputFromPlayer();
	}
	
	
}

	
	


	
	
	
	





