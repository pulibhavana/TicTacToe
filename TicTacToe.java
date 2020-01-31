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
						validateInput(position,p1);
						chance++;
						break;
				
				case 1: position=p2.player_input();
						validateInput(position,p2);
						chance++;
						break;
				
			}
		}
	}
	
	public void validateInput(int input,players x)
	{
		int choose_again;
		if(grid[input]==null)
			grid[input]=x.variable;
		else
		{
			System.out.println("The position is filled! enter another position");
			choose_again=x.player_input();
			validateInput(choose_again,x);
		}
		
		
		
	}
	public boolean gameEnds()
	{
	
		
		if(bo.gamedraw(grid))
			return true;
		if(bo.row_check(grid))
			return true;
		if(bo.col_check(grid))
			return true;
		if(bo.left_diagonal_check(grid))
			return true;
		if(bo.right_diagonal_check(grid))
			return true;
		return false;
		
		
	}
	
	
		
	
	public static void main(String[] args)
	{
		TicTacToe tictactoe =new TicTacToe();
		tictactoe.inputFromPlayer();
	}
	
	
}

	
	


	
	
	
	





