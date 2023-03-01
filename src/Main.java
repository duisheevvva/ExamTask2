import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        Car[] cars = {new Car("tayota camry", LocalDate.of(2004, 4, 8), 400000, TypeBody.HATCHBACK),
                new Car("sonata", LocalDate.of(2000, 4, 3), 300000, TypeBody.SEDAN),
                new Car("niva", LocalDate.of(2003, 4, 5), 300000, TypeBody.SUV),
                new Car("estima", LocalDate.of(2005, 2, 3), 200000, TypeBody.STATIONWAGON),
        new Car("djip",LocalDate.of(2006,3,5),400000,TypeBody.CROSSOVER)};
        for (Car car : cars) {
            car.bodyTypeIdentification();
            car.determinationYearOfManufacture();
        }


    }
}