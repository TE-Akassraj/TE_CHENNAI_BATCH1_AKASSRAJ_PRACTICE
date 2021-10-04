package com.excercise.oneand3;

public class AreaOfRectangle {
	// SA=2lw+2lh+2hw
	int area(int l , int b) {
		this.perimeter(l, b);
		return l * b;
	}
	void perimeter(int l,int b) {
		System.out.println(2*(l+b));
	}

}
