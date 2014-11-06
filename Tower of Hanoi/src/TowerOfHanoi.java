public class TowerOfHanoi
	{
	public static void main (String[] args)
		{
		int n = 4;  
		System.out.println(hanoi(n, 1, 3));
		}
	
   public static String hanoi(int nDisks, int fromPeg, int toPeg)
	   {
	   int helpPeg;
	   String Sol1, Sol2, myStep;

	   if ( nDisks == 1 )
		   {
		   return fromPeg + " -> " + toPeg + "\n";
		   }
	   
	   else
		   {
		   helpPeg = 6 - fromPeg - toPeg;
		   Sol1 = hanoi(nDisks-1, fromPeg, helpPeg);
		   myStep = fromPeg + " -> " + toPeg + "\n";
		   Sol2 = hanoi(nDisks-1, helpPeg, toPeg);

		   return Sol1 + myStep + Sol2;
		   }
	   }
	}
