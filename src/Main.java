public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Granda", 1.7, "желтый", 2015,
                "России", "седан", 5);
        lada.setRegNumber("в025ук158");

        Car audi = new Car("Audi", "A8 50L TDI guattro", 3.0, "черный", 2020,
                "Германии", "хечбек", 2);
        audi.setGears("автомат");

        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021,
                "Германии", "кабриолет", 2);
        bmw.setSummerTyres(false);

        Car kia = new Car("Kia", "portaSge 4-го поколения", 2.4, "красный",
                2018, "Южной Корее", "фургон", 8);

        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016,
                "Южной корее", "хэчбек", 5);
        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hyundai);

        lada.refill();
        audi.refill();
        bmw.refill();
        kia.refill();
        hyundai.refill();

    }

    private static void printInfo(Car car) {
        System.out.println(car.getBrend() + " " + car.getModel() + "," + car.getProductionYear() +
                " год выпуска, сборка в " + car.getProductionCountry() + ", " + car.getColor() + " цвет кузова, объем двигателя — " + car.getEngineVolume() + " л."
                + ", коробка передач  " + car.getGears() + ", тип кузова " + car.getTypeOfBody() +
                ", регистрационный номер " + car.getRegNumber() + ", количество мест " + car.getSeatsCount()
                + (car.isSummerTyres() ? ", шины " + "летняя" : "зимняя"));
    }
    {
    Train lastochka = new Train("Ласточка", "B-901", 2011,
            "Россия", 301, "Белорусского вокзала",
            "Минск-Пассажирский", 3500, 11);

    Train leningrad = new Train("Ленинград", "D-125", 2019,
            "Россия", 270, "Ленинградского вокзала",
            "Ленинград-Пассажирский", 1700, 8);

        printInfoTrain(lastochka);
        printInfoTrain(leningrad);
        lastochka.refill();
        leningrad.refill();
   }

    private static void printInfoTrain(Train train) {
        System.out.println("Поезд " + train.getBrend() + ", модель " + train.getModel() + ", " + train.getProductionYear()
                + "год выпуска в " + train.getProductionCountry() + ", скорость передвижения — " +
                train.maxSpeed + "км/ч, отходит от " + train.getNameStationDeparted() +
                " и следует до станции " + train.getEndStation() + ". Цена поездки — " +
                train.getPriceTrip() + " рублей, в поезде " + train.getVogon() + " вагонов.");
    }

    {
        Bus mihaylovka = new Bus("Икарус", "2548", 1983, "Чехословакия");
        Bus moskva = new Bus("Экобас", "Д-658", 2021, "Россия");
        Bus kopeysk = new Bus("Волжанин", "24-75", 2019, "Россия");


        printInfoBus(mihaylovka);
        printInfoBus(moskva);
        printInfoBus(kopeysk);

        mihaylovka.refill();
        moskva.refill();
        kopeysk.refill();
    }

    private static void printInfoBus(Bus bus) {
        System.out.println("Автобус " + bus.getBrend() + ", модель " + bus.getModel() + ", "
                + bus.getProductionYear()
                + "год выпуска в " + bus.getProductionCountry() + ", скорость передвижения — ");
    }
}

