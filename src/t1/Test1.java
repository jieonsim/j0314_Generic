package t1;

class Apple {
}

class AppleGoods {
	// 필드
	private Apple apple = new Apple();

	// getter
	public Apple getApple() {
		return apple;
	}

	// setter
	public void setApple(Apple apple) {
		this.apple = apple;
	}
}

class Food {
}

class FoodGoods {
	// 필드
	private Food food = new Food();

	// getter
	public Food getFood() {
		return food;
	}

	// setter
	public void setFood(Food food) {
		this.food = food;
	}
}

public class Test1 {
	public static void main(String[] args) {
		// AppleGoods를 통해서 Apple 객체를 추가 및 가져오기
		AppleGoods ag = new AppleGoods();
		ag.setApple(new Apple());
		Apple apple = ag.getApple();
		System.out.println("apple : " + apple);
		System.out.println();

		// FoodGoods를 통해서 Food 객체를 추가 및 가져오기
		FoodGoods fg = new FoodGoods();
		fg.setFood(new Food());
		Food food = fg.getFood();
		System.out.println("food : " + food);
	}
}
