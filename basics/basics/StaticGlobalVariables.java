package basics;

public class StaticGlobalVariables {

	static int daysInYear = 365;
	static String[] months = {"Jan","Feb","Mar","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ;i < 12;i++) {
			System.out.println(months[i]);
		}
	}

}
