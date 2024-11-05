package ss8_clean_code.view;

import ss8_clean_code.controller.StudentController;
import ss8_clean_code.entity.DTO.StudentDTO;
import ss8_clean_code.entity.Student;
import ss8_clean_code.exeption.CustomException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("--------- Quản lý CodeGym ------------");
            System.out.println("1. Quản lý học sinh");
            System.out.println("2. Quản lý giảng viên");
            System.out.println("3. Thoát");
            System.out.println("Mời bạn nhập lựa chọn");
            int choice = inputChoice();
            switch (choice) {
                case 1:
                    menuStudent();
                    break;
                case 2:
                    System.out.println("Quản lý giảng viên");
                    break;
                case 3:
                    return;
            }
        }

    }

    public static void menuStudent() {
        StudentController studentController = new StudentController();
        int choice;
        List<Student> students;
        Student student;
        while (true) {
            System.out.println("Menu quản lý học sinh");
            System.out.println("1. Hiển thị danh sách học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh");
            System.out.println("4. Xóa học sinh");
            System.out.println("5. Tìm kiếm học sinh theo tên");
            System.out.println("6. Quay lại");
            System.out.print("Nhập lựa chọn: ");
            Scanner scanner = new Scanner(System.in);
            choice = inputChoice();
            switch (choice) {
                case 1:
                    students = studentController.getAll();
                    display(students);
                    break;
                case 2:
                    student = inputStudent();
                    studentController.save(student);
                    System.out.println("Thêm mới thành công");
                    break;
                case 3:
                    System.out.println("Sửa thông tin học sinh");
                    updateStudent();
                    break;
                case 4:
                    System.out.println("Xóa học sinh");
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Tìm kiếm học sinh theo tên");
                    String name = scanner.nextLine();
                    students = studentController.searchByName(name);
                    display(students);
                    break;
                case 6:
                    return;
            }
        }

    }

    private static Student inputStudent() {
//        CustomException exceptionHandler = new CustomException();
        StudentController studentController = new StudentController();
        Scanner scanner = new Scanner(System.in);
        boolean isExistCode = true;
        int code = 0;
        while (isExistCode) {
            try {
                System.out.print("Mời bạn nhập code: ");
                code = Integer.parseInt(scanner.nextLine());
                Student student = studentController.getStudentById(code);
                if (student == null) {
                    isExistCode = false;
                    break;
                } else {
                    System.out.println("Code đã tồn tại, vui lòng chọn lại! ");
                }
            } catch (NumberFormatException e) {
                CustomException.numberFormatException(e);
            }
        }

        String name;
        while (true) {
            try {
                System.out.print("Mời bạn nhập tên: ");
                name = scanner.nextLine();
                CustomException.checkEmptyString(name);
                break;
            } catch (NumberFormatException e) {
                CustomException.numberFormatException(e);
            }
        }

        String address;
        while (true) {
            try {
                System.out.print("Mời bạn nhập địa chỉ: ");
                address = scanner.nextLine();
                CustomException.checkEmptyString(address);
                break;
            } catch (NumberFormatException e) {
                CustomException.numberFormatException(e);
            }
        }

        double point;
        while (true) {
            try {
                System.out.print("Mời bạn nhập điểm: ");
                point = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                CustomException.numberFormatException(e);
            }
        }

        String className;
        while (true) {
            try {
                System.out.print("Mời bạn nhập lớp: ");
                className = scanner.nextLine();
                CustomException.checkEmptyString(className);
                break;
            } catch (NumberFormatException e) {
                CustomException.numberFormatException(e);
            }
        }

        return new Student(code, name, address, point, className);

    }

    public static void display(List<Student> students) {
        System.out.println("Hiển thị danh sách học sinh");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static int inputChoice() {
        Scanner scanner = new Scanner(System.in);
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            return choice;
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai lựa chọn. Mời bạn nhập lại");
        } catch (Exception e) {
            System.out.println("Lỗi khác");
        }
        return 0;
    }

    public static void findStudentById() {
        StudentController studentController = new StudentController();

        Scanner scanner = new Scanner(System.in);
        int code = Integer.parseInt(scanner.nextLine());
        Student student = studentController.getStudentById(code);
        if (student == null) {
            System.out.println("Student Not Found");
        }
        System.out.println(student);
    }

    public static void deleteStudent() {
        StudentController studentController = new StudentController();
        Scanner scanner = new Scanner(System.in);
        int code = Integer.parseInt(scanner.nextLine());

        studentController.deleteStudentById(code);
    }

//    public static Student updateStudentInfo() {
//        Scanner scanner = new Scanner(System.in);
//
//        String name;
//        while (true) {
//            try {
//                System.out.print("Mời bạn nhập tên: ");
//                name = scanner.nextLine();
//                CustomException.checkEmptyString(name);
//                break;
//            } catch (NumberFormatException e) {
//                CustomException.numberFormatException(e);
//            }
//        }
//
//        String address;
//        while (true) {
//            try {
//                System.out.print("Mời bạn nhập địa chỉ: ");
//                address = scanner.nextLine();
//                CustomException.checkEmptyString(address);
//                break;
//            } catch (NumberFormatException e) {
//                CustomException.numberFormatException(e);
//            }
//        }
//
//        double point;
//        while (true) {
//            try {
//                System.out.print("Mời bạn nhập điểm: ");
//                point = Double.parseDouble(scanner.nextLine());
//                break;
//            } catch (NumberFormatException e) {
//                CustomException.numberFormatException(e);
//            }
//        }
//
//        String className;
//        while (true) {
//            try {
//                System.out.print("Mời bạn nhập lớp: ");
//                className = scanner.nextLine();
//                CustomException.checkEmptyString(className);
//                break;
//            } catch (NumberFormatException e) {
//                CustomException.numberFormatException(e);
//            }
//        }
//
//        return new Student(code, name, address, point, className);
//
//    }

    public static StudentDTO studentDto() {
        Scanner scanner = new Scanner(System.in);

        String name;
        while (true) {
            try {
                System.out.print("Mời bạn nhập tên update: ");
                name = scanner.nextLine();
                CustomException.checkEmptyString(name);
                break;
            } catch (NumberFormatException e) {
                CustomException.numberFormatException(e);
            }
        }

        String address;
        while (true) {
            try {
                System.out.print("Mời bạn nhập địa chỉ update: ");
                address = scanner.nextLine();
                CustomException.checkEmptyString(address);
                break;
            } catch (NumberFormatException e) {
                CustomException.numberFormatException(e);
            }
        }

        double point;
        while (true) {
            try {
                System.out.print("Mời bạn nhập điểm update: ");
                point = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                CustomException.numberFormatException(e);
            }
        }

        String className;
        while (true) {
            try {
                System.out.print("Mời bạn nhập lớp update: ");
                className = scanner.nextLine();
                CustomException.checkEmptyString(className);
                break;
            } catch (NumberFormatException e) {
                CustomException.numberFormatException(e);
            }
        }
        return new StudentDTO(name, address, point, className);
    }

    public static void updateStudent() {
        StudentController studentController = new StudentController();

        System.out.println("Vui lòng nhập id student cần update");
        Scanner scanner = new Scanner(System.in);
        int code = Integer.parseInt(scanner.nextLine());

        Student student = studentController.getStudentById(code);
        if (student == null) {
            System.out.println("Student not found !");
            menuStudent();
        }
        System.out.println(student);

        StudentDTO studentInfo = studentDto();

        studentController.updateStudentById(code, studentInfo);
        System.out.println("Update Student Success");
    }

}
