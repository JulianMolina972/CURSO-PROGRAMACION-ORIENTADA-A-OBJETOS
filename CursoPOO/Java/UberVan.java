import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    /*La palabra super hará referencia a los atributos y métodos de la super clase y this hará referencia a los atributos de la clase hija*/ 
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    protected Integer passengers;

    public UberVan(Integer id, String license, Driver driver, Integer passengers, Map<String, Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    public UberVan(Integer id, String license, Driver driver){
        super(license, driver);   
    }


    //setPassengers
    @Override
    public void setPassengers(Integer passengers) {
        if(passengers == 6){
            this.passengers = passengers;
        } else {
            System.out.println("Necesitas asignar el número de pasajeros no mayor de 6");
        }
    }
    
    @Override
    void printDataCar() {
        super.printDataCar();
        
    }
    
}
