import java.util.Scanner;
import static reader.InputReader.*;

public class DaysInYearCalculate {

    public static void checkDaysInYear() {
        int points = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Выберите год: ");
            int year = intReader(scanner);
            System.out.print("Введите количество дней: ");
            int days = intReader(scanner);

            if (calculateDaysInYear(year) == days){
                points ++;
            } else {
                System.out.println("Неправильно! В этом году "+ calculateDaysInYear(year) +" дней!");
                System.out.println("Набрано очков " + points);
                break;
            }
        }
    }


    private static int calculateDaysInYear(int year) {

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            year = 366;
        } else {
            year = 365;
        }
        return year;
    }
}
