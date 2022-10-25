package Basic;

import java.util.Scanner;

public class BomberGame {
    public static void main(String[] args) {
      /*  Bomber air1 = new Bomber(); //폭격기생성
        air1.dropBomb(); //폭탄투하
        System.out.println(air1.bombs); //폭탄의 개수*/
        int cnt = 0;
        char[][] map = new char[5][5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) { //map에 p넣기
            for (int j = 0; j < 5; j++) {
                map[i][j] = 'P';
            }
        }
        System.out.println("x좌표 입력>"); //타겟생성
        int x1 = sc.nextInt();
        System.out.println("y좌표 입력>");
        int y1 = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (map[i][j] == map[x1][y1]) {
                    map[x1][y1] = 'O';
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%3c", map[i][j]);
            }
            System.out.println();
        }
        while (cnt < 10) { //폭격좌표
            Bomber bb = new Bomber(map);

            System.out.println("x 좌표를 입력해주세요. >>");
            int tg_x = sc.nextInt();
            System.out.println("y 좌표를 입력해주세요. >>");
            int tg_y = sc.nextInt();


            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 5; j++){
                    if(map[i][j] == map[tg_x][tg_y]){
                        map[tg_x][tg_y] = 'X';
                    }
                }
            }
            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 5; j++){
                    System.out.printf("%3c", map[i][j]);
                }
                System.out.println();
            }

            boolean tf = bb.dropBomb(tg_x, tg_y);
            if(tf == true){
                break;
            }else{
                cnt++;
                bb.showBombs();
            }
        }
    }
}

