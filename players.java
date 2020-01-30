package tw_games;
import java.util.*;
public class players 
{
	Scanner in=new Scanner(System.in);
	String playername,variable;
	boolean valid;
	int position;
	players(int num)
	{
		System.out.println("Enter the name of player"+ num);
		playername=in.nextLine();
		System.out.println("Enter the symbol of player"+num);
		variable=in.nextLine();
		
	}
	public int player_input(int next_turn)
	{
		System.out.println(playername+"'s turn");
		System.out.println("Enter the position");
		position=in.nextInt();
		return position;
		
	}

		
			
		
		
		
		
}
	
	
	

