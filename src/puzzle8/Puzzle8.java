package puzzle8;

import java.util.Deque;

/**
 * Hauptprogramm für 8-Puzzle-Problem.
 * 
 * @author Jan Wegele
 */
public class Puzzle8 {

	public static void main(String[] args) {
		int[] predefinedArray = { 7, 2, 4, 5, 0, 6, 8, 3, 1 };
		Board b = new Board(predefinedArray);
		// Board b = new Board(); // Loesbares Puzzle b zufällig genrieren.
		System.out.println(b);

		Deque<Board> res = A_Star.aStar(b);
		int n = res == null ? -1 : res.size();
		System.out.println("Anz.Zuege: " + n + ": " + res);

		res = IDFS.idfs(b);
		n = res == null ? -1 : res.size();
		System.out.println("Anz.Zuege: " + n + ": " + res);
	}
}
