package ifl1;
public class StackUebung {

	public static void main(String[] args) {
		
		StackUebung test = new StackUebung();
		
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);

		s2.push(5);
		s2.push(6);
		s2.push(7);
		s2.push(8);


		test.verbinde(s1,s2);
		System.out.println("s1 und s2 verbunden");
		int number = 3;
		int index = test.istVorhanden(s1,number);
		if (index == -1){
			System.out.println(number+" ist nicht vorhanden!");
		}
		else{
			System.out.println(number+" ist vorhanden an Stelle "+(index+1));
		}
		test.ausgeben(s1);
	}
	
		
	
	public Stack<Integer> verbinde(Stack<Integer> s1, Stack<Integer> s2){
		Stack<Integer> temp  = new Stack<>();
		while (!s2.isEmpty()){
			temp.push(s2.top());
			s2.pop();
		}
		while (!temp.isEmpty()){
			s1.push(temp.top());
			temp.pop();
		}
		return null;
	}
	
	public void ausgeben(Stack<Integer> s) {
		Stack<Integer> temp = new Stack<>();
		while (!s.isEmpty()) {
			System.out.println(s.top());
			temp.push(s.top());
			s.pop();
		}
		while (!temp.isEmpty()){
			s.push(temp.top());
			temp.pop();
		}
		
	}
	
	public boolean istGleich(Stack<Integer> s1, Stack<Integer> s2) {
		return false;
	}
	
	public int istVorhanden(Stack<Integer> s1, Integer zahl) {

		int i = 0;
		int index = -1;
		Stack<Integer> temp = new Stack<>();

		while (!s1.isEmpty()){
			if (s1.top() == zahl){
				index = i;
				break;
			}
			temp.push(s1.top());
			s1.pop();
			i++;
		}

		while (!temp.isEmpty()){
			s1.push(temp.top());
			temp.pop();
		}

		return index;
	}

	
}
