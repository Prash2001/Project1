package internship;
import java.util.Scanner;
public class project1 {
	public static void salary(int Basic,int HRA,int DA,int IT) {
		int salary = Basic + HRA + DA - IT;
		System.out.printf("%10d",salary);
	}
	public static void main(String[] args) {
		int[] Emp_No = {1001,1002,1003,1004,1005,1006,1007};
		String[] Emp_Name = {"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
		String[] Join_Date = {"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","01/01/2000","12/06/2006"};
		char[] Designation_Code = {'e','c','k','r','m','e','c'};
		String[] Department = {"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
		int[] Basic = {20000,30000,10000,12000,50000,23000,29000};
		int[] HRA = {8000,12000,8000,6000,20000,9000,12000};
		int[] IT = {3000,9000,1000,2000,20000,4400,10000};
		Scanner sc = new Scanner(System.in);
		int Emp_id = sc.nextInt();
		int index=0;
		boolean b = true;
		for(int i=0;i<7;i++) {
			if(Emp_id==Emp_No[i]) {
				index = i;
				b = false;
			}
		}
		if(b) {
			System.out.println("There is no employee with empid : "+Emp_id);
		}
		else {
			System.out.println("Emp No.    Emp Name    Department    Designation    Salary");
			int t= 13-Emp_Name[index].length();
			System.out.printf("%7d%12s%14s",Emp_No[index],Emp_Name[index],Department[index]);
			switch(Designation_Code[index]) {
			case 'e': System.out.printf("%15s","Engineer");
			        salary(Basic[index],HRA[index],20000,IT[index]);
			        break;
			case 'c': System.out.printf("%15s","Consultant");
	                salary(Basic[index],HRA[index],32000,IT[index]);
	                break;
			case 'k': System.out.printf("%15s","Clerk");
                    salary(Basic[index],HRA[index],12000,IT[index]);
                    break;
			case 'r': System.out.printf("%15s","Receptionist");
                      salary(Basic[index],HRA[index],15000,IT[index]);
                      break;
			case 'm': System.out.printf("%15s","Manager");
                      salary(Basic[index],HRA[index],40000,IT[index]);
                      break;
				}
		}
		sc.close();
  		}
}

