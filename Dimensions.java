public class Dimensions {
    public static void main(String[] args) {
        boolean [][] points = new boolean [5][5];

        points[0][4] = true;
        points[1][3] = true;
        points[2][2] = true;
        points[3][1] = true;
        points[4][0] = true;

        for (boolean[] point : points) {
            System.out.print("\n");

            for (int j = 0; j < points[0].length; j++) {
                char mark = (point[j]) ? 'X' : '-';
                System.out.print(mark);
            }
        }
    }
}
