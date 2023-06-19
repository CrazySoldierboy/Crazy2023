public class Random {
    public static void main(String[] args) {
        float random = (float) Math.random();
        System.out.println("Случайное число: " + random);

        float multipied = random * 10;

        int randomInt = (int) Math.ceil(multipied);
        System.out.println("Случайное рандомное число: " + randomInt);

    }
}
