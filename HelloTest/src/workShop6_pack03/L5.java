package workShop6_pack03;

public class L5 extends Car implements Temp {

	public L5() {
		// TODO Auto-generated constructor stub
	}

	public L5(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void go(int distance) {
		setOil(getOilSize()- (distance/8));
		setDistance(distance);

	}

	@Override
	public void setOil(int oilSize) {
		setOilSize(getOilSize()+oilSize);

	}

	@Override
	public int getTempGage() {
		return getDistance()/5;
	}

}
