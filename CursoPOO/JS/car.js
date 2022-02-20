

export default class Car {
    constructor(license,driver){
        this.id;
        this.license= license;
        this.driver = driver;
        this.__passengers
    }


    get passengers(){
        return this._passengers
    }

    set passengers(passengers){
        if(passengers != 4) {
            console.log("Debes tener 4 pasajeros")
        } else {
            this._passengers = passengers;
        }
    }


    //Metodo para imprimir 

    printDataCar = () => {
        console.group(this.id)
        console.log('License: ', this.driver)
        console.log(this.driver)
        //console.log(this.driver.document)
        console.log('Passengers: ' + this.passengers )
        console.groupEnd()
    }
}