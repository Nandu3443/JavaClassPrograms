class Parent{
	int x,y;
	Parent(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	Parent(){
		this.x = 1;
		this.y = 1;
	}
}

class Child extends Parent{
	int p,q;
	Child(int p, int q){
		this.p = p;
		this.q = q;
	}
	Child(){
		this.p = -1;
		this.q = -1;
	}
	Child(int x,int y,int p ,int q){
		super(x,y);
		this.p = p;
		this.q = q;
	}
}

public class OneLevelConstructorChaining {

	public static void main(String[] args) {
		Child obj = new Child(100,200,300,400);
		System.out.println(obj.p);
		System.out.println(obj.q);
		System.out.println(obj.x);
		System.out.println(obj.y);
	}

}
