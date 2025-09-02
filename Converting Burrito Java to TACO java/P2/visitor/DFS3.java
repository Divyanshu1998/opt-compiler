package visitor;

import syntaxtree.*;
import java.util.*;

public class DepthFirstVisitor implements Visitor {

   public void visit(NodeList n) {
      for (Enumeration<Node> e = n.elements(); e.hasMoreElements(); )
         e.nextElement().accept(this);
   }

   public void visit(NodeListOptional n) {
      if (n.present())
         for (Enumeration<Node> e = n.elements(); e.hasMoreElements(); )
            e.nextElement().accept(this);
   }

   public void visit(NodeOptional n) {
      if (n.present())
         n.node.accept(this);
   }

   public void visit(NodeSequence n) {
      for (Enumeration<Node> e = n.elements(); e.hasMoreElements(); )
         e.nextElement().accept(this);
   }

   public void visit(NodeToken n) { }

   public String pCode = "";

   private int tempCount = 0;

   public void visit(Goal n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
   }

   public void visit(MainClass n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
      n.f6.accept(this);
      n.f7.accept(this);
      n.f8.accept(this);
      n.f9.accept(this);
      n.f10.accept(this);
      n.f11.accept(this);
      n.f12.accept(this);
      n.f13.accept(this);
      n.f14.accept(this);
      n.f15.accept(this);
      n.f16.accept(this);
   }

   public void visit(TypeDeclaration n) {
      n.f0.accept(this);
   }

   public void visit(ClassDeclaration n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
   }

   public void visit(ClassExtendsDeclaration n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
      n.f6.accept(this);
      n.f7.accept(this);
   }

   public void visit(VarDeclaration n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
   }

   public void visit(MethodDeclaration n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
      n.f6.accept(this);
      n.f7.accept(this);
      n.f8.accept(this);
      n.f9.accept(this);
      n.f10.accept(this);
      n.f11.accept(this);
      n.f12.accept(this);
   }

   public void visit(FormalParameterList n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   public void visit(FormalParameter n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   public void visit(FormalParameterRest n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   public void visit(Type n) {
      n.f0.accept(this);
   }

   public void visit(ArrayType n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
   }

   public void visit(BooleanType n) {
      n.f0.accept(this);
   }

   public void visit(IntegerType n) {
      n.f0.accept(this);
   }

   public void visit(Block n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
   }

   public void visit(AssignmentStatement n) {
      String lhs = n.f0.f0.toString();
      String rhs = expressionToThreeAddress(n.f2);
      pCode += lhs + " = " + rhs + "\n";
   }

   public void visit(ArrayAssignmentStatement n) {
      String array = n.f0.f0.toString();
      String index = expressionToThreeAddress(n.f2);
      String rhs = expressionToThreeAddress(n.f5);
      pCode += array + "[" + index + "] = " + rhs + "\n";
   }

   public void visit(FieldAssignmentStatement n) {
      String obj = expressionToThreeAddress(n.f0);
      String field = n.f2.toString();
      String rhs = expressionToThreeAddress(n.f4);
      pCode += obj + "." + field + " = " + rhs + "\n";
   }

   public void visit(IfStatement n) {
      String condition = expressionToThreeAddress(n.f2);
      pCode += "ifFalse " + condition + " goto L1\n";
      n.f4.accept(this);
      pCode += "L1:\n";
      n.f6.accept(this);
   }

   public void visit(WhileStatement n) {
      String condition = expressionToThreeAddress(n.f2);
      pCode += "L1:\n";
      pCode += "ifFalse " + condition + " goto L2\n";
      n.f4.accept(this);
      pCode += "goto L1\n";
      pCode += "L2:\n";
   }

   public void visit(ForStatement n) {
      String initialization = n.f2.f0.toString() + " = " + expressionToThreeAddress(n.f4);
      String condition = expressionToThreeAddress(n.f6);
      String increment = n.f8.f0.toString() + " = " + expressionToThreeAddress(n.f10);
      pCode += initialization + "\n";
      pCode += "L1:\n";
      pCode += "ifFalse " + condition + " goto L2\n";
      n.f12.accept(this);
      pCode += increment + "\n";
      pCode += "goto L1\n";
      pCode += "L2:\n";
   }

   public void visit(PrintStatement n) {
      String expression = expressionToThreeAddress(n.f2);
      pCode += "print " + expression + "\n";
   }

   public void visit(Expression n) {
      n.f0.accept(this);
   }

   public String expressionToThreeAddress(Node expression) {
      tempCount++;
      String tempVar = "t" + tempCount;
      String exprStr = "";
      if (expression instanceof PrimaryExpression) {
         exprStr = ((PrimaryExpression) expression).f0.toString();
      } else if (expression instanceof PlusExpression ||
                 expression instanceof MinusExpression ||
                 expression instanceof TimesExpression) {
         exprStr = handleBinaryExpression((NodeSequence) expression);
      }
      pCode += tempVar + " = " + exprStr + "\n";
      return tempVar;
   }

   public String handleBinaryExpression(NodeSequence seq) {
      String op = ((NodeToken) seq.elementAt(1)).tokenImage;
      String left = expressionToThreeAddress((Node) seq.elementAt(0));
      String right = expressionToThree
