package AnnonymusClassObject;

import static AnnonymusClassObject.AbsClass.*;		// static import
public class Test  {

	public static void main(String[] args) {
		
		System.out.println(ownMethod(10));		// ab.class concrete method call.

		Annonymus obj = new Annonymus() { 		// creating anonymous class of interface

			@Override
			public void sub() {

				System.out.println("overriden method from interface");
			}

			@Override
			public void add() {

				System.out.println("overriden method from interface");
			}
		};

		AbsClass obj2 = new AbsClass() {		// creating anonymous class of Abstract class.

			@Override
			public void m1() {

				System.out.println("overriden method from abstarct class");

			}
			
			
		};


	}

}
