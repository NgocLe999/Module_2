package ss8_clean_code.exeption;

public class CustomException {

    public static void numberFormatException(NumberFormatException e) {
        System.out.println("Bạn nhập không đúng định dạng hoặc đang để trống. Vui lòng nhập lại !");
    }
    
    public static void checkEmptyString(String string) {
        if (string.trim().isEmpty()) throw new NumberFormatException("Empty String");
    }

}
