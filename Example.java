package AnnonymusClassObject;

public class Example implements Cloneable {

	public static void main(String[] args)
	
	{
		Example obj = new Example();
		
		try {
			
			Example obj2 = (Example) obj.clone();
		}
		catch(CloneNotSupportedException e) {
			
			e.printStackTrace();
			
			System.out.println(e.getMessage());
		}
				
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	

}
