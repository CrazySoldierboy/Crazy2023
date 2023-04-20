public class Option1 {
    public static void main(String[] args) {
        if (args[0].equals("-en")){
            System.out.println("Опция для английского языка");
        }
        else if (args[0].equals("-es")){
            System.out.println("Опция для Испанского языка");
        }
        else{
            System.out.println("Неизвестная опция");
        }
    }
}
