/**
 *  Codeforces
 *  Round #322
 *  Problem: Luxurious Houses - 581B
 *  Solution by: Dario Carrasquel
 */

import java.util.*;

public class LuxuriousHouses{
	
	public static void main(String args[]){
				
		try{
			Scanner sc = new Scanner(System.in);
			int T = sc.nextInt();
			int values[] = new int[T];
			int floors[] = new int[T];
			
			// Fill the array with the initial heights
			for (int i = 0; i < T; i++){
				values[i] = sc.nextInt();
			} 
			
			// Find the maximals from right to left
			int max = values[T - 1]; floors[T-1] = 0;
			for (int i = T - 2; i >= 0; i--) {
				if (values[i] > max){
					max = values[i];
					floors[i] = 0;
				}
				else floors[i] = max - values[i] + 1;
			}
			
			// Print results
			for (int i = 0; i < floors.length; i++){
				System.out.println(floors[i]);
			} 
		    sc.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	
	}	
	
}




