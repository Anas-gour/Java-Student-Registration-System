package Student_Registration_System;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class StudentService {
     static HashSet<Student> set = new HashSet<>(100,0.9f);
     static Scanner sc = new Scanner(System.in);
    public static void registerStudent(Student student){
        boolean result = set.add(student);
        if (result){
            System.out.println("Student Register Successfully!!");
        }
        else{
            System.out.println("Student Already Exists!");
        }
    }
    public static void displayAllStudents(){
        if (!set.isEmpty()){
            Iterator<Student> cursor = set.iterator();
            while (cursor.hasNext()){
                System.out.println(cursor.next());
            }
        }
        else{
            System.out.println("List is Empty!!");
        }
    }
    
    public static void searchStudent(int id){
        if (!set.isEmpty()){
            boolean found = false;
            Iterator<Student> cursor = set.iterator();
            while (cursor.hasNext()){
                Student element = cursor.next();
                if (element.getId()==id){
                    System.out.println(element);
                    System.out.println("~~~~~~~~~~~~~~ Student All Details ~~~~~~~~~~~~~~");
                    found = true;
                    break;
                    
                }
            }
            if (found){
                System.out.println("Student Found!!");
            }else{
                System.out.println("Student not Found!!");
            }
        }else{
            System.out.println("Student Set is Empty!!");
        }
    }
    
    public static void removeStudent(int id){
        if (!set.isEmpty()){
            Iterator<Student> cursor = set.iterator();
            boolean found = false;
            while (cursor.hasNext()){
                Student student = cursor.next();
                if (student.getId()==id){
                    cursor.remove();
                    found = true;
                    break;
                }
            }
            if (found){
                System.out.println("Student Removed Successfully!!");
            }else{
                System.out.println("Student not found!!");
            }
        }else{
            System.out.println("Student Set is Empty!!");
        }
    }
    
    
}
