package lab1;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Lab1KilykKI33 {

    public static void main(String[] args) throws IOException {
        
        PrintStream out = new PrintStream(System.out, true, StandardCharsets.UTF_8);
        Scanner in = new Scanner(System.in);

        out.print("Введіть розмір трикутника: ");
        int nRows = in.nextInt();
        in.nextLine(); 

        out.print("Введіть символ-заповнювач: ");
        String filler = in.nextLine();

        if (filler.length() != 1) {
            out.println("Помилка");
            return;
        }
        char fillChar = filler.charAt(0);
        
        try (PrintStream fileOut = new PrintStream("output.txt", StandardCharsets.UTF_8)) {

            for (int i = 0; i < nRows; i++) {
                
                for (int k = 0; k < nRows - i - 1; k++) {
                    out.print("\t");
                    fileOut.print("\t");
                }

                for (int j = 0; j <= i; j++) {
                    out.print(fillChar + "\t");
                    fileOut.print(fillChar + "\t");
                }

                out.println();
                fileOut.println();
            }

            out.println("Малюнок збережено ");
        }

        in.close();
    }
}
