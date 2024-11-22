package hust.soict.dsai.garbage;

public class GarbageCreator {
    public static void main(String[] args) {
        String s = ""; // Chuỗi ban đầu
        long startTime = System.currentTimeMillis();

        // Tạo chuỗi cực lớn bằng cách nối liên tục
        for (int i = 0; i < 100000; i++) {
            s += "garbage"; // Sử dụng phép nối chuỗi (tạo nhiều garbage)
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Execution time with garbage: " + (endTime - startTime) + " ms");

        // Chờ chương trình dừng để quan sát bộ nhớ
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
