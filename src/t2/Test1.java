package t2;

// 타입을 주겠다 <T>
class MyClass<T> {
	private T t;	// T가 타입

	// private이니까 getter setter 생성
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}
public class Test1 {
	public static void main(String[] args) {
		// <> 안에는 객체 타입만 들어가야함, 기본타입은 불가 / int X , Integer O
//		MyClass<String> mc1 = new MyClass<String>();	뒤 String은 아래와 같이 생략 가능
		MyClass<String> mc1 = new MyClass<>();
		mc1.setT("안녕하세요");
		System.out.println("mc1 : " + mc1.getT());
		System.out.println();
				
		MyClass<Integer> mc2 = new MyClass<>();
		mc2.setT(100);
		System.out.println("mc2 : " + mc2.getT());
		System.out.println();
	}
}
