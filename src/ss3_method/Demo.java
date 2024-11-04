package ss3_method;

import ss5_access_modifier.Student;

import java.util.Scanner;

public class Demo extends Student{
    String name;
    int age;
    static String className =  "C0724M1";
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Demo demo = new Demo();
        int num = Integer.parseInt(sc.nextLine());
        if (demo.isPrime(num)) {
            System.out.println("Prime number");
        }else {
            System.out.println("Not Prime number");
        }
        Student student= new Student();
        demo.study();
    }
}
