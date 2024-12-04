import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {

  }

  public int getPlayer2Move(int round)
  {
  int result;
  if ((round < maxRounds) || (coin  > 3))
  {
    if (round % 3 == 0)
    {
      result = 3;
    }
    else if (round % 2 == 0)
    {
      result = 2;
    }
    else
    {
      result = 1;
    }
  }
  return result;
  }

  public void playGame()
  {
    int round;
    int coin1 = startingCoins;
    int coin2 = startingCoins;
    for (int round = 0; round < maxRounds; i++)
    {
      getPlayer1Move();
      getPlayer2Move(round);
      if ((coin1 < 3) || (coin2 < 3))
      {
        if (coin1 > coin2)
        {
          return ("Player 1 wins");
        }
        if (coin1 < coin2)
        {
          return ("Player 2 wins");
        }
        else 
        {
          return ("tie game");
        }
      }
    }
    }
    if 
  }

}
//   public static void printNTimes(String word, int N)
//   {
//     // code solution here
//   }

//   public static void printNums()
//   {
//     // code solution here
//   }

//   public static void uprightNumberTriangle(int N)
//   {
//     // code solution here
//   }

//   public static void starTree()
//   {
//     // code solution here
//   }

//   public static void multTable()
//   {
//     // code solution here
//   }
// }
