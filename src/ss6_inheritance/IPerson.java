package ss6_inheritance;

public interface IPerson {
    //    Không có thuộc tính, mà chỉ có hằng số
//    100% là abstract method. Từ Java8 có hỗ trợ 2 từ khóa là default và static giúp khai báo method bình thường
//    Không có constructor
//    1 class có thể implement nhiều interface => khắc phục 1 phần vấn đề đa kế thừa.
//Mặc định public static final
    int COUNT = 0;

    //    mặc định là public abstract
    void work();

    void swim();
}
