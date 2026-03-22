public abstract class Hardware {
    private int id;
    private String brand;
    protected int spec;
    private String type;

    public Hardware(int id, String brand, int spec, String type) {
        this.id = id;
        this.brand = brand;
        this.spec = spec;
        this.type = type;
    }

    public abstract String getSpecDescription();

    // Getters
    public int getId() { return id; }
    public String getBrand() { return brand; }
    public int getSpec() { return spec; }
    public String getType() { return type; }

    @Override
    public String toString() {
        return String.format("%-5d %-20s %-10s %-10s", id, brand, getSpecDescription(), type);
    }
}