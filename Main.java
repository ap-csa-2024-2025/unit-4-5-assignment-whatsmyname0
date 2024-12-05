import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {

  }
  public boolean isSelfDivisor(int number)
  {
    final int number1 = number
    int digit;
    while (number > 0)
    {
      digit = number % 10
      number /= 10
      if ((digit == 0) || (number1 % digit != 0))
      {
        return false;
      }
    }
    return true;
  }

  public int firstNumSelfDivisors
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
    int coinround1;
    int coinround2;
    int coin1 = startingCoins;
    int coin2 = startingCoins;
    for (int round = 0; round < maxRounds; i++)
    {    
      coinround1 = getPlayer1Move();
      coinround2 = getPlayer2Move(round);
      coin1 -= coinround1
      coin2 -= coinround2
      if (coinround1 == coinround2)
      {
        coin2++
      }
      else if (((coinround1 + 1) == coinround2) || ((coinround1 - 1) == coinround2))
      {
        coin2++
      }
      else 
      {
        coin1 += 2
      }
      if ((coin1 < 3) || (coin2 < 3))
      {
        if (coin1 > coin2)
        {
          return ("Player 1 wins");
        }
        else if (coin1 < coin2)
        {
          return ("Player 2 wins");
        }
        else 
        {
          return ("tie game");
        }
      }
    }
    if (coin1 > coin2)
    {
      return ("Player 1 wins");
    }
    else if (coin1 < coin2)
    {
      return ("Player 2 wins");
    }
    else 
    {
      return ("tie game");
    }
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
