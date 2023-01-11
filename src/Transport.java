public class Transport {
    protected final String brand;
    protected final String model;
    protected final int year;
    protected String country;
    protected String color;
    protected int maxSpeed;
    private static final String DEFAULT_VALUE = "default";
    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_YEAR = 2000;

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {

        if (brand == null || brand.isEmpty()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }

        if (color == null || color.isEmpty()) {
            this.color = DEFAULT_COLOR;
        } else {
            this.color = color;
        }

        if (year < 0) {
            this.year = DEFAULT_YEAR;
        } else {
            this.year = year;
        }

        if (country == null || country.isEmpty()) {
            this.country = DEFAULT_VALUE;
        } else {
            this.country = brand;
        }

        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        }
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
