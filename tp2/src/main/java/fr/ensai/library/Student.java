package fr.ensai.library;

public class Student {
    private String name ;
    private int age;
    private int academicyear;
    private boolean isClasseDeleguete; 

    public Student(String name, int age , int academicyear, boolean isClasseDeleguete){
        this.name = name;
        this.age = age;
        this.academicyear = academicyear;
        this.isClasseDeleguete=isClasseDeleguete;
    }

    public String toString(){
        return "The student" + this.name + this.age + this.academicyear + this.isClasseDeleguete;
    }
}
