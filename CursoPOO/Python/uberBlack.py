from car import Car

class UberBlack(Car):
    typeCarAccepted = []
    seatsMasterial = []
    
    def __init__(self, license, driver, typeCarAccepted, seatsMasterial):
        super().__init__(license, driver)
        self.typeCarAccepted = typeCarAccepted 
        self.seatsMasterial = seatsMasterial