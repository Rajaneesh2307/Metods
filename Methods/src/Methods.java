public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods msg;
		msg = new Methods();
	//	msg.raj();
		//msg.sisname("Likhitha");
		//msg.agecalculator(2000);
		msg.retirementCalc("rajaneesh",1890);
		msg.retirementCalc("likhitha",1990);
	}
	private void raj() {
		System.out.println("...........................");
		System.out.println("Lithitha is Rajaneesh Siter");
		System.out.println("...........................");
	}
	public void sisname(String name) {
		System.out.println("sisname : "+name);
	}
	public int agecalculator(int yearofbirth) {
		int age = 2022 - yearofbirth;
		System.out.println("rajbirthyear is : "+age);
		return age;
	}
	public void retirementCalc(String username, int yearOfBirth) {
		int age = agecalculator(yearOfBirth);
		if(age>65) {
			System.out.println("Hi , "+username +" you are already retired.");
		} else {
			System.out.println("Hi , "+username 
					+" you have "+(65-age) +" year for retirement.");
		}
	}
}
