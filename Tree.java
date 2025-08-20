package LATIHAN;

import java.util.Stack;

public class Tree {
    private TreeNode root;

    public Tree() {
        root = null;
    }

    public void addExpressionInfix(String x) {
        Stack<TreeNode> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);

            if (c == '(') {
                operator.push(c);
            } else if (Character.isLetterOrDigit(c)) {
                operand.push(new TreeNode(c));
            } else if (c == ')') {
                while (operator.peek() != '(') {
                    TreeNode right = operand.pop();
                    TreeNode left = operand.pop();
                    TreeNode node = new TreeNode(operator.pop());
                    node.leftNode = left;
                    node.rightNode = right;
                    operand.push(node);
                }
                operator.pop();  
            } else {  
                operator.push(c);
            }
        }

        while (!operator.isEmpty()) {
            TreeNode right = operand.pop();
            TreeNode left = operand.pop();
            TreeNode node = new TreeNode(operator.pop());
            node.leftNode = left;
            node.rightNode = right;
            operand.push(node);
        }

        root = operand.pop();
    }

    public void prefixTraversal() {
        prefixHelper(root);
        System.out.println();
    }

    public void infixTraversal() {
        infixHelper(root);
        System.out.println();
    }

    public void postfixTraversal() {
        postfixHelper(root);
        System.out.println();
    }

    private void prefixHelper(TreeNode node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            prefixHelper(node.getLeftNode());
            prefixHelper(node.getRightNode());
        }
    }

    private void infixHelper(TreeNode node) {
        if (node != null) {
            if (!node.isLeaf()) {
                System.out.print("(");
            }
            infixHelper(node.getLeftNode());
            System.out.print(node.getData() + " ");
            infixHelper(node.getRightNode());
            if (!node.isLeaf()) {
                System.out.print(")");
            }
        }
    }

    private void postfixHelper(TreeNode node) {
        if (node != null) {
            postfixHelper(node.getLeftNode());
            postfixHelper(node.getRightNode());
            System.out.print(node.getData() + " ");
        }
    }
}
