public class Train extends Transport {

    private double priceTrip;
    private double timeTrip;
    private String nameStationDeparted;
    private String endStation;
    private int vogon;

    public Train(String brend, String model, int productionYear, String productionCountry, int maxSpeed,
                 String nameStationDeparted, String endStation, double priceTrip, int vogon) {
        super(brend, model, productionYear, productionCountry);

        this.priceTrip = priceTrip;
        this.nameStationDeparted = nameStationDeparted;
        this.endStation = endStation;
        this.vogon = vogon;
    }

    public double getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(double priceTrip) {
        this.priceTrip = priceTrip;
    }

    public double getTimeTrip() {
        return timeTrip;
    }

    public void setTimeTrip(double timeTrip) {
        this.timeTrip = timeTrip;
    }

    public String getNameStationDeparted() {
        return nameStationDeparted;
    }

    public void setNameStationDeparted(String nameStationDeparted) {
        this.nameStationDeparted = nameStationDeparted;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public int getVogon() {
        return vogon;
    }

    public void setVogon(int vogon) {
        this.vogon = vogon;
    }

    @Override
    public void refill() {
        System.out.println("Нужно заправлять дизелем.");
    }
}
