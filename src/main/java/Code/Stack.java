/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author Saleem Malik
 */
class Stack
{
	private char stackArray[];
	private int top;
	private int maxSize;

public Stack(int maxSize)
{
	stackArray = new char[maxSize];
	this.maxSize = maxSize;
	top = -1;
}
public boolean isFull()
{
	return(top == maxSize-1); // return(top+1 == maxSize);
}

public void push(char ch)
{
	if(isFull())
	{
		System.out.println("Stack is Full");
	}
	else{
	
		stackArray[++top] = ch;	
		
	}
}

public boolean isEmpty()
{
	return (top == -1);
}
public char pop()
{
	if(isEmpty())
	{	
		return '*';
	}
		return stackArray[top--];
	
}
public char peek()
{
	if(isEmpty())
	{	
		return '*';
	}
		return stackArray[top];
	
}
}
