package record;

public class StudentExample {

    public static void main(String[] args) {
        Student student1 = new Student("Ali","Kara",1234);
        Student student2 = new Student("Aslı","Aydın",12345);
        Student student3 = new Student("Burak","Araz",123456);
        Student student4 = new Student("Can","Akın",1234567);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.println(student1.equals(student2));
        System.out.println((student3.hashCode() == student4.hashCode()));

    }
}
