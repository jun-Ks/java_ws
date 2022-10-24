package Basic;

public class StudentTest {
    public static void main(String[] args) {
        /*Student s1 = new Student(); //기본 생성자  s1 = 참조변수
        s1.sno = 1;
        s1.name = "홍길동";
        s1.grade = 2;
        s1.clas = 3;
        s1.showInfo();*/

        Student s2 = new Student(2, "김철수");
        s2.grade = 3;
        s2.clas = 4;
        s2.showInfo();

        Student s3 = new Student(3, "홍철수", 4, 6);
        s3.showInfo();

    }
}
