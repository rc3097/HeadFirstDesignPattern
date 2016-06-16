package ducksort;

import java.util.Arrays;

public class DuckSortTestDrive {
	public static void main(String[] args) {
		Duck[] ducks = {
			new Duck("Daffy", 6),
			new Duck("Dewey", 2),
			new Duck("Howad", 7),
			new Duck("Louie", 2),
			new Duck("Donald", 10),
			new Duck("Huey", 2)
		};
		
		System.out.println("before sorting:");
		System.out.println(Arrays.deepToString(ducks));
		
		Arrays.sort(ducks);
		
		System.out.println("after sorting:");
		System.out.println(Arrays.deepToString(ducks));
	}
}
