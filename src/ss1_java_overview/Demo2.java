package ss1_java_overview;

public class Demo2 {
    public static void main(String[] args) {
        int a = 5;
//        ép kiểu ngầm định. Tự động ép từ kiểu dữ liệu nhỏ sang kiểu dữ liệu lớn
        float b = 2l;
        float c = a / b;
        System.out.println(c);
//        ép kiểu tường minh. Dev chủ động chuyển 1 kiểu dữ liệu lớn sang 1 kiểu dữ liệu nhỏ hơn
        byte d = (byte)a;
    }
}
