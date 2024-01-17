package BuilderDesignPattern;

import java.util.List;

public  abstract class StudentBuilder{
    int rollNumber;
    int age;
    String name;
    String fatherName;
    String motherName;
    List<String> subjects;

    public StudentBuilder setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
        return this;
    }
    public StudentBuilder setAge(int age){
        this.age = age;
        return this;
    }
    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    abstract public StudentBuilder setSubject();

    public Student Build(){
        return new Student(this);
    }
}