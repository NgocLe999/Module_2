package ss2_loop_array;

public class DemoArray {
    public static void main(String[] args) {
//        Hiển thị 30 số nguyên tố đầu tiên
        int count = 0;
        int num = 2;
        boolean isPrime;
        while (count < 30) {
            isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
