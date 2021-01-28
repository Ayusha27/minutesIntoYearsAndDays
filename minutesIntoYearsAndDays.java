package Task2;
import java.util.*;
public class minutesIntoYearsAndDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of minutes:");
		Scanner sc= new Scanner(System.in);
		int m = sc.nextInt();//m-> minutes 
		int h = m/60; //h-> hours
		int d = h/24; //d-> days
		int y = d/365; //y-> years

		int remainingDays = d%365;
		System.out.println("minutes is converted to:"+y+ "years and " + remainingDays + "days");
		}
		}
	
