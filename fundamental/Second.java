package fundamental;
public class Second {
    public static void main(String[] args) {
        Main myObj = new Main(5);
        myObj.x = 40;
        System.out.println(myObj.x);

        Main myCar = new Main(5);     // Create a myCar object
        myCar.fullThrottle();      // Call the fullThrottle() method
        myCar.speed(200);          // Call the speed() method
      }
}
