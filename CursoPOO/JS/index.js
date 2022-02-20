import Account from './account.js';
import UberX from './uberX.js';
import UberVan from './uberVan.js';



// var car = new Car("1231","ASE129", new Account("21132","Rodolfo Riaño", "RODOLF12","sdaas","sadd"), "4")

//car.printDataCar();

var uberX = new UberX("121", "AWS232", new Account("21132","Rodolfo Riaño", "RODOLF12","sdaas","sadd"), "Ford", "Raptor")
uberX.printDataCar();

//var user = new User(12,"Juan ", "231312sd ", "juan@jajaj.com ", "fde efecita")

//user.printDataUser();

let uberVan = new UberVan("DGC548", new Account("Francisco Peralta", "FR56ALF","21321","sadasd", "asdasda"));
uberVan.id = "Ubervan 45432124";
uberVan.passengers = 6;
uberVan.printDataCar();