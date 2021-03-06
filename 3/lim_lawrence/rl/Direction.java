//grid origin is at top left
public enum Direction {
    UP        ( 0,-1),
    DOWN      ( 0, 1),
    LEFT      (-1, 0),
    RIGHT     ( 1, 0),
    UPLEFT    (-1,-1),
    UPRIGHT   ( 1,-1),
    DOWNLEFT  (-1, 1),
    DOWNRIGHT ( 1, 1);

    private int x;
    private int y;
    
    Direction(int dx, int dy) {
	x=dx;
	y=dy;
    }
}
