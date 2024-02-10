import model.Student;

public class Main {
    /*Importante "throws" a Exception ya que con Cloneable cabe la posibilidad,
    se puede ser más específico para optimizar recursos */

    public static void main(String[] args) throws Exception{
        Student s1=new Student("Pedro","9723847234",25);
        Student s2=new Student();

        /*
         * Clono al estudiante 1 en estudiante 2, 
         * especifico que el objeto es de dicha clase
         */

        
        s2=(Student)s1.clone();
        
        System.out.println(s1+"\n");
        System.out.println(s2+"\n");

        /* Comprobación de que aunque sea una copia no es "igual"
         * Esto es debido a que apuntan a diferentes direcciones de memoria
         */
        System.out.println(s1.equals(s2)?"Son iguales":"No son iguales");
    }
}
