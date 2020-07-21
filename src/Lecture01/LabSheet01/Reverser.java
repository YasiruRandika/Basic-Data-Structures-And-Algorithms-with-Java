package Lecture01.LabSheet01;

public class Reverser {
    private String input;
    private String output = "";

    public Reverser(String input) {
        this.input = input;
    }

    public String reverse() {
        Stack stack = new Stack(input.length());
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
            System.out.println(i + " " + input.charAt(i));
        }
        for (int i = 0; i < input.length(); i++) {
            output = output + stack.peek();
            stack.pop();
        }
        return output;
    }
}
