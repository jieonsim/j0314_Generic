package t2;

// 타입을 주겠다 <T>, V : value
class MyClass2<T,V> {
	private T t;
	private V v;

	// private이니까 getter setter 생성
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}
}

public class Test2 {
	public static void main(String[] args) {
		// <> 안에는 객체 타입만 들어가야함, 기본타입은 불가 / int X , Integer O
//		MyClass2<String, Integer> mc1 = new MyClass2<String, Integer>();	
		MyClass2<String, Integer> mc1 = new MyClass2<>();	
		mc1.setT("안녕하세요");
		mc1.setV(100);
		System.out.println("key : " + mc1.getT());
		System.out.println("value : " + mc1.getV());
		System.out.println();
				
		MyClass2<Integer, String> mc2 = new MyClass2<>();
		mc2.setT(404);
		mc2.setV("Page Not Found(요청한 페이지를 찾을 수 없습니다.)");
		System.out.println("key : " + mc2.getT());
		System.out.println("value : " + mc2.getV());
		System.out.println();
	}
}
