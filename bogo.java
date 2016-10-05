import java.util.*;

public class bogo {
	public static void main(String[] args) {
 		ArrayList<Integer> bogoList = new ArrayList<Integer>();
		bogoList = assignRandomList(bogoList,0,99);
		print(bogoList);
		boolean sorted = false;
		int count = 0;
		while(sorted == false) {
			count++;
			bogoList = bogoSort(bogoList);
			sorted = checkSort(bogoList);
			print(bogoList);
			System.out.println("The list is sorted: " + sorted);
	 	}
		System.out.println("The number of sorts bogo sort took was " + count);
	}

	public static ArrayList<Integer> assignRandomList(ArrayList<Integer> arr, int min, int max) {
		for(int i = 0 ; i < 10 ; i++) {
		 arr.add(i, randInt(min,max));
	 }
	 return arr;
	}

	public static int randInt(int min, int max) {
    	Random rand = new Random();
    	int randomNum = rand.nextInt((max - min) + 1) + min;
    	return randomNum;
	}

	public static void print(ArrayList<Integer> arr) {
		for(Integer i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}

	public static boolean checkSort(ArrayList<Integer> a) {
    	for (int i = 0; i < a.size() - 1; i++) {
        	if (a.get(i) > a.get(i + 1)) {
		    		return false; // It is proven that the array is not sorted.
        	}
    	}
			return true; // If this part has been reached, the array must be sorted.
	}

	public static ArrayList<Integer> bogoSort(ArrayList<Integer> arr) {
		 		Collections.shuffle(arr);
				return arr;
	}
}
