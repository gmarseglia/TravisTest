
public class Main {

	public static void main(String[] args) {
		int len = 10;
		Point p = new Point(0, 0, 10, 5, -2, 1);
		Position[] poss = new Position[len];
		for (int i = 0; i < len; i++) {
			poss[i] = p.getPosition();
			p.update();
		}

		for (int i = 0; i < len; i++) {
			System.out.println("i = " + i + ", X = " + poss[i].x + ", Y = " + poss[i].y);
		}
		
	}
}
