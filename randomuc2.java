
public class SnakesLadders {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		
		int numPlayers = 0;
		while (numPlayers <= 0 || numPlayers >6 ){
			System.out.print("Please enter the number of player (1-6): " );
			numPlayers = scan.nextInt();
		}
		}
}
