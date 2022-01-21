package jan_java2022;

enum TrafficSignal{
	RED("STOP"),GREEN("GO"),ORANGE("WAIT");
	private String action;

	public String getAction() {
		return this.action;
	}

	private TrafficSignal(String action) {
		this.action = action;
	}
}

public class trafficSignal_enum {
	public static void main(String[] args) {
		TrafficSignal[] signals = TrafficSignal.values();

		for(TrafficSignal signal : signals) {
			System.out.println("name : "+signal.name() + " action: " + signal.getAction());
		}
	}
	}

