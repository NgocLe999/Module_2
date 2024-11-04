package ss1_java_overview;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        System.out.println("Số bạn vừa nhập là " + c);

        String json = """
                {
                  "name": "John",
                  "age": 30
                }
                """;
        System.out.println(json);

    }
}