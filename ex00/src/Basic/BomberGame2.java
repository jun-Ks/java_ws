package Basic;

import java.util.Scanner;

public class BomberGame2 {
    public static void main(String[] args) {
        char[][] map2 = new char[5][5];
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                map2[i][j] = 'P';
            }
        }
        System.out.println("x 좌표를 입력해주세요. >>");
        int x1 = sc.nextInt();
        System.out.println("y 좌표를 입력해주세요. >>");
        int y1 = sc.nextInt();

        map2[x1][y1] = 'O';

        while(cnt < 10){
            Bomber2 b1  = new Bomber2(map2);

            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 5; j++){
                    System.out.printf("%3c", map2[i][j]);
                }
                System.out.println();
            }
            System.out.println("x 좌표를 입력해주세요.>");
            int x = sc.nextInt();
            System.out.println("y 좌표를 입력해주세요.>");
            int y = sc.nextInt();

            map2[x][y] = 'X';

            boolean tf = b1.dropBomb2(x, y);
            if(tf == true){
                break;
            }else{
                cnt++;
                b1.showBomb2();

            }

        }



    }
}
