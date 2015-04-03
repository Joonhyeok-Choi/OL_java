package ch5;

public class Computer {
	private int a;
	private int memory;
	public String[] osType = {"윈도7", "애플 OS X", "안드로이드"};
	public Computer(int a, int memory){
		this.a=a;
		this.memory=memory;
	}
	public void print(){
		switch(a){
		case 0:
			System.out.println("운영체제: "+osType[a]+", "+"메인메모리: "+memory);
			break;
		case 1:
			System.out.println("운영체제: "+osType[a]+", "+"메인메모리: "+memory);
			break;
		case 2:
			System.out.println("운영체제: "+osType[a]+", "+"메인메모리: "+memory);
			break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer pc = new Computer(0, 16);
		Computer apple = new Computer(1, 32);
		Computer galaxy = new Computer(2, 16);
		pc.print();
		apple.print();
		galaxy.print();
	}

}
