package model;
import java.lang.Cloneable;

public class Student implements Cloneable{
    private String name;
    private String dni;
    private int age;

    public Student(){}
    public Student(String name, String dni, int age){
        this.setName(name);
        this.setDni(dni);
        this.setAge(age);
    }
    public String getName() {
        return name;
    }
    public String getDni() {
        return dni;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", dni=" + dni + ", age=" + age + "]";
    }
    @Override
    public Object clone() throws CloneNotSupportedException{ 
        return super.clone(); 
    }
}