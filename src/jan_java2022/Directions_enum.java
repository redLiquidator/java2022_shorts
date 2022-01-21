package jan_java2022;

enum Directions{
	EAST,WEST,NORTH,SOUTH
}

public class Directions_enum {
	public static void main(String[] args) {
		Directions dir = Directions.NORTH;
		if(dir == Directions.EAST) {
			System.out.println("Direction: East");
		}else if(dir == Directions.WEST) {
			System.out.println("Direction: West");
		}else if(dir == Directions.NORTH) {
			System.out.println("Direction: North");
		}else {
			System.out.println("Direction: South");
		}
	}
}
