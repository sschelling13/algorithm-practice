package maps;

import java.util.HashMap;

public class Maps {

    static public void main(String[] args) {

        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("John", 42069);
        empIds.put("Carl", 54321);

        System.out.println(empIds);
        System.out.println(empIds.get("Carl"));
        System.out.println(empIds.containsKey("John"));
        System.out.println(empIds.containsValue(42069));

        empIds.put("John", 12345);
        System.out.println(empIds.get("John"));

        // replace only replaces if value already exists, put will write over null
        empIds.replace("John", 777);
        System.out.println(empIds.get("John"));
        empIds.replace("Kramer", 777);
        System.out.println(empIds.get("Kramer"));

        empIds.putIfAbsent("John", 222);
        System.out.println(empIds.get("John"));

        empIds.remove("Kramer");
        System.out.println("1: " + empIds.get("John"));

        HashMap<String, Integer> empIds2 = (HashMap<String, Integer>) empIds.clone();
        System.out.println("2: " + empIds2.get("John"));
    }
}
