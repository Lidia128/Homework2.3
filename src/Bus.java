public class Bus extends Transport {

    public Bus(String brend, String model, int productionYear, String productionCountry) {
        super(brend, model, productionYear, productionCountry);
    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем на заправке.");

    }
}
