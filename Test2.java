package AnnonymusClassObject;

public class Test2 {

	public static void main(String[] args) {

		AbsClass x = new AbsClass() {

			@Override
			public void m1() {

				System.out.println(" this is abstract class method ");

			}
		};

		x.m1();


		Annonymus k = new Annonymus() {

			@Override
			public void sub() {
				System.out.println("this is sub method from interface");
			}

			@Override
			public void add() {
				System.out.println("this is add method from interface");

			}
		};
		
		k.add();
		k.sub();



	}



}
