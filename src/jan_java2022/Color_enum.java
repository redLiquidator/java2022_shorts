package jan_java2022;

enum Color{
	RED,GREEN,BLUE;
}
public class Color_enum {
	public static void main(String[] args) {
		Color arr[] = Color.values();

		for(Color col : arr) {
			System.out.println(col+" at index "+col.ordinal());  //ordinal() shows index
		}
		System.out.println(Color.valueOf("RED"));
	}
}
