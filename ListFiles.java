import java.io.*;

public class ListFiles {
    public static void main(String[] args) {
        File dir = new File("Data");
        if (dir.exists()){
            String[] files = dir.list();
            System.out.println(files.length + " файлов нвйдено");
            for (int i = 0; i < files.length; i++){
                System.out.println(files[i]);
            }
        }else{
            System.out.println("Файлы не найдены");
        }
    }
}
