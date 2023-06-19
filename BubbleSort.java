public class BubbleSort {
    public static void main(String[] args) {
        int [] box = new int[6];
        box[0] = 5;
        box[1] = 1;
        box[2] = 3;
        box[3] = 2;
        box[5] = 4;

        System.out.print("Массив в начале = ");
        for(int i = 0; i <= box.length -1; i++){
            System.out.print(box[i]);
            System.out.print(", ");
        }
        System.out.println();

        int temp;

        for(int i = 0; i < box.length - 1; i++){
           if(box[i] > box[i+1]){
               temp = box[i+1];
               box[i+1] = box[i];
               box[i] = temp;
           }else{
               continue;
           }
        }

        System.out.print("Массив после сортировки = ");
        for(int i = 0; i <= box.length -1; i++){
            System.out.print(box[i]);
            System.out.print(", ");
        }
    }
}
