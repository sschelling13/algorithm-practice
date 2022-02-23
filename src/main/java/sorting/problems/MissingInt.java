package sorting.problems;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MissingInt {
    long numberOfInts = ((long) Integer.MAX_VALUE) + 1;
    byte[] bitField = new byte [(int) (numberOfInts / 8)];
    String fileName = "";

    public void findOpenNumber() throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader(fileName));
        while (in.hasNextInt()) {
            int n = in.nextInt();
            bitField[n/8] |= 1 << (n%8);
        }

        for (int i = 0; i < bitField.length; i++) {
            for (int j = 0; j < 8; j++) {
                if ((bitField[i] & (1 << j)) == 0) {
                    System.out.println(i * 8 + j);
                    return;
                }
            }
        }
    }
}
