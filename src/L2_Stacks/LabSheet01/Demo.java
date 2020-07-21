package L2_Stacks.LabSheet01;

public class Demo {
    public static void main(String[] args) {
        int maxSize = 5;
        Stack stack = new Stack(maxSize);

        stack.push('A');
        stack.push('B');
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());

        System.out.println(isCorrectlyParanthesized("3 + (( 6 * 2) – 3)"));
        System.out.println(isCorrectlyParanthesized("3 + (( 6 * 2) – 3"));

        //Reverse
        Reverser reverser = new Reverser("Hello");
        System.out.println(reverser.reverse());

    }

    public static boolean isCorrectlyParanthesized(String expression)
    {
        Character peek;
        Stack newStack = new Stack(expression.length());
        boolean correct = true;

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                // Push the element in the stack
                newStack.push(expression.charAt(i));
                continue;
            } else if (expression.charAt(i) == ')') {
                if (!newStack.isEmpty()) {
                    newStack.pop();
                } else {
                    correct = false;
                    break;
                }
            }
        }

        if (correct) {
            return (newStack.isEmpty());
        } else {
            return false;
        }
    }
}
