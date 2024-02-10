import model.Student;

public class Main {
    public static void main(String[] args) throws Exception{
        Student s1=new Student("Pedro","9723847234",25);

        Student s2=new Student();
        s2=(Student)s1.clone();
        
        System.out.println(s1+"\n");
        System.out.println(s2+"\n");
        System.out.println(s1.equals(s2)?"Son iguales":"No son iguales");
    }
}
