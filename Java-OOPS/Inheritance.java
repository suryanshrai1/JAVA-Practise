
class Car{
    public static void Tyres(){
        System.out.println("I have four tyres");
    }
}


class Santro extends Car{
    public static void Windows(){
        System.out.println("i have powerWindows");
    }
}

class Audi extends Santro{
    public static void Airbags(){
        System.out.println("I have airBags");
    }
}

class Main{
    public static void main(String args[]){
        Car.Tyres();
        Santro.Windows();
        Audi.Airbags();
    }
}