package BuilderDesignPattern;

import java.util.*;

public class EngineerStudentBuilder extends StudentBuilder {

    public StudentBuilder setSubject(){
        List<String> subjects = new ArrayList<>();
        subjects.add("DSA");
        subjects.add("OS");
        subjects.add("CO");
        this.subjects = subjects;
        return this;
    }
    
}
