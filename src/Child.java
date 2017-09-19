//PROGRAM TO SHOW THE USE OF SUPER AND THIS KEYWORD
public class Child extends Master{
	
	int intNum =100;

	public Child() {
		super();
		super.Display();
		System.out.println("This is Child");
	}
	public void Display() {
		System.out.println("The value of A " + this.intNum);
		System.out.println("The value of A " + super.intNum);
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//Master M =new Master();
		Child C = new Child();
		
		//M.Display();
		C.Display();

	}

}
