import java.util.Scanner;
class Average{
	public static void main(String args[]){
		int num, val, count = 0;
		float avg = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n number :");
		num = sc.nextInt();
		while(count < num){
			System.out.print("Enter your number :");
			val = sc.nextInt();
			avg += val;
			count++;
		}
		avg /= num;
		System.out.println("Average : " + avg);
	}
} 
