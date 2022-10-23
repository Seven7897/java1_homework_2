public class homework2_3 {
	public static void main(String[] args) {
		int n = 9;
		System.out.println(countSteps(n));
	}
	public static int countSteps(int n) {
		if(n == 1|| n == 2){
			return n;
		}
	return countSteps(n - 1) + countSteps(n - 2);
	}
}
