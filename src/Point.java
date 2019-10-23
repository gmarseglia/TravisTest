
public class Point {
	int x, y, vx, vy, ax, ay;

	public Point(int x, int y, int vx, int vy, int ax, int ay) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
		this.ax = ax;
		this.ay = ay;
	}

	public Point(int x, int y, int vx, int vy) {
		this(x, y, vx, vy, 0, 0);
	}

	public Point(int x, int y) {
		this(x, y, 0, 0);
	}

	public int getSpeed() {
		int speed = (int) Math.sqrt(Math.pow(vx, 2) + Math.pow(vy, 2));
		return speed;
	}

	public void update() {
		this.x += this.vx;
		this.y += this.vy;
		this.vx += this.ax;
		this.vy += this.ay;
	}

	public Position getPosition() {
		Position pos = new Position(this.x, this.y);
		return pos;
	}

}
