public class StringLength {
    public static void main(String[] args) {
        String lang = "Java";
        String serias = " Для начинающих";

        String title = lang.concat(serias);

        System.out.print("\"" + title + "\" содержит ");
        System.out.println(title.length() + " символов");
    }
}
