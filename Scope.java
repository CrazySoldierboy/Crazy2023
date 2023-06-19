public class Scope {
    final static String text = "Это глобальная переменная класса Scope";
    public static void main(String[] args) {
        String text = "Это локальная переменная main";
        System.out.println(text);
        sub();
        System.out.println(Scope.text);
    }

    public static void sub(){
        String text = "Это локальная переменная sub";
        System.out.println(text);
    }
}
