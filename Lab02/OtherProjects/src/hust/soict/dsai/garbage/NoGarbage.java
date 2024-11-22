package hust.soict.dsai.garbage;

public class NoGarbage {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // Sử dụng StringBuilder để tối ưu
        long startTime = System.currentTimeMillis();

        // Tạo chuỗi cực lớn mà không tạo "garbage"
        for (int i = 0; i < 100000; i++) {
            sb.append("garbage"); // Sử dụng append thay vì nối chuỗi
        }

        String s = sb.toString(); // Kết quả cuối cùng
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time without garbage: " + (endTime - startTime) + " ms");

        // Chờ chương trình dừng để quan sát bộ nhớ
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

