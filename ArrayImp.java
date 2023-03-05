import java.util.Scanner;

public class ArrayImp {
	public static void main(String[] args) {

	arrayImp();
	}

	public static void arrayImp() {

		Scanner s = new Scanner(System.in);

		int[] arrays = new int[6];

		for(int i=1; i<=5; i++){
            arrays[i] = s.nextInt();
        }

		for(int i=1; i<=5; i++) {
			if(arrays[i] % 2 == 1) {
				System.out.print(arrays[i] + " ");
			}
		}

	}
}