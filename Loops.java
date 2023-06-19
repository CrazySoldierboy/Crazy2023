public class Loops {
    public static void main(String[] args) {

        /* for */
        if (args.length > 0){
            for (int i = 0; i < args.length; i++){
                System.out.println("args["+i+"] - | "+ args[i]);
            }
        }

        /* while */
        String [] htm = {"HTML5", "in", "easy", "steps"};

        int j = 0;
        while (j < htm.length){
            System.out.println("htm["+j+"] - | " + htm[j]);
            j++;
        }

        /* do while */
        String [] xml = {"XML", "in", "easy", "steps"};

        int k = 0;
        if (xml.length > 0) do
        {
            System.out.println("\t\txml["+k+"] - | " + xml[k]);
            k++;
        } while (k < xml.length);

    }
}
