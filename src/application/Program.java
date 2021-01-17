package application;

import java.util.Locale;
import java.util.Scanner;

import  entities.Room;

public class Program {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Room[] vect = new Room[10];
		
		System.out.println("room numbers:");
		int number = sc.nextInt();
		
		for(int i=0;i<number;i++) {
			
			sc.nextLine();
			System.out.println("locator name:");
			String name = sc.nextLine();
			System.out.println("locator email:");
			String email = sc.nextLine();
			System.out.println("room:");
			int room = sc.nextInt();
			vect[room] = new Room(name, email, room);
		
		}
		
		System.out.println("Busy rooms:");
			for (int i=0; i<10; i++) {
				if (vect[i] != null) {
					System.out.println(i + ": " + vect[i]);
				}
			}
		
		
		sc.close();
	}
}
