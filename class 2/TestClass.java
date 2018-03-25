class TestClass{

	public static void main(String... manas){
		
		A oa1 = new A(); // First Object is created
		System.out.println("A class Object address in oa1 = "+oa1);
		oa1.display(); // x = 10 and y = 20
		oa1.set(11,22);
		oa1.display(); // x = 11 and y = 22

		A oa2 = new A(); // Second Object is created
		System.out.println("A class object address in oa2 = "+oa2);
		oa2.display();// x = 10 and y = 20

		oa1 = oa2; // Here trying to copy address of second object of A class into reference variable "oa1".

		oa1.display(); // x = 10 and y = 20
		
	}
}