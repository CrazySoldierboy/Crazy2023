public class Overload {
    public static void main(String[] args) {
        System.out.println(write(12));
        System.out.println(write("Двенадцать"));
        System.out.println(write(4, 6));
    }

    public static String write(int num){
        return ("Переданное число: " + num);
    }

    public static String write(String num){
        return ("Переданная строка: " + num);
    }

    public static String write(int num1, int num2){
        return ("Результат равен: " + (num1 * num2));
    }
}
