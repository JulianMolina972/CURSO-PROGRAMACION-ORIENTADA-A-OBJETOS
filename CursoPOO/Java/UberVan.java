import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    /*La palabra super hará referencia a los atributos y métodos de la super clase y this hará referencia a los atributos de la clase hija*/ 
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(String license, Account driver, Map<String, Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
        
    
}
