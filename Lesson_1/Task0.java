package Lesson_1;

//Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
//        Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки,
//        иначе - длину массива.

public class Task0 {
    public static void main(String[] args) {
        int [] array = {1, 5, 6, 2, 10, 11};
        System.out.println(sizeArray(array, 7));
    }

    public static int sizeArray(int[] arr, int minNum){
        if (arr.length < minNum) {
            return -1;
        }
        return arr.length;
    }
}
