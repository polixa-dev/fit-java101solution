public class MatrixPrint {
	public static void main(String args[]){
        int size = 5;
		int num = 0;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				num++;
				
				if (i == j || (i+j == size-1)) System.out.print(" *");
				else {
					if (num < 10) System.out.print(' ');
					System.out.print(num);
				}

				System.out.print(' ');
			}
			System.out.println();
		}
	}
}
