package Main;

import Place.*;
import Animal.*;

import java.util.Scanner;

public class Main {

	public static void menu보기() {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println(
				"숲속에 동물생성:  1.강아지      2.뱀               3.독수리                     4. 상어     ......... 9.랜덤생성   ");
		System.out.println("   	     동작  : 11.사냥하기  12.숲속에서? 13. 동물농장에서?  14.동물원에서? ");
		System.out.println("   상태 보기  : 21.숲속보기  22.사냥꾼의 동물농장보기   23.동물원보기   24. 모두 보기        0.종료");
		System.out.println("-----------------------------------------------------------------------");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Forest forest = Forest.getInstance();
		Zoo zoo = Zoo.getInstance();
		AnimalFarm farm = AnimalFarm.getInstance();
		int menu = 0;

		// 사냥꾼 생성
		Hunter hunter = new Hunter();
		hunter.showInfo();

		// 강아지 한마리 생성 후 사냥!
		Dog d = new Dog("흰둥이");
		boolean sig = hunter.Hunt(d);

		// 사냥을 성공했다면, 동물농장에 넣기, 이 동작은 addAnimal()로 모듈화할 수 있고 "사냥개"에게 임무를 맡길 수 있음
		if (sig == true)
			farm.addAnimal(d);
		hunter.Show();
		farm.Show();
		//////////////////////////////////////////////////////

		// 메뉴로 동작시키기
		System.out.println("------------------------------------------------------");
		System.out.println("메뉴로 동작시키기");
		int i = 0;
		while (true) {

			menu보기();
			System.out.print("menu: ");
			menu = input.nextInt();
			if (menu == 0) {
				System.out.println("프로그램 종료!");
				break;
			}
			switch (menu) {
			case 1:
				forest.addAnimal(new Dog("댕댕이" + (i++)));
				break;
			case 2:
				forest.addAnimal(new Snake("슈슈뱀" + (i++)));
				break;
			case 3:
				forest.addAnimal(new Hawk("수리수리" + (i++)));
				break;
			case 4:
				forest.addAnimal(new Shark("샤크" + (i++)));
				break;

			/////////////////////////////////////////
			case 11:
				hunter.Hunt();
				break;
			case 12: // 숲속활동보기- 놀기()
				forest.Play();
				break;
			case 13:// 동물농장활동보기 - 탈출시도!
				farm.Escape();
				break;
			case 14: // 동물원 활동보기 - 일하기();
				zoo.Work();
				break;
			case 21:
				forest.Show();
				break;
			case 22:
				hunter.Show();
				break;
			case 23:
				zoo.Show();
				break;
			case 24:
				forest.Show();
				farm.Show();
				zoo.Show();
				break;
			default:
				System.out.println("그런 메뉴는 없습니다.");
				break;
			}
		}
		// 메뉴없이 숲속동물 랜덤하게 사냥 .
		while (true) {
			if (forest.numOfAnimals == 1) {
				System.out.println("생태계를 위해 한마리는 살려둡니다.");
				break;
			}

			hunter.Hunt();
			hunter.Show();
			forest.Show();

			// 조금 기다렸다 출력되도록 1초 delay
			Thread.sleep(1000);
		}
	}

}
