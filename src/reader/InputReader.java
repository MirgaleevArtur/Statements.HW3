package reader;
import java.util.Scanner;

public class InputReader {

    public static int intReader(Scanner scanner){
         while (true){
             if (scanner.hasNextInt()){
                 return scanner.nextInt();
             } else {
                 System.out.println("Неверный ввод, введите число");
                 scanner.next();
             }
         }
    }
}
