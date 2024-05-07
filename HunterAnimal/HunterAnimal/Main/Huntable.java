package Main;

import Animal.Animal; //이거왜들어감?? 해결되긴햇어

public interface Huntable {

	public default void Hunt() {
		System.out.println("동물이 사냥을 합니다.");
	}

	public default void Hunt(Animal animal) {
		System.out.println(animal.name + "을 사냥합니다.");
	}

	public default void 사냥하기(Animal[] animals) {
		System.out.println("어떤 동물이 어떤 동물을 사냥합니다.");
		// 여러 동물들중 랜덤하게 골라 사냥하기 여러분이 만들어보세요.
		// animals[i]가 animal[j]를 사냥하도록 , i와 j는 서로 달라야 한다.

	}

}
