
public class Car extends Transport {
//    public Car(String brand, String model, int year, String country, String color, int maxSpeed) {
//        super(brand, model, year, country, color, maxSpeed);
//    }

    private class Key {
        private final boolean remoteStart;
        private final boolean keylessAccess;

        public Key(boolean remoteStart, boolean keylessAccess) {
            this.remoteStart = remoteStart;
            this.keylessAccess = keylessAccess;
        }
    }
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seats;
    private boolean winterTires;
    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGIN_VOLUME = 1.5;
    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_YEAR = 2000;
    private static final int DEFAULT_SEATS = 5;

    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String transmission, String bodyType, String registrationNumber, int seats, boolean winterTires, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);

        if (engineVolume <= 0) {
            this.engineVolume = DEFAULT_ENGIN_VOLUME;
        } else {
            this.engineVolume = engineVolume;
        }

        if (transmission == null || transmission.isEmpty()) {
            this.transmission = DEFAULT_VALUE;
        } else {
            this.transmission = transmission;
        }

        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = DEFAULT_VALUE;
        } else {
            this.bodyType = bodyType;
        }

        if (registrationNumber == null || registrationNumber.isEmpty()) {
            this.registrationNumber = DEFAULT_VALUE;
        } else {
            this.registrationNumber = registrationNumber;
        }

        if (seats <= 0) {
            this.seats = DEFAULT_SEATS;
        } else {
            this.seats = seats;
        }

        this.winterTires = winterTires;
    }

    public void changeTires (int month) {
        if (month > 3 && month < 9) {
            setWinterTires(false);
        } else if (month < 3 && month > 9 && month <= 12) {
            setWinterTires(true);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", seats=" + seats +
                ", winterTires=" + winterTires +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }
}
