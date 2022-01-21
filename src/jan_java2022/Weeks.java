package jan_java2022;
enum Day {
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}

public class Weeks {

	public static void main(String[] args) {
		Week(Day.MONDAY);
		dayIsLike();

	}

	static Day day;
	public static void Week(Day day1) {
		day=day1;
	}
	public static void dayIsLike() {
		switch(day) {
		case SUNDAY:
			System.out.println("Today is Monday");
			break;
		case MONDAY:
			System.out.println("Today is Monday");
			break;
		case TUESDAY:
			System.out.println("Today is Monday");
			break;
		case WEDNESDAY:
			System.out.println("Today is Monday");
			break;
		case THURSDAY:
			System.out.println("Today is Monday");
			break;
		case FRIDAY:
			System.out.println("Today is Monday");
			break;
		case SATURDAY:
			System.out.println("Today is Monday");
			break;
		default:
			System.out.println("enter a valid day");
			break;
		}
	}

}
