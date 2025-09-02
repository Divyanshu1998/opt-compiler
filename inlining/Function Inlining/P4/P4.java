
import syntaxtree.*;
import visitor.*;

public class P4 {
   public static void main(String [] args) {
      try {
         Node root = new FunkyTacoJavaParser(System.in).Goal();
         FirstPassForCHA firstPass = new FirstPassForCHA<>();
         SecondPassForFunctionsToClass secondPass = new SecondPassForFunctionsToClass();
         FourthPassForCallGraph fourthPass = new FourthPassForCallGraph<>();
         ThirdPassForVarTypes thirdPass = new ThirdPassForVarTypes<>();
         FifthPassForInlineableFunction fifthPass = new FifthPassForInlineableFunction();
         FinalPassForPrinting finalPass = new FinalPassForPrinting<>();
         SixthPassForFunctionBody sixthPass = new SixthPassForFunctionBody<>();
         root.accept(firstPass);
         secondPass.CHAgraph = firstPass.CHAgraph;
         root.accept(secondPass);// Your assignment part is invoked here.
         root.accept(thirdPass);
         fourthPass.CHAgraph = firstPass.CHAgraph;
         fourthPass.classToFuncMap = secondPass.classToFuncMap;
         fourthPass.mapOfVarTypes = thirdPass.mapOfVarTypes;
         root.accept(fourthPass);
         fifthPass.mapOfVarTypes = thirdPass.mapOfVarTypes;
         fifthPass.mapOfCallGraph = fourthPass.mapOfCallGraph;
         root.accept(fifthPass);
         root.accept(sixthPass);
         finalPass.inlineMap = fifthPass.inlineMap;
         finalPass.mapOfCallGraph = fourthPass.mapOfCallGraph;
         finalPass.functionBodyMap = sixthPass.functionBodyMap;
         root.accept(finalPass);
         finalPass.writeToFile();
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
} 


