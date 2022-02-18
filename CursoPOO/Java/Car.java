class Car {
    //Atributos
    Integer id;
    String license;
    Account driver;
    Integer passegenger;
    //Metodo constructor
    public Car(String license, Account drive){
        this.license = license;
        this.driver = drive;

    }
    //Metodo
    void printDataCar() {
        System.out.println("License: " + license + "\n" + "Name Driver: " + driver.name);
    }
}
