class Point {
	int x = 0, y = 0;
	void move(int dx, int dy) { x += dx; y += dy; }
	int getX() { return x; }
	int getY() { return y; }
	int color;
}
class RealPoint extends Point {
	float x = 0.0f, y = 0.0f;
	void move(int dx, int dy) { move((float)dx, (float)dy); }
	void move(float dx, float dy) { x += dx; y += dy; }
	int getX() { return (int)Math.floor(x); }
	int getY() { return (int)Math.floor(y); }
}
