import syntaxtree.*;
import visitor.*;
import java.util.HashMap;
import java.util.Map;

public class P2 {
   public static void main(String [] args) {
      try {
         Node root = new BuritoJavaParser(System.in).Goal();
         FirstPassForMethods pass1 = new FirstPassForMethods<>();
         SecondPassForTemporaries pass2 = new SecondPassForTemporaries<>();
         root.accept(pass1);
         pass2.mapForMethods = pass1.mapForMethods;
         pass2.mapForContext=pass1.mapForContext;
         root.accept(pass2); 
         pass2.writeToFile();
         // Your assignment part is invoked here.
;
           
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
} 


