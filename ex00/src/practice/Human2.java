package practice;

public class Human2 {
    String name;
    int age;
    char gender;
    String nation;
    static int cnt;
    public Human2 (String name, int age, char gender, String nation){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nation = nation;
        cnt++;
    }
    public void showInfo(){
        System.out.println(name + " " + age + " " + gender+ " " + nation + " ");
    }
    public int getCnt(){
        System.out.println(cnt);
        return cnt;
    }
}
