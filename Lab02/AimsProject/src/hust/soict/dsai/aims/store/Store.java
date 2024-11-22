package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
public class Store {
    public static final int MAX_ITEMS_IN_STORE = 50;
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_ITEMS_IN_STORE];
    private int qtyInStore = 0;

    // Phương thức thêm DVD vào cửa hàng
    public void addDVD(DigitalVideoDisc disc) {
        if (qtyInStore < MAX_ITEMS_IN_STORE) {
            itemsInStore[qtyInStore++] = disc;
            System.out.println("This DVD has been added to the store: " + disc.getTitle());
        } else {
            System.out.println("The store is full. Cannot add " + disc.getTitle());
        }
    }

    // Phương thức xóa DVD khỏi cửa hàng
    public void removeDVD(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i].equals(disc)) {
                itemsInStore[i] = itemsInStore[--qtyInStore];
                itemsInStore[qtyInStore] = null;
                System.out.println("The item has been removed from the store: " + disc.getTitle());
                return;
            }
        }
        System.out.println("The item is not found in the store.");
    }
}
