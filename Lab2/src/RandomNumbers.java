//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.GregorianCalendar;

public class RandomNumbers {
    public static void main(String[] args) {
        // Создаем объект Random с начальным значением 1000
        Random random = new Random(1000);

        // Отображаем первые 50 случайных целых чисел между 0 и 100
        for (int i = 0; i < 50; i++) {
            int randomNumber = random.nextInt(100);
            System.out.println("Случайное число " + (i + 1) + ": " + randomNumber);
        }
    }
}


