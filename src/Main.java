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
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
//        System.out.println("What is your name");
//        String name = scanner.nextLine();
//        System.out.println(name);
//        System.out.println(name+" How old are you?");
//        int age = scanner.nextInt();
//        System.out.println(name+" you are "+age+" years old");
        String name = JOptionPane.showInputDialog("Enter your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"Hello "+ name+" you are "+age+" years old");

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

        //Array list
        ArrayList<Integer> phoneNumbers = new ArrayList<Integer>();
        phoneNumbers.add(123);
        phoneNumbers.add(190);
        phoneNumbers.set(0,124);
//        phoneNumbers.remove();
//        phoneNumbers.clear();
    }
}