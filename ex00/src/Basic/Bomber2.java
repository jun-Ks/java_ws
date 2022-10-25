package Basic;

public class Bomber2 {
    static int bombs = 10;
    char map2 [][];

    public Bomber2(char[][]map2){
        this.map2 = map2;
    }
    boolean dropBomb2(int x, int y){
        if(map2[x][y] == 'O'){
            bombs -= 1;
            System.out.println("명중입니다.");
            return true;
        }else{
            bombs -= 1;
            System.out.println("불발입니다.");
            return false;
        }
    }
    public void showBomb2(){
        System.out.println("남은 폭탄의 개수는 "+bombs+"개 입니다.");
    }
}
