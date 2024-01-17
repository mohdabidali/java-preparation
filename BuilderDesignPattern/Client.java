package BuilderDesignPattern;

public class Client {
    public static void main(String[] args) {
        Director director = new Director(new EngineerStudentBuilder());
        Student engineerStudent = director.createStudent();
        System.out.println(engineerStudent.toString());
    }
}
