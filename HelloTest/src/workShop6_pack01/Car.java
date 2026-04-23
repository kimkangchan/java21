package workShop6_pack01;

public class Car extends Vehicle {
	private double restOil;
	private int curWeight;

	public Car() {

	}

	public Car(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}

	public void addOil(int oil) {
		if (restOil + oil > getOilTankSize()) {
			System.out.println("오일양이 오일탱크 크기보다 많습니다");
		} else {
			restOil += oil;
		}

	}

	public void moving(int distance) {

		restOil -= distance / getEfficiency();
	}

	public void addWeight(int weight) {
		if (curWeight + weight > getMaxWeight()) {
			System.out.println("적재량이 최대적재량 보다 많습니다");
		} else {
			curWeight += weight;
		}
	}

	@Override
	public String toString() {
		return "Car [restOil=" + restOil + ", curWeight=" + curWeight + ", getMaxWeight()=" + getMaxWeight()
				+ ", getOilTankSize()=" + getOilTankSize() + ", getEfficiency()=" + getEfficiency() + "]";
	}

	public double getRestOil() {
		return restOil;
	}

	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}

	public int getCurWeight() {
		return curWeight;
	}

	public void setCurWeight(int curWeight) {
		this.curWeight = curWeight;
	}

}
