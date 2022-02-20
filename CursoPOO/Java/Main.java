class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando.....");
        UberX uberX = new UberX( "AWS231", new Driver(12,"Juan ", "231312sd ", "juan@jajaj.com ", "fde efecita"), "Chevrolet", "Sonic" );
        uberX.setPassengers(4);
        //uberX.printDataUberX();
        uberX.printDataCar();

        UberVan uberVan =  new UberVan(12, "AWS123", new Driver(12, "Juan","Ruiz", "sada", "sadsad"));
        uberVan.setPassengers(6);
        uberVan.printDataCar();

        //Car car2 = new Car("TCP802", new Account("Manuel Sosa", "MANU12"));
        //car2.passegenger = 3;
        //car2.printDataCar();

        // System.out.println("User");
        // User user = new User(12,"Juan ", "231312sd ", "juan@jajaj.com ", "fde efecita");
        // user.printDataUser();
        // System.out.println("Driver");
        // User Driver = new User(12,"Juan ", "231312sd ", "juan@jajaj.com ", "fde efecita");
        // Driver.printDataUser();
        

    }
}