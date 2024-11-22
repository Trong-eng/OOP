package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;


public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    // Phương thức thêm DVD vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered++] = disc;
            System.out.println("This DVD has been added.");
        } else {
            System.out.println("The cart is full.");
        }
    }

    // Phương thức thêm nhiều DVD vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemsOrdered[qtyOrdered++] = disc;
                System.out.println("This DVD has been added: " + disc.getTitle());
            } else {
                System.out.println("The cart is full. Cannot add " + disc.getTitle());
                break;
            }
        }
    }

    // Phương thức thêm hai DVD vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered++] = dvd1;
            System.out.println("This DVD has been added: " + dvd1.getTitle());
        } else {
            System.out.println("The cart is full. Cannot add " + dvd1.getTitle());
        }

        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered++] = dvd2;
            System.out.println("This DVD has been added: " + dvd2.getTitle());
        } else {
            System.out.println("The cart is full. Cannot add " + dvd2.getTitle());
        }
    }

    // Phương thức xóa DVD khỏi giỏ hàng
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                itemsOrdered[i] = itemsOrdered[--qtyOrdered];
                itemsOrdered[qtyOrdered] = null;
                System.out.println("The item has been deleted.");
                return;
            }
        }
        System.out.println("The item is not found.");
    }

    // Phương thức in thông tin giỏ hàng
    public void print() {
        System.out.println("********************CART********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("*********************************************");
    }

    // Tính tổng chi phí của các DVD trong giỏ hàng
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
}
