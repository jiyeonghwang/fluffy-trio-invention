package Jisu;

import java.util.Scanner;

public class Main2578JS {
    public static int[][] bingos;
    public static int bingoCount = 0;

    public static void rowCheck(){
        for(int i=0; i<5; i++){
            int count = 0;
            for(int j=0; j<5; j++){
                if (bingos[i][j]==0) count+=1;
            }
            if(count==5) bingoCount+=1;
        }
    }
    public static void columnCheck(){
        for(int i=0; i<5; i++){
            int count = 0;
            for(int j=0; j<5; j++){
                if (bingos[j][i]==0) count+=1;
            }
            if(count==5) bingoCount+=1;
        }
    }
    public static void leftCheck(){
        int count = 0;
        for(int i=0; i<5; i++){
            if (bingos[i][i]==0) count+=1;

        }
        if(count==5) bingoCount+=1;
    }
    public static void rightCheck(){
        int count = 0;
        for(int i=0; i<5; i++){
            if (bingos[i][5-i-1]==0) count+=1;

        }
        if(count==5) bingoCount+=1;
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        bingos = new int[5][5];

        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                bingos[i][j] = sc.nextInt();
            }
        }

        for(int x=0; x<25; x++){
            int num = sc.nextInt();
            for(int i=0; i<5; i++){
                for(int j=0; j<5; j++){
                    if(bingos[i][j] == num) bingos[i][j] = 0;
                }
            }
            rowCheck();
            columnCheck();
            leftCheck();
            rightCheck();
            if (bingoCount >=3) {
                System.out.println(x+1);
                break;
            } else bingoCount = 0;
        }

    }
}
