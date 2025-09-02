package visitor;
import syntaxtree.*;

public class ThreeAddressCodeVisitor extends GJNoArguDepthFirst<String> {
    private int tempCount = 0;

    // Method to generate a new temporary variable name
    private String newTemp() {
        return "t" + (++tempCount);
    }

    // Visit method for PlusExpression
    public String visit(PlusExpression n) {
        String result = "";

        String leftOperand = n.f0.accept(this);
        String rightOperand = n.f2.accept(this);

        String temp = newTemp();
        result += temp + " = " + leftOperand + " + " + rightOperand + ";\n";

        return temp;
    }

    // Visit method for MinusExpression
    public String visit(MinusExpression n) {
        String result = "";

        String leftOperand = n.f0.accept(this);
        String rightOperand = n.f2.accept(this);

        String temp = newTemp();
        result += temp + " = " + leftOperand + " - " + rightOperand + ";\n";

        return temp;
    }

    // Visit method for TimesExpression
    public String visit(TimesExpression n) {
        String result = "";

        String leftOperand = n.f0.accept(this);
        String rightOperand = n.f2.accept(this);

        String temp = newTemp();
        result += temp + " = " + leftOperand + " * " + rightOperand + ";\n";

        return temp;
    }

    // Visit method for IntegerLiteral
    public String visit(IntegerLiteral n) {
        return n.f0.toString();
    }

    // Other visit methods for different types of expressions can be similarly updated

    // Main method to test the visitor
}
