package jan_java2022;

enum Fruits {
	Apple,Banana,Cherry,Date,Elderberry
}

enum Vegetables {
	Apple, Beetroot, Beans, Tomato, Onion
}
public class Fruits_enum {
	public static void main(String[] args) {
		Fruits[] fru = Fruits.values();
		for(Fruits fr : fru){
			System.out.println(fr+" :"+fr.ordinal());
		}

		Fruits f1,f2,f3;
		f1= Fruits.Apple;
		f2= Fruits.Banana;
		f3= Fruits.Apple;

		if(f2.compareTo(f1)>0  ) {
		System.out.println(f2+"comes after "+f1);
	}else{
		System.out.println("else1");
	}
		Vegetables v1 = Vegetables.Apple;

		if(f1.equals(v1)) {  //Vegetables.Apple & Fruits.Apple are not equal
			System.out.println("equals");
			System.out.println(f1+" "+v1);

		}else{
			System.out.println("else2");
			System.out.println(f1+" "+v1);
		}

	}
}
