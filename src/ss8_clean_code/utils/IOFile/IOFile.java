package ss8_clean_code.utils.IOFile;

import ss8_clean_code.entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFile {

    public static final String PATH_FILE = "src/ss8_clean_code/data/student.csv";

    public static List<Student> readFile(Student student) {
        List<Student> students = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(PATH_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                student = new Student(Integer.parseInt(temp[0]), temp[1], temp[2], Double.parseDouble(temp[3]), temp[4]);
                students.add(student);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        }
        return students;
    }

    public static void writeFile(List<Student> students, boolean append) {
        File file = new File(PATH_FILE);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Student temp : students) {
                bufferedWriter.write(toString(temp));
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    System.out.println("Lỗi đóng file");
                }
            }
        }
    }

    private static String toString(Student s) {
        return s.getCode() + "," + s.getName() + "," + s.getAddress() + "," + s.getPoint() + "," + s.getClassName();
    }

}


