package Basic;

public class CalcTest {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int plus = c.plus(3, 5);
        int minus = c.minus(6, 3);
        int multipl = c.multipl(5, 8);
        int division = c.division(12, 6);

        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multipl);
        System.out.println(division);
    }
}
