import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {

	arraySum();
	}

	public static void arraySum() {

		Scanner s = new Scanner(System.in);

		int sum = 0;
		int[] arrays = new int[6];

		for(int i=1; i<=5; i++){
            arrays[i] = s.nextInt();
        }

		for(int i=1; i<=5; i++) {
			sum = sum + arrays[i];
		}

		System.out.println(sum);

	}
}