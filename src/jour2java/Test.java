package jour2java;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicule v=new Vehicule("mazda","mazda inc", 1);
		Car c=new Car("volvo","penin inc", 2, 4, 5);
		Truck t=new Truck("ford", "motors cars", 3,1000, 100);
		Bike bk=new Bike("ovetto","ovetto",6,60, 2);
		System.out.println(v.toString());
		System.out.println(c.toString());
		System.out.println(t.toString());
		System.out.println(bk.toString());
		
		
		
	}

}
