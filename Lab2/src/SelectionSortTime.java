import java.util.Random;

public class SelectionSortTime {
    public static void main(String[] args) {
        // Создаем массив из 100 000 случайных чисел
        int[] numbers = new int[100000];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);
        }
        // Создаем объект StopWatch
        StopWatch stopWatch = new StopWatch();

        // Запускаем секундомер
        stopWatch.start();

        // Выполняем сортировку выбором
        selectionSort(numbers);

        // Останавливаем секундомер
        stopWatch.stop();

        // Выводим время выполнения сортировки
        System.out.println("Время выполнения сортировки: " + stopWatch.getElapsedTime() + " миллисекунд");
    }
    // Метод для сортировки выбором
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Меняем местами элементы
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
