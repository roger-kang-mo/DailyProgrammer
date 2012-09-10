using System;
using System.Text;

namespace DailyProgrammer.Walkaround
{
	public Class Walkaround
	{
		int[][] board;
		string Orders;
		int x, y;

		public Walkaround(int Len, string InString)
		{
			board = new int[Len][Len];
			Orders = InString;	
			x = 0;
			y = 0;

		}

		private void FillBoard()
		{
			for(int i = 0; i < board.length; i++)
				for(int j = 0; j < board.length; j++)
					board[i][j] = 0;
		}

		private void Step(string Order)
		{
			switch(Order)
			{
				case("N"):
					x -= 1;
					break;
				case("E"):
					y += 1;
					break;
				case("S"):
					x += 1;
					break;
				case("W"):
					y -= 1;
					break;
				case("stamP"):
					board[x][y] = 1;
			}			
		}

		private void Wrap(boolean switch)
		{
			if(switch){
				if (x == board.length)
					x = 0;
				else if (x < 0)
					x = board.length;
			}else
			{
				if (y == board.length)
					y = 0;
				else if (y < 0)
					y = board.length;
			}

		}
		private void Print()
		{
			string message = string.empty;
			for (int i = 0; i < board.length; i++)
				for (int j = 0; j < board.length; j++){
					message = board[i][j];
					message += j == board.length-1 ? " | " : "";
					System.Debugger.WriteLine()
				}

	
		}


	}






}