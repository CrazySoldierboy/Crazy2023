public class Elements {
    public static void main(String[] args) {
        int [] kiosk_q1 = {42000, 48000, 50000};
        int [] kiosk_q2 = {75000, 35000, 44000};
        int [] kiosk_q3 = {49000, 37000, 54000};
        int [] kiosk_q4 = {65000, 82000, 36000};

        int [] outlet_q1  = {57000, 45000, 32000};
        int [] outlet_q2  = {45600, 85000, 94000};
        int [] outlet_q3  = {63000, 124000, 216500};
        int [] outlet_q4  = {42300, 58000, 54000};

        int [] sum = new int[12];
        int total = 0;

        for (int i = 0; i < kiosk_q1.length; i++){
            sum[i] = kiosk_q1[i] + outlet_q1[i];
            sum[i+3] = kiosk_q2[i] + outlet_q2[i];
            sum[i+6] = kiosk_q3[i] + outlet_q3[i];
            sum[i+9] = kiosk_q4[i] + outlet_q4[i];
        }

        for (int i = 0; i < sum.length; i++){
            System.out.println("Месяц " + (i+1) + ", объем продаж:\t" + sum[i]);
            total += sum[i];
        }

        System.out.println("ОБЩИЙ ОБЪЕМ ПРОДАЖ ЗА ГОД\t" + total);

    }
}
