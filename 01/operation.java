class Operation{
	public static void main(String args[]){
		int a =Integer.parseInt(args[0]);
		int b =Integer.parseInt(args[1]);
		int s = a+b;
		int d = a -b;
		int p = a*b;
		int div= a/b;
		int rem=a%b;
		System.out.println("Sum = " + s);
		System.out.println("Difference = " + d);
		System.out.println("Product = " + p);
		System.out.println("Quotient = " + div);
		System.out.println("Reminder = " + rem);
	}
}