import java.util.Scanner;

public class ArrayNr {
	public static void main(String[] args) {

	arrayNr();
	}

	public static void arrayNr() {

		Scanner s = new Scanner(System.in);

		int nr = s.nextInt();

		int[] arrays = new int[6];

		for(int i=1; i<=5; i++){
            arrays[i] = s.nextInt();
        }

		for(int i=1; i<=5; i++) {
			if(arrays[i] > nr){
				System.out.println(arrays[i]);
			}
		}

	}
}