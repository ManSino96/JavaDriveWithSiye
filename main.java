import java.io.PrintStream; 

public class main{


    public static void main(String[] args) {
        Patient patient1 = new Patient("Sino", "Mazi", "ZZ6690", 23, 'M');
        Patient patient2  = new Patient("Mino", " Nazi", "ZZ5589", 24, 'F');

          patient1.displayDetails();
          patient2.displayDetails();
    }
}