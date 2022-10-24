package Basic;

public class FuntionTest {
    public static void main(String[] args) {
        int a = 10, b = 5;
      add(a, b); //출력물 : 15
      add(3,5); // 출력물 : 8
        int x = add(10,5);
        System.out.println(x); // 출력물 : 15
    }
    public static int add(int n, int m /*매개변수*/){
        int result = n+m;
        return result;
    }
}
