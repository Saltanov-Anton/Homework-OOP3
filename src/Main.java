public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota", "Mark2", 2.5, "Snow queen", 1995, "Japan"
                , "manual", "sedan", "E160CY75RUS", 5, false);

        System.out.println(car);

        Car carGranta = new Car( null,"Granta", 1.7, "yellow", 2015, "Russia", "auto"
                , "sedan", "A009AA80rus", 5, true);

        Car carA8 = new Car("Audi", "A8", 3.0, "black", 2020, "Germany"
                , "manual", "sedan", "C666CC99rus", 5, true);

        Car carZ8 = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany"
                , "manual", "sedan", "d987vv99rus", 5, true);

        Car carSportage = new Car("KIA", "Sportage", 0, "red", 2016, "South Korea"
                , "manual", "sedan", "A777AA99rus", 5, true);

        Car carAvante = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea"
                , "manual", "sedan", "E555EE99rus", 5, true);

        System.out.println(carGranta.toString());
        System.out.println(carA8.toString());
        System.out.println(carZ8.toString());
        System.out.println(carSportage.toString());
        System.out.println(carAvante.toString());
    }
}