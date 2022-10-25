package Basic;

public class Bomber {
    //폭탄갯수 = 10, 폭탄투하() -> 폭탄갯수가 줄어들어야됨.
    static int bombs = 10;
    char[][] map;

    public Bomber(char[][]map){
        this.map = map;
    }

    boolean dropBomb(int x, int y){
        if(map[x][y] == 'O'){
            bombs -= 1;
            System.out.println("명중");
            return true;
        }else{
            bombs -= 1;
            System.out.println("불발");
            return false;
        }
    }
    public void showBombs(){

        System.out.println("남은 폭탄 개수: "+bombs);
    }
}
