package Basic;

public class Student {
    int sno;
    String name;
    int grade;
    int clas;

    void showInfo() {
        System.out.println("번호: " + sno +"번 " + "이름: " + name  +" "+ grade + "학년 " + clas + "반");
    }

    public Student (int n1, String s1){
        sno = n1;
        name = s1;
    }
    public Student (int n2, String s2, int g, int c){
        sno = n2;
        name = s2;
        grade = g;
        clas = c;
    }

}

