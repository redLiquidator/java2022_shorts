package jan_java2022;

enum Mobile{
	Samsung(1099),Apple(1250),Google(1325);

	int price;

	Mobile(int p){
		price =p;
	}

	int showPrice() {
		return price;
	}
}
public class Mobile_enum {
	public static void main(String[] args) {
		System.out.println("cellphone list");
		for(Mobile m : Mobile.values()) {
			System.out.println( m + " costs "+ m.showPrice()+" dollars");
		}

		Mobile ret;
		ret = Mobile.valueOf("Samsung");
		System.out.println("Selected : "+ ret);
	}
}
