package hust.soict.dsai.aims.disc;
public class DigitalVideoDisc {
    // Các thuộc tính của đối tượng
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // Biến lớp để theo dõi số lượng DVD được tạo
    private static int nbDigitalVideoDiscs = 0;

    // Thuộc tính id của từng đối tượng
    private int id;

    // Setter cho title
    public void setTitle(String title) {
        this.title = title;
    }

    // Constructor với một tham số title
    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Constructor với tất cả các tham số
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Constructor với ba tham số title, category, cost
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Getter cho id
    public int getId() {
        return id;
    }

    // Getter cho title
    public String getTitle() {
        return title;
    }

    // Getter cho category
    public String getCategory() {
        return category;
    }

    // Getter cho director
    public String getDirector() {
        return director;
    }

    // Getter cho length
    public int getLength() {
        return length;
    }

    // Getter cho cost
    public float getCost() {
        return cost;
    }

    // Phương thức isMatch để tìm kiếm dựa trên title
    public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title);
    }

    // Phương thức toString để in thông tin chi tiết của đối tượng
    @Override
    public String toString() {
        return "DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + " $";
    }
}
