from driver import Driver

class Car:
    id = int    
    license = str
    driver = Driver
    passegenger = int
    
    def __init__(self, license, driver):
        self.license = license
        self.driver = driver
        self.__passengers = None
    """La función integrada property() nos permitirá interceptar la escritura, lectura, borrado de los atributos y ademas nos permiten incorporar una documentación sobre los mismos. La sintaxis para invocarla es la siguiente:

    @property
    Si, es un decorador.

    Si nosotros no pasamos alguno de los parámetros su valor por defecto sera None.

    Getter: Se encargará de interceptar la lectura del atributo. (get = obtener)

    Setter : Se encarga de interceptar cuando se escriba. (set = definir o escribir)

    Deleter : Se encarga de interceptar cuando es borrado. (delete = borrar)

    doc :  Recibirá una cadena para documentar el atributo. (doc = documentación)"""
    #Metodo Getter en python
    @property
    
    def setPassengers(self):
        return self.__passengers
    
    #Metodo setter en python
    
    @setPassengers.setter
    def passengers(self, passengers):
        if passengers == 4:
            self.__passengers = passengers
        else:
            raise ValueError(f'La cantidad de pasajeros: {passengers} no es admitida')
    
    # def setPassengers(self, passengersNum):
    #     if passengersNum >= 4:
    #         self.__passengers = int(passengersNum)
    #         print("Passengers asignados: " + str(self.__passenger))
    #     else:
    #         print("El número de pasajeros es demasiado bajo para esta categoría")
        
    #     def getPassanger(self):
    #         if self.__passengers != int:
    #             print(self.__passengers)
            