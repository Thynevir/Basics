package basics;

public class CreatingGlobalVariables {

	int daysInYear = 365;
	String[] months = {"Jan","Feb","Mar","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreatingGlobalVariables g = new CreatingGlobalVariables();
		System.out.println(g.daysInYear);
	}

//	public static int getDaysinYear() {
//		
//		return daysInYear;
//	}
}
