import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Luyt", 28);
        students.put("Binh", 36);
        students.put("Toan", 33);
        students.put("Viet", 20);
        students.put("Cuong", 20);

        System.out.println("Display entire map:");
        System.out.println(students);

        String name = "Viet";
        System.out.println(name + " is " + students.get(name) + " years old.");
    }
}
