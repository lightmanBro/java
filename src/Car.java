public class Car extends Vehicle{
    static int carCount;//This is the sole owner of this variable and cannot be shared amongst its instances;
    //The static modifier creates a single copy of a variable/method and that copy is shared among its instances.
    public String name = "Ford";
     String model = "Mustang";
    String year = "2003";
    String color = "yellow";
    double price = 125700.53;
    Car(){};

    //Overloaded constructor-- a constructor with different parameter counts but thesame constructor name;
    Car(String type,String wheel,String name,String model,String year,String color,double price){
        super(type,name,wheel);//The parameters it received from the super class
        this.name = name;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        carCount++;//on each new car created the number of car should be increased by 1;
    }
     void carDetails(){
        System.out.println("\n"+this.color+" "+this.name+" "+this.model+"\n"+"Year: "+ year+"\n"+"Price: "+price);
    }
    static void displayCars(){
        System.out.println("Yo have "+carCount+" car/cars in your garage");
    };
}
