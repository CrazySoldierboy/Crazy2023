public class StringComparison {
    public static void main(String[] args) {
        String password = "crazysoldier";
        try{
            if(args[0].toLowerCase().equals(password)){
                System.out.println("Пароль подтвержден");
            }
            else{
                System.out.println("Пароль не верный");
            }
        }
        catch(Exception e){
            System.out.println("Требуеться ввод пароля.");
        }

    }
}
