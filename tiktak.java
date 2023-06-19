import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class tiktak {
    public static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    public static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();
    public static void main(String[] args) {
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '}};

        Scanner scan = new Scanner(System.in);
        printGameBoard(gameBoard);
        while(true){
            System.out.print("Ваш ход: ");
            int playerPos = scan.nextInt();
            
            while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPositions)){
                System.out.println("Позиция занята! ");
                playerPos = scan.nextInt();
            }

            placePiece(gameBoard, playerPos, "player");

            String result =  CheckWin();
            if(result.length() > 0){
                System.out.println(result);
                break;
            }

            Random rand = new Random();
            int cpuPos = rand.nextInt(9) + 1;

            while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)){
                cpuPos = rand.nextInt(9) + 1;
            }

            placePiece(gameBoard, cpuPos, "cpu");
            printGameBoard(gameBoard);

            result =  CheckWin();
            if(result.length() > 0){
                System.out.println(result);
                break;
            }

        }
        
    }

    /* Рисуем игровое поле */
    public static void printGameBoard(char[][] gameBoard){
        for(char[] row : gameBoard){
            for (char c : row){
                System.out.print(c);
            }
            System.out.println();

        }
    }

    /* Ход */
    public static void placePiece(char[][] gameBoard, int pos, String user){

        char symbol = ' ';
        if(user.equals("player")){
            symbol = 'X';
            playerPositions.add(pos);
        }else if(user.equals("cpu")){
            symbol = 'O';
            cpuPositions.add(pos);
        }

        switch(pos){
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }

    /* Проверка победы */
    public static String CheckWin(){
        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List botRow = Arrays.asList(7,8,9);
        List leftCol = Arrays.asList(1,4,7);
        List midCol = Arrays.asList(2,5,8);
        List rightCol = Arrays.asList(3,6,9);
        List cross1 = Arrays.asList(1,5,9);
        List cross2 = Arrays.asList(3,5,7);
        
        List<List> wining = new ArrayList<List>();
        wining.add(topRow);
        wining.add(midRow);
        wining.add(botRow);
        wining.add(leftCol);
        wining.add(midCol);
        wining.add(rightCol);
        wining.add(cross1);
        wining.add(cross2);

        for(List l : wining){
            if(playerPositions.containsAll(l)){
                return "Поздравляю!";
            }else if(cpuPositions.containsAll(l)){
                return "Вы проиграли";
            }else if(playerPositions.size() + cpuPositions.size() == 9){
                return "Ничья";
            }
        }

        return "";
    }
}