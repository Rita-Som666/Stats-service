import java.util.Arrays;
public class arrCalculate {
    public static void main(String[] args) {
        // Пример ожидаемых и действительных результатов (массивы)
        int[] expectedArray = {1, 2, 3, 4, 5};
        int[] actualArray = {1, 2, 3, 4, 6};

        // Сравниваем массивы
        boolean resultEquals = compareArrays(expectedArray, actualArray);

        // Выводим результат
        if (resultEquals) {
            System.out.println("Тест пройден: ожидаемые и действительные результаты совпадают.");
        } else {
            System.out.println("Тест не пройден: ожидаемые и действительные результаты не совпадают.");
        }
    }

    // Метод для сравнения массивов
    public static boolean compareArrays(int[] expected, int[] actual) {
        // Проверяем на null
        if (expected == null || actual == null) {
            return false;
        }

        // Сравниваем массивы
        return Arrays.equals(expected, actual);
    }
}

