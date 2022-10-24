package Basic;

public class Clactest2 {

    public static void main(String[] args) {
        int plus = Calculator2.plus(3,5); //클래스를 참조변수 대용으로 쓰면 static 사용
        int minus = Calculator2.minus(5,3);
        int multipl = Calculator2.multipl(6, 7);
        double division = Calculator2.division(12, 6);

        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multipl);
        System.out.println(division);
    }
}
