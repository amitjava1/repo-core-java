package com.java8.lambda;

public class LambdaPractice implements Test {
	static Test t = (a, b) -> a + b;

	public static void main(String[] args) {
		
		Test lp = new LambdaPractice();
		
		System.out.println(t.returnSum(1, 2));
		System.out.println(lp.returnSum(3, 2));
	}

	@Override
	public int returnSum(int a, int b) {
		return t.returnSum(a, b);
	}

}
