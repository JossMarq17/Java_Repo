package Practicas.OOP;

public class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;

    public Student(String name,String lastName, int registration, int grade, int year){
        this.firstName = name;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }

    public void printFullName() {
        System.out.println("Name Student: " + this.firstName + " " + this.lastName);
    }

    public boolean isApproved() {
        if(this.grade>=60){
            return true;
        }
        return false;
    }

    public int changeYearIfApproved() {
        if(this.grade>=60){
            year+=1;
            System.out.println("Congratulations");
        }
        return 0;
    }

    public int getGrade(){
        return this.grade;
    }
}
