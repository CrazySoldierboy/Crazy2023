class Constant{
    public static void main(String[] args) {
        final int TOUCHDOWN = 6;
        final int CONVERSION = 1;
        final int FIELDGOAL = 3;

        int td, pat, fg, total;

        td = TOUCHDOWN * 4;
        pat = CONVERSION * 3;
        fg = FIELDGOAL * 2;
        total = (td + pat + fg);

        System.out.println("Очков всего: " + total);
        
    }
}