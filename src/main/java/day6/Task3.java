package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Игорь Артурович Иванов ", "Математика");
        Student student = new Student("Владислав Александрович Корпейкин");

        teacher.evaluate(student);
    }
}
