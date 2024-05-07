package Animal;

import Main.*;

public abstract class Animal implements Huntable, Playable, Workable, Escapeable {
	public String name;
	private int age;
	private int huntProb;

	public int hp;
	public int power;
	private int money;

	public Animal() {

	}

	public Animal(String name) {
		this.name = name;
	}

	public int getAge() {

		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHuntProb() {

		return this.huntProb;
	}

	public void setHuntProb(int huntprob) {
		this.huntProb = huntprob;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public abstract void Play();

	public void Eat() {
		System.out.println("동물들이 산에서 풀을 뜯어먹어요");
	}

	public void Sleep() {
	}

	public void Move() {
	}

	public void show() {

	}

}
