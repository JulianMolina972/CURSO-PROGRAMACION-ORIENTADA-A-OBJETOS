from car import Car 
from account import Account 
from uberX import UberX
from user import User


def run():
    
    car = Car("AWS293", Account("Andres Murcia", "AND21","sda", "asdsa", "sada"))
    print(vars(car))
    print(vars(car.driver))
    
    uberX = UberX("AWS293", Account("Andres Murcia", "AND21","sda", "asdsa", "sada"), "Ford", "Raptor")
    uberX.passengers = 4
    print(vars(uberX))
    print(vars(uberX.driver))
    
    
    user = User(12,"Juan ", "231312sd ", "juan@jajaj.com ", "fde efecita")
    print(vars(user))
    # car = Car()
    # car.license = "AWS293"
    # car.driver = "Andres Murcia"
    # print(vars(car))

    # car2 = Car()
    # car2.license = "TPC293"
    # car2.driver = "Benito Camelas"
    # print(vars(car2))


if __name__ == "__main__":
    run()
    