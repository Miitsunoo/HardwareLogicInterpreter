public class Main {
    public static void main(String[] args) {

        HardwareRepository repo = new HardwareRepository();
        Hardware[] inventory = repo.getAllHardware();

        int laptop16 = 0;
        int laptop32 = 0;
        int phone50 = 0;

        System.out.println("===== HARDWARE MASTERLIST =====");
        for (Hardware h : inventory) {
            System.out.println(h.getInterpretedSpecs());

            if (h instanceof Laptop) {
                if (h.getSpecValue() == 16) laptop16++;
                if (h.getSpecValue() == 32) laptop32++;
            } else if (h instanceof Phone) {
                if (h.getSpecValue() == 50) phone50++;
            }
        }

        System.out.println("\n===== INVENTORY COUNTS =====");
        System.out.println("16GB Laptops: " + laptop16);
        System.out.println("32GB Laptops: " + laptop32);
        System.out.println("50MP Phones: " + phone50);
    }
}