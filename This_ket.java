package thiskey;
class Student {
    int id;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display() {
        // 'this' refers to the current object
        System.out.println("Student ID: " + this.id);
        System.out.println("Student Name: " + this.name);
    }
    Student get() {
        return this;
    }
    void print() {
        this.display();
    }
}
public class This_ket {
    public static void main(String[] args) {
        Student student = new Student(101, "Manish Kumar Tiwari");
              student.display();
       Student anotherStudent = student.get();
        anotherStudent.print();
    }
}
