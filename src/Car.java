import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Car {
    private String marka;
    private LocalDate foundOfYear;
    private double price;
    private TypeBody typeBody;

    public Car(String marka, LocalDate foundOfYear, double price, TypeBody typeBody) {
        this.marka = marka;
        this.foundOfYear = foundOfYear;
        this.price = price;
        this.typeBody = typeBody;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public LocalDate getFoundOfYear() {
        return foundOfYear;
    }

    public void setFoundOfYear(LocalDate foundOfYear) {
        this.foundOfYear = foundOfYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public TypeBody getTypeBody() {
        return typeBody;
    }

    public void setTypeBody(TypeBody typeBody) {
        this.typeBody = typeBody;
    }

    String bodyTypeIdentification(){
        String type=new Scanner(System.in).nextLine();
       switch (type){
           case "SEDAN","HATCHBACK"-> System.out.println("Light class car...");
           case "CROSSOVER","SUV" -> System.out.println("SUV class car...");
           case "STATIONWAGON"    -> System.out.println("Universal car...");
       }return null;
    }

    void determinationYearOfManufacture(){
        System.out.println("Marka: " + marka + " Found of years: " + Period.between(getFoundOfYear(),LocalDate.now()).getYears()
                + " Price:" +price);

    }
}
