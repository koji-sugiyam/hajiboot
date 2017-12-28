package com.example.app;

//lombokは使わない
import lombok.Data;
//import lombok.RequiredArgsConstructor;

@Data
//@RequiredArgsConstructor
public class Argument {
	
    private final int a;
    private final int b;
    
    /*
    //コンストラクタ
    Argument(int a, int b){
    	this.a = a;
    	this.b = b;
    }
    
    //getter //setter
    public int getA() {
		return a;
	}
    public void setA(int a) {
    	this.a = a;
	}

    //getter //setter
	public int getB() {
		return b;
	}
    public void setB(int b) {
    	this.b = b;
	}
	*/
	
	
}
