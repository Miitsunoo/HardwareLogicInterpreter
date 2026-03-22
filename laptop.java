public class Laptop extends Hardware {
 
    public Laptop(int id, String brand, int spec) {
        super(id, brand, spec, "Laptop");
    }
 
    @Override
    public String getSpecDescription() {
        return spec + "GB RAM";
    }
}
 