class Driver extends Account {

    public Driver(Integer id,String name, String document, String email, String password) {
        super(id ,name ,document, email, password);
    }
    void printDataUser(){
        System.out.println("Id: "+ id +"Name: "+ name +"Document driver: "+ document +"Email: "+ email +"Password: "+ password);
    }
    
}
