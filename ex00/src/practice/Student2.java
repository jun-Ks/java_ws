package practice;

public class Student2 {
    int sno;
    String name;
    int grade;
    int clas;

    public Student2 (int n){
        sno = n;

    }
    public void showSno(){
        System.out.println(sno);
    }
    public void showInfo(){
        System.out.println(sno + "번 " + name + " "+ grade + "학년 "+ clas + "반 ");
    }
}
