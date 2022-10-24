package practice;

public class OverloadingTest2 {
    public static void main(String[] args) {
        Human2 p1 = new Human2("김철수", 23, '남', "대한민국");
        p1.showInfo();
        p1.getCnt();

        Human2 p2 = new Human2("김미경", 40, '여', "대한민국");
        p2.showInfo();
        p2.getCnt();
    }
}
