class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando.....");
        //Car car = new Car("AWS231", new Account("Rodolfo Riaño", "Rodolf12") );
        //car.passegenger = 4;
        //car.printDataCar();

        //Car car2 = new Car("TCP802", new Account("Manuel Sosa", "MANU12"));
        //car2.passegenger = 3;
        //car2.printDataCar();
        System.out.println("User");
        User user = new User(12,"Juan ", "231312sd ", "juan@jajaj.com ", "fde efecita");
        user.printDataUser();
        System.out.println("Driver");
        User Driver = new User(12,"Juan ", "231312sd ", "juan@jajaj.com ", "fde efecita");
        Driver.printDataUser();
        

    }
}