import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Subclase1 subclase1 = new Subclase1(20, 7.95, true);
        
        subclase1.setPrecio(8.95);
        
        System.out.println(subclase1.total());
        System.out.println(subclase1.informar("tu prima la gorda"));
    }
}
