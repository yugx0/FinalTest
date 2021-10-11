package question1;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Give Number of Employees");
		int n = sc.nextInt();
		//sc.close();
		Employee arr[] = new Employee[n];
		for(int i=0; i<n; i++) {
			arr[i] = new Employee();
			arr[i].getData();
		}
		for(int i=0; i<n; i++) {
			arr[i].displayData();
		}
	}

}
