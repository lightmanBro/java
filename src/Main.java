// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.random.RandomGenerator;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        Scanner scanner = new Scanner(System.in);


        Car ford = new Car();
        ford.carDetails();
        Car newCar = new Car("car","4","Toyota","Hilux","2021","Milk",45072.00);
        Car Benz = new Car("Car","4","Benz","Gwagon","2021","blak",145072.00);
        newCar.carDetails();


        //Arrays of Objects;
        Food food1 = new Food("Rice");
        Food food2 = new Food("Beans");
        Food food3 = new Food("Macaroni");

        Food[] refrigrator = {food1,food2,food3};
        System.out.println(food1.name);
        System.out.println(refrigrator[0].name);
        System.out.println(refrigrator[1].name);
        System.out.println(refrigrator[2].name);

        //Passing Object into a class;
        Garage myGarage = new Garage();
        myGarage.park(ford);
        System.out.println(Car.carCount);
        Car.displayCars();
//        System.out.println("What is your name");
//        String name = scanner.nextLine();
//        System.out.println(name);
//        System.out.println(name+" How old are you?");
//        int age = scanner.nextInt();
//        System.out.println(name+" you are "+age+" years old");

        //GUI
//        String name = JOptionPane.showInputDialog("Enter your name");
//        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//        JOptionPane.showMessageDialog(null,"Hello "+ name+" you are "+age+" years old");


        //Calling the other method attached to this class;
        attachedMethod();

//        Logical operators in java
//        if(name.equals("David")){
//
//        } else if (!name.equals("David")) {
//
//        }

//        ARRAYS
        String[] people = {"David","Bayo","Adeleke"};
        String[] children = new String[5];//initializing the amount of children then
        children[0] = "Konkolo";
        children[1]= "Kanmi";// till 5;
        //2D arrays
        String[][] places = {{"Akure","Ibadan".toLowerCase(),"ile-Oluji".toUpperCase()},{"Kaduna","Jos","Nasarawa"},{"Ph","imo","Enugu"}};
        String[][] city = new String[2][2];//{0},{1};
        city[0][0] = "Ondo";
        city[0][1] = "Ore";
        city[1][0] = "Okitipupa";//etc

        int[] quantity = {1,2,4,12,5};
        System.out.println(people[0]);


        ArrayList<Integer> phoneNumbers = new ArrayList<Integer>();
        phoneNumbers.add(123);
        phoneNumbers.add(190);
        phoneNumbers.set(0,124);
//        phoneNumbers.remove();
//        phoneNumbers.clear();

        //2D ArrayLists
        ArrayList<ArrayList<String>> schoolStudents = new ArrayList<>();
        //Array list
        ArrayList<String> students = new ArrayList<>();
        students.add("Joy Adeboye");
        students.add("Seun Oyaleke");
        ArrayList<String> studentClass = new ArrayList<>();
        studentClass.add("Primary One");
        studentClass.add("Primary Five");

        schoolStudents.add(students);
        schoolStudents.add(studentClass);
        System.out.println(schoolStudents.get(1).get(0));


        //For each loop
        for (String child: students) {
            System.out.println(child);
        }
        //The final keyword makes it impossible to change a variable value;
        final int finalNumber = 10;
    }


    //METHODS ATTACHED TO A CLASS
    static void attachedMethod(){
        System.out.println("\nHello from the method attached to this main method");
        System.out.println(add(3,8));
    }
    static int add(int x,int y){
        return x+y;
    }


    //Overloaded methods = methods that share the same name but have different parameters;
    static  int multiply(int a,int b){
        System.out.println("Overloaded method 1");
        return a*b;
    }
    static int multiply(int a,int b,int c){
        System.out.println("Overloaded method 2");
        return a*b*c;
    }
    static double multiply(double a,double b,double c){
        System.out.println("Overloaded method 3");
        return a*b*c;
    }
}