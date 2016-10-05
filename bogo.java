import java.util.Random;

public class bogo {
	public static void main(String[] args) {
 		ArrayList<Integer> bogoList = new ArrayList<Integer>(9);
 		for(Integer i : bogoList) {
 			bogoList.add(randInt(0,100));
 		}

		print(bogoArr);
		boolean sorted = false;
		while(sorted == false) {
			bogoArr = bogoSort(bogoArr);
			sorted = checkSort(bogoArr);
			print(bogoArr);
			System.out.println("The array is sorted: " + sorted);			
		}

	}

	public static int randInt(int min, int max) {
    	Random rand = new Random();
    	int randomNum = rand.nextInt((max - min) + 1) + min;
    	return randomNum;
	}

	public static void print(ArrayList<Integer> arr) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}

	public static boolean checkSort(ArrayList<Integer> a) {
    	for (int i = 0; i < a.length() - 1; i++) {
        	if (a[i] > a[i + 1]) {
		    return false; // It is proven that the array is not sorted.
        	}
    	}

	return true; // If this part has been reached, the array must be sorted.
	}

	public static int[] bogoSort(int[] arr) {
		
	}
}























