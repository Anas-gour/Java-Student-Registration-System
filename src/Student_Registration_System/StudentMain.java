package Student_Registration_System;

import java.util.Scanner;

public class StudentMain {
    public static void main(String [] args){
        Scanner sc = StudentService.sc;
        
        System.out.println("+++++++++++ WELCOME TO REGISTRATION FORM ++++++++++++");
        
        while (true){
            System.out.println("1]. Register Student ");
            System.out.println("2]. Show All Students ");
            System.out.println("3]. Search Student By Id ");
            System.out.println("4]. Remove Student By Id ");
            System.out.println("Enter Your Choice:");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice){
                case 1:
                    System.out.println("Enter Id:  ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter Student Course: ");
                    String course = sc.nextLine();
                    System.out.println("Enter Student Contact Number: ");
                    long contact = sc.nextLong();
                    StudentService.registerStudent(new Student(id,name,course,contact));
                    break;
                case 2:
                    StudentService.displayAllStudents();
                    break;
                case 3:
                    System.out.println("Enter id: ");
                    int SearchId = sc.nextInt();
                    StudentService.searchStudent(SearchId);
                    break;
                case 4:
                    System.out.println("Enter Student Id: ");
                    int remove = sc.nextInt();
                    StudentService.removeStudent(remove);
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
            
        }
    }
}
