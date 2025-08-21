package com.demojavaproj; 
class PassByValue{
	void ChangeValue(int a, int b){
		a *= 2;
		b /= 2;
	}
}
class PassByRef{
	int i,j;
	PassByRef(int i, int j){
		this.i = i;
		this.j = j;
	}
	void ChangeValue(PassByRef Obj){
		Obj.i *= 2;
		Obj.j /= 2;
	}
}
public class Value{
	public static void main(String[] args){
		PassByValue Obj = new PassByValue();
		int a = 20;
		int b = 30;
		System.out.println("Value of a & b before PassByValue:- "+a+" ,"+b);
		Obj.ChangeValue(a,b);
		System.out.println("Value of a & b After PassByValue:- "+a+" ,"+b);
		PassByRef Obj1 = new PassByRef(10,20);
		System.out.println("Value of a & b before PassByRef:- "+Obj1.i+" ,"+Obj1.j);
		Obj1.ChangeValue(Obj1);
		System.out.println("Value of a & b before PassByRef:- "+Obj1.i+" ,"+Obj1.j);

	
	}
} 