package classstructureconstructors;

public class StoreMain {

    public static void main(String[] args) {
        Store bagStore = new Store("bag");
        bagStore.store(100);
        System.out.println(bagStore.getProduct() + ":" + bagStore.getStock());

        Store crystalStore = new Store("crystal");
        crystalStore.store(1000);
        System.out.println(crystalStore.getProduct() + ":" + crystalStore.getStock());

        bagStore.dispatch(50);
        crystalStore.dispatch(500);
        bagStore.store(30);
        crystalStore.store(400);

        System.out.println(bagStore.getProduct() + ":" + bagStore.getStock());
        System.out.println(crystalStore.getProduct() + ":" + crystalStore.getStock());
    }





}
