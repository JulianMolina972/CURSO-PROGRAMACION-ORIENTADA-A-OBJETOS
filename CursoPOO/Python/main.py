from car import Car 




def run():
    car = Car()
    car.license = "AWS293"
    car.driver = "Andres Murcia"
    print(vars(car))

    car2 = Car()
    car2.license = "TPC293"
    car2.driver = "Benito Camelas"
    print(vars(car2))


if __name__ == "__main__":
    run()
    