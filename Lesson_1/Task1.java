package Lesson_1;

//Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
//        если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
//        если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//        если вместо массива пришел null, метод вернет -3
//        придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
//        Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот метод запросит искомое число у пользователя, вызовет первый,
//        обработает возвращенное значение и покажет читаемый результат пользователю. Например, если вернулся -2, пользователю выведется сообщение:
//        “Искомый элемент не найден”.

public class Task1 {
    public static void main(String[] args) {

        int [] array = {1, 5, 6};
        int [] array1 = {1, 5, 6, 2, 10, 11};


        findNumberComment(array, 6, 5);
        findNumberComment(array1, 3,5 );
        findNumberComment(null, 6, 5);
        findNumberComment(array1, 6, 5);
    }

    public static int findNumber(int[] arr, int number, int minSize) {
        if (arr == null) return  -3;
        if (arr.length < minSize) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) return i;
        }
        return -2;
    }

    public static void findNumberComment (int[] arr, int number, int minSize) {
        int result = findNumber(arr, number, minSize);
        switch (result){
            case -1:
                System.out.println("длина массива меньше некоторого заданного минимума");
                break;
            case -2:
                System.out.println("искомый элемент не найден");
                break;
            case -3:
                System.out.println("пришел null");
                break;
            default:
                System.out.println("индекс элента =" + result);
        }

    }
}