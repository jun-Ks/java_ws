package Basic;

public class OverloadingTest {
    public static void main(String[] args) {

        Human h1 = new Human("김철수", "미국", '남');
        System.out.println(h1.getCounter()); //1
        h1.showInfo();

        Human h2 = new Human("이순신", "한국", '남');
        System.out.println(h2.getCounter()); //2
        System.out.println(h1.getCounter()); //2
        h2.showInfo();

        Human h3 = new Human("영희", "중국", '여');
        System.out.println(h3.getCounter()); //3
        h3.showInfo();



    }
}
