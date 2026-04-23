package workShop6_pack02;

public class MobileTest {

	public static void main(String[] args) {

		Mobile m1 = new Ltab("Ltab", 500, "Ap-01");
		Mobile m2 = new Otab("Otab", 1000, "AND-20");

		System.out.println("Mobile\tBattery\tOS");
		System.out.println("--------------------");
		System.out.println(m1.getMobileName() + "\t" + m1.getBatterySize() + "\t" + m1.getOsType());
		System.out.println(m2.getMobileName() + "\t" + m2.getBatterySize() + "\t" + m2.getOsType());

		System.out.println("10분 충전");
		System.out.println("Mobile\tBattery\tOS");
		System.out.println("--------------------");
		System.out.println(m1.getMobileName() + "\t" + m1.charge(10) + "\t" + m1.getOsType());
		System.out.println(m2.getMobileName() + "\t" + m2.charge(10) + "\t" + m2.getOsType());
		
		System.out.println("5분 통");
		System.out.println("Mobile\tBattery\tOS");
		System.out.println("--------------------");
		System.out.println(m1.getMobileName() + "\t" + m1.operate(5) + "\t" + m1.getOsType());
		System.out.println(m2.getMobileName() + "\t" + m2.operate(5) + "\t" + m2.getOsType());
		
		

	}

}
