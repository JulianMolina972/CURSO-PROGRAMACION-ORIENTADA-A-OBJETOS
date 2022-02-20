import java.util.ArrayList;
import java.util.Map;

class UberBlack extends Car {
    /*La palabra super hará referencia a los atributos y métodos de la super clase y this hará referencia a los atributos de la clase hija*/ 
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberBlack(Integer id, String license, Driver driver, Integer passegenger, Map<String, Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
        super( license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
        
    
}
