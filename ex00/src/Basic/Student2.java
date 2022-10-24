package Basic;

public class Student2 {
    int sno;
    String name;

    Student2(){
        this(0, "이름없음"); //생성자를 호출
    }
    Student2(int sno, String name){ //생성자
        this.sno = sno;
        this.name = name;
    }
}
