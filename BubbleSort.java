public class BubbleSort {
    public static void main(String[] args) {
        // Массив
        int[] box = {5, 1, 3, 2, 4};
        System.out.print("Массив до сортировки = ");
        for(int i = 0; i <= box.length - 1; i++){
            System.out.print(box[i]);
            System.out.print(", ");
        }
        System.out.println();
        // Пустая переменная
        int temp;
        
        for(int i = 0; i <= box.length - 1; i++){
            for(int j = box.length - 1; j > i; j--){
                if(box[j - 1] > box[j]){
                    temp = box[j];
                    box[j] = box[j - 1];
                    box[j - 1] = temp;
                }
            }
        }
        System.out.print("Массив после сортировки = ");
        for(int i = 0; i <= box.length - 1; i++){
            System.out.print(box[i]);
            System.out.print(", ");
        }


    }
}
