public abstract class Transport {
    private String brend;
    private String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    int maxSpeed;

    public Transport(String brend, String model, int productionYear, String productionCountry) {
        if (brend == null) {
            this.brend = "default";
        } else {
            this.brend = brend;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null && color.isEmpty()) {
            this.color = color;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBrend() {
        return brend;
    }

    public String getModel() {
        return model;
    }

    public abstract void refill();
}
