import syntaxtree.*;
import visitor.*;

public class P3 {
   public static void main(String [] args) {
      try {
         Node root = new TACoJavaParser(System.in).Goal();
         GJNoArguDepthFirst v = new GJNoArguDepthFirst<>();
         root.accept(v); // Your assignment part is invoked here.
         v.writeToFile();
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
} 