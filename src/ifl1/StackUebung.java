package ifl1;

public class StackUebung {

    public static void main(String[] args) {

        StackUebung test = new StackUebung();

        test.ausgeben(test.getS1());
        Stack<Integer> neuerStack = test.verbinde(test.getS1(), test.getS2());
        test.ausgeben(neuerStack);
        System.out.println(test.istVorhanden(neuerStack, 4));
        System.out.println(test.istVorhanden(neuerStack, 10));
        System.out.println(test.istGleich(test.getS1(), test.getS2()));

    }

    private Stack<Integer> s1, s2;

    public StackUebung() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();

        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);

        s2.push(5);
        s2.push(6);
        s2.push(7);
        s2.push(8);
    }

    public Stack<Integer> verbinde(Stack<Integer> s1, Stack<Integer> s2){
        return null;
    }

    public void ausgeben(Stack<Integer> s) {

    }

    public boolean istGleich(Stack<Integer> s1, Stack<Integer> s2) {
        return false;
    }

    public boolean istVorhanden(Stack<Integer> s1, Integer zahl) {
        return false;
    }

    public Stack<Integer> getS1() {
        return s1;
    }

    public Stack<Integer> getS2() {
        return s2;
    }

}
