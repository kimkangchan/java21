package workShop6_pack01;

public class Truck extends Car {

	public Truck() {
		// TODO Auto-generated constructor stub
	}

	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);

	}

	@Override
	public double getEfficiency() {

		return super.getEfficiency() - (getCurWeight() / 5) * 0.2;
	}

	@Override
	public void moving(int distance) {
		double oil = calcOil(distance);
		setRestOil(getRestOil() - oil);
	}

	public double calcOil(int distance) {
		return distance / getEfficiency();
	}

	public int getCost(int distance) {
		double oil = calcOil(distance);
		return (int) (oil * 3000);
	}

	@Override
	public String toString() {
		return "Truck [getEfficiency()=" + getEfficiency() + ", getRestOil()=" + getRestOil() + ", getCurWeight()="
				+ getCurWeight() + ", getMaxWeight()=" + getMaxWeight() + ", getOilTankSize()=" + getOilTankSize()
				+ "]";
	}

}
