import Car from './car.js'

export default class UberVan extends Car {
    // constructor(license, driver, typeCarAccepted, seatsMaterial) {
    //     super(license, driver)
    //     this.typeCarAccepted = typeCarAccepted;
    //     this.seatsMaterial = seatsMaterial;
    // }

    constructor(license, driver) {
        super(license, driver)
    }

    get passengers() {
        return this._passengers
    }

    set passengers(passengers) {
        if(passengers != 6) {
            console.log("Debes tener 6 pasajeros")
        } else {
            this._passengers = passengers
        }
    }
}