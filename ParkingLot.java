/* Parking Lot */


public enum VehicleSize {
	Compact(1), Large(2);

	private final int size;

	VehicleSize (int size) {
		this.size = size;
	}

	public int getSize(){
		return size;
	}
}


public abstract class Vehicle {
	public abstract VehicleSize getSize();
}

