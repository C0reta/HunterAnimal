package Main;

import Animal.*;
import Place.*;

public class Hunter {
	AnimalFarm animalfarm = AnimalFarm.getInstance();
	Forest forest = Forest.getInstance();
	Zoo zoo = Zoo.getInstance();

	int money = 100;

	public Hunter() {
		System.out.println("########################################################");
		System.out.println(" 두둥 ! 숲속에 사냥꾼이 나타났습니다.! 이제사냥을 시작합니다.");
		System.out.println("########################################################");
	}

	public Hunter(int size) {
		this();
		AnimalFarm animalfarm = AnimalFarm.getInstance(size);
	}

	public void showInfo() {
		System.out.println("------------------------------------------------");
		System.out.println("사냥꾼의 동물농장 크기 : " + animalfarm.getSize());
		System.out.println("사냥꾼의 money: " + this.money + "만원");
		System.out.println("동물농장에 있는 동물 수: " + animalfarm.numOfAnimals);
		System.out.println("------------------------------------------------");

		animalfarm.showAnimals();
	}

	public void Show() {
		System.out.println("==========================================================================");
		System.out.print("##  사냥꾼의 동물농장 :");
		animalfarm.showAnimals();

	}

	public boolean Hunt(Animal animal) {
		System.out.println("무조건 성공! 뭐든지 잡고 본다! " + animal.name);
		return true;
	}

	public boolean Hunt(Dog dog) {
		boolean signal = doRandom(dog);
		return signal;
	}

	public boolean Hunt(Snake snake) {
		boolean signal = doRandom(snake);
		return signal;
	}

	public boolean Hunt(Shark shark) {
		boolean signal = doRandom(shark);
		return signal;
	}

	public boolean doRandom(Animal animal) {
		int r = (int) (Math.random() * 1000) % 100;
		if (r < animal.getHuntProb()) {
			System.out.println(animal.name + "사냥하기 성공!");
			return true;
		} else
			System.out.println(animal.name + "사냥하기 실패!");
		return false;
	}

	public void Hunt() {
		Animal animal = forest.getAnimal();
		boolean sig = false;
		if (animal instanceof Dog)
			sig = Hunt((Dog) animal);
		else if (animal instanceof Snake)
			sig = Hunt((Snake) animal);
		else if (animal instanceof Shark)
			sig = Hunt((Shark) animal);
		else
			sig = Hunt(animal);

		if (sig == true) {
			forest.removeAnimal(animal);
			animalfarm.addAnimal(animal);
		}

	}

}
