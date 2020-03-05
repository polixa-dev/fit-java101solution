package com.tasks3.fibonacci;

public class Fibonacci
{
    static int fib(int n) {
		if (n <= 1) return n;
		return fib(n-1) + fib(n-2);
	}
	
	public long getNumber(int position){
        if (position < 1) return -1;
        return fib(position);
	}
}
