package JKlevel.fifth;

public class level2 {
    public static void main(String[] args) {
        Student student1=new Student(175);
        Student student2=new Student("175cm");
        Student student3=new Student(175.8);
        System.out.println(student1.getHeight());
        System.out.println(student2.getHeight());
        System.out.println(student3.getHeight());
    }
}
