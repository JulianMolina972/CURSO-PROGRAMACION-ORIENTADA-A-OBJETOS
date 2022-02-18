class Car {
    constructor(id,license,driver,passengers){
        this.id = id;
        this.license= license;
        this.driver = driver;
        this.passengers = passengers;
    }

    //Metodo para imprimir 

   printDataCar = function () {
        console.log(this.driver)
        console.log(this.driver.name)
        console.log(this.driver.document)
    }
}