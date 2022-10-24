package Basic;

import java.sql.SQLOutput;

public class Human {
    String name;
    String nationality;
    char gender;
    static int count; //static을 쓰지 않으면 count 수가 늘지 않음
    //static 생성 되어있는 모든 객체와 공유해서 씀 static없으면 공유되지않음
    public Human(String n, String nation, char gen){
        count++;
        name = n;
        nationality = nation;
        gender = gen;
    }
    public void showInfo(){
        System.out.println(name +" " + nationality +" "+ gender);
    }
    public int getCounter(){
        return count;
    }
}
