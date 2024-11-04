package ss16_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
//        scanner.nextLine();
//
//        Object a = null;
//        System.out.println(a.hashCode());

//        try {
//            FileReader fileReader = new FileReader("");
//        } catch (FileNotFoundException e) {
//            System.out.println("Lỗi");
//        }
//        System.out.println("OK");
       int age = scanner.nextInt();
       if(age < 18) {
           throw new Exception("Tuổi nhỏ hơn 18. Chưa đủ tuổi");
       }
    }

    public static void add() throws FileNotFoundException {
        FileReader fileReader = new FileReader("");
    }
}
