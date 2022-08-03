package check;


import constants.Constants;


public class Main {
	
	private  String firstName = "鎌田";
	private  String lastName = "拓哉";

	
	public void printName() {
		System.out.println("printNameメソッド　→　" + this.firstName + this.lastName );
		}

	
	
	public static void main(String[] args) {
		
		Main MM = new Main();
		MM.printName();
		
		
		
		Pet PP = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		PP.introduce();
		
		RobotPet RP = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		RP.introduce();
	
		
	}

}
