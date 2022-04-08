class TestConditions{
	void testSwitch(int check){
		String value="";
		switch(check) {
		case 10: value="small"; break;
		case 12:value="small"; 	break;
		case 50: value="medium"; break;
		case 60: value="medium"; break;
		case 100: value="big"; break;
		case 150:value="big"; break;
			default: value="value not match";
		
		}
		System.out.println(value);
	}
	void testNewSwitch(int check){
		String value="";
		switch(check) {
		case 10, 12->value="small";
		case 50, 60-> value="medium";
		case 100, 150->value="big";
		default-> value="value not match";
		
		}
		System.out.println(value);
	}
	void testFor(){
		for (int i=0;i<10;i++) {
			System.out.println("i="+i);
		}
	}
	void testWhile(){
		int i=0;
		while (i<10) {
			System.out.println("i="+i);
			i++;
		}
	}
	
	void check3GreaterNumber(int n1, int n2, int n3) {
//		if (n1>n2) {
//			if (n1>n3) {
//				
//			}
//		}
		if ((n1>n2) && (n1>n3)) {
				System.out.println("Num 1 is greater");
				} 
		else if ((n2>n1) && (n2>n3)) {
			System.out.println("Num 2 is greater");
		
		} else 
		{
			System.out.println("Num 3 is greater");
		}
	}
	
	
}

public class LoopAndConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          TestConditions tc =new TestConditions();
         // tc.check3GreaterNumber(23, 50, 60);
          //tc.testFor();
          //tc.testWhile();
          tc.testSwitch(100);
          tc.testNewSwitch(100);
	}

}
