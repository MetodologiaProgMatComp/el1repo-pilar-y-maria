import es.uah.matcomp.el1.p3.Person;
import es.uah.matcomp.el1.p3.Staff;
import es.uah.matcomp.el1.p3.Student;

public class MainPerson {
    public static void  main(String[] args) {
        Person person = new Person("John Doe", "123 Main Street");
        Student student = new Student("Alice Smith", "333 Oxford Street", "Mathematics", 2023,2500.0);
        Staff staff = new Staff("Bob Johnson", "789 Oak Street", "High School", 3000.0);

        System.out.println("Información de la persona:");
        System.out.println(person);

        System.out.println("\nInformación del estudiante:");
        System.out.println(student);

        System.out.println("\nInformación del staff:");
        System.out.println(staff);

    }

}
