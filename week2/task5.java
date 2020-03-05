public class BinarySearch {
    public static void main(String[] args) {
        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;

		int left_bound = 0,
            right_bound = data.length - 1,
            result = -1,
            index;
        
        while (left_bound <= right_bound) { 
			index = left_bound + (right_bound - left_bound) / 2; 

			if (data[index] == numberToFind) { 
                result = index;
                break;
            } 

			if (data[index] < numberToFind) left_bound = index + 1;
			else right_bound = index - 1; 
		}

		System.out.println(result);
    }
}
