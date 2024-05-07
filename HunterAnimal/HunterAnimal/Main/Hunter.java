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
		System.out.println(" �ε� ! ���ӿ� ��ɲ��� ��Ÿ�����ϴ�.! ��������� �����մϴ�.");
		System.out.println("########################################################");
	}

	public Hunter(int size) {
		this();
		AnimalFarm animalfarm = AnimalFarm.getInstance(size);
	}

	public void showInfo() {
		System.out.println("------------------------------------------------");
		System.out.println("��ɲ��� �������� ũ�� : " + animalfarm.getSize());
		System.out.println("��ɲ��� money: " + this.money + "����");
		System.out.println("�������忡 �ִ� ���� ��: " + animalfarm.numOfAnimals);
		System.out.println("------------------------------------------------");

		animalfarm.showAnimals();
	}

	public void Show() {
		System.out.println("==========================================================================");
		System.out.print("##  ��ɲ��� �������� :");
		animalfarm.showAnimals();

	}

	public boolean Hunt(Animal animal) {
		System.out.println("������ ����! ������ ��� ����! " + animal.name);
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
			System.out.println(animal.name + "����ϱ� ����!");
			return true;
		} else
			System.out.println(animal.name + "����ϱ� ����!");
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
