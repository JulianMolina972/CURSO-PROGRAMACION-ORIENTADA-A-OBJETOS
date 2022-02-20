class UberPool extends Car {
    String brand;
    String model;

    public UberPool(Integer id, String license, Driver driver, Integer passegenger, String brand, String model){
        super(license, driver );
        this.brand = brand;
        this.model = model;

        
    }
}
