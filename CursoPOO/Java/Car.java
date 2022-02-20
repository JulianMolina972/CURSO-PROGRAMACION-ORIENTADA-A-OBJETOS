class Car {
    //Atributos
    private Integer id;
    private String license;
    private Driver driver;
    protected Integer passengers;
    //Metodo constructor
    public Car(String license, Driver drive){
        this.license = license;
        this.driver = drive;
        

    }
    //Metodo
    void printDataCar() {
        if(passengers != null){
            System.out.println("License: " + license + "\n" + "Name Driver: " + driver.name + "\n" + "Passengers: " + passengers);
        }
        
    }


    public Integer getPassegengers(){
        return passengers;
    }

    public void setPassengers(Integer passengers) {
        if(passengers == 4){
            this.passengers = passengers;
        } else {
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getLicense() {
        return license;
    }
    public void setLicense(String license) {
        this.license = license;
    }
    public Driver getDriver() {
        return driver;
    }
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    
    
    
}
