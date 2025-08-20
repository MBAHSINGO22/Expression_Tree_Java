package LATIHAN;

public class MainTree {
    public static void main(String[] args) {
        Tree expressionTree = new Tree();

        String infixExpression = "(a+b)*(c-d)";
        expressionTree.addExpressionInfix(infixExpression);

        System.out.println("Prefix Traversal:");
        expressionTree.prefixTraversal();

        System.out.println("Infix Traversal:");
        expressionTree.infixTraversal();

        System.out.println("Postfix Traversal:");
        expressionTree.postfixTraversal();
    }
}

