package tw_games;

class Board 
{
	int flag=0;
	public boolean gamedraw(String[] grid)
	{
		flag=0;
		for(int index=0;index<9;index++)
		{
			if(grid[index]==null)
			{
				flag=1;
			}
			
				
		}
		if(flag==0)
			System.out.println("Draw");
		return (flag==0);
	}
	public boolean row_check(String[] grid)
	{
		flag=0;
		for(int rowIndex=0;rowIndex<9;rowIndex+=3)
		{
			if(grid[rowIndex]!=null)
			{
				String text=grid[rowIndex];
				if(grid[rowIndex+1]==text && grid[rowIndex+2]==text)
				{
					System.out.println(text+"is winner");
					flag=1;
				}
			}
			
		}
		return (flag==1);
		
	}
	
	public boolean col_check(String[] grid)
	{
		flag=0;
		for(int colIndex=0;colIndex<3;colIndex++)
		{
			if(grid[colIndex]!=null)
			{
				String text=grid[colIndex];
				if(grid[colIndex+3]==text && grid[colIndex+6]==text)
				{
					System.out.println(text+"is winner");
					flag=1;
				}
			}
			
		}
		return (flag==1);
		
	}
	public boolean left_diagonal_check(String[] grid)
	{
		flag=0;
		if(grid[0]!=null)
		{
			String text=grid[0];
			if(grid[4]==text && grid[8]==text)
			{
				System.out.println(text+"is winner");
				flag=1;
			}
		}
		return (flag==1);
		
	}
	public boolean right_diagonal_check(String[] grid)
	{
		flag=0;
		if(grid[2]!=null)
		{
			String text=grid[2];
			if(grid[4]==text && grid[6]==text)
			{
				System.out.println(text+"is winner");
				flag=1;
			}
		}
		return (flag==1);
		
	}
	
		
		
		
		
}

