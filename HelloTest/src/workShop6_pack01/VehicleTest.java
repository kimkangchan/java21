package workShop6_pack01;

public class VehicleTest {

	public static void main(String[] args) {
		
		Truck car = new Truck(1000,100,5);
		
		System.out.println("최대적재중량\t오일탱크크기\t잔여오일량\t현재적재중량\t연비");
        System.out.println("==============================================================");
        System.out.println(car);

        car.addOil(50);
        System.out.println("\n50L 주유 후");
        System.out.println(car);

        car.moving(50);
        System.out.println("\n50Km 주행 후");
        System.out.println(car);

        car.addWeight(100);
        System.out.println("\n100Kg 적재 후");
        System.out.println(car);

        car.moving(30);
        System.out.println("\n30Km 주행 후");
        System.out.println(car);

        System.out.println("\n요금 : " + car.getCost(30) + "원");

	}

}
