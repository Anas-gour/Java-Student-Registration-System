package Student_Registration_System;

public class Student {
    private int id;
    private String name;
    private String course;
    private long phone;
    
    public Student(int id, String name, String course, long phone){
        this.id = id;
        this.name = name;
        this.course = course;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "{ Id: " + id +
                " Name: " + name +
                " Course: " + course +
                " Phone: " + phone + " }";
    }
    
    public int getId(){
        return id;
    }
    
    @Override
    public int hashCode(){
        return Integer.hashCode(id);
    }

    @Override
    public boolean equals(Object obj){
        if (this==obj){
            return true;
        }
        if (!(obj instanceof Student)){
            return false;
        }
        Student student = (Student) obj;
        return this.id == student.id;
    }
    
}
