package ch5.chlng;

import java.util.Arrays;
import java.util.Scanner;

abstract class GameObject {
	protected int distance;
	protected int x, y;

	public GameObject(int startX, int startY, int distance) {
		this.x = startX;
		this.y = startY;
		this.distance = distance;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean collide(GameObject p) {
		if (this.x == p.getX() && this.y == p.getY())
			return true;
		else
			return false;
	}

	protected abstract void move();

	protected abstract char getShape();
}

class Bear extends GameObject {

	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	@Override
	protected void move() {
		Scanner sc = new Scanner(System.in);

		System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
		int direction = sc.nextInt();
		switch (direction) {
		case 'a':
			x += -1;
			break;
		case 's':
			y += 1;
			break;
		case 'd':
			y += -1;
			break;
		case 'f':
			x += 1;
			break;
		}

	}

	@Override
	protected char getShape() {
		return 'B';
	}

}

class Fish extends GameObject {

	public Fish(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	@Override
	protected void move() {
		int direction = (int) (Math.random() * 4);
		switch (direction) {
		case 0:
			x += -1;
			break;
		case 1:
			y += 1;
			break;
		case 2:
			y += -1;
			break;
		case 3:
			x += 1;
			break;
		}
	}

	@Override
	protected char getShape() {
		return '@';
	}

}

public class Game {

	private static char[][] map;

	public Game() {
		map = new char[10][20];
		fillMap();
	}
	
	public static void fillMap() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = '-';
			}
		}
	}

	public static void printMap() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("** Bear의 Fish 먹기 게임을 시작합니다.**");
		Game game = new Game();
		Bear bear = new Bear(0, 0, 1);
		Fish fish = new Fish(5, 5, 1);

		map[bear.getX()][bear.getY()] = bear.getShape();
		map[fish.getX()][fish.getY()] = fish.getShape();

		int round = 0;
		int noMove = 0;
		while (true) {
			if (!bear.collide(fish)) {
				printMap();
			} else {
				map[bear.getX()][bear.getY()] = bear.getShape();
				printMap();
				System.out.println("Bear Wins!!");
				break;
			}

			fillMap();
			bear.move();

			int flag = (int) (Math.random() * 2);
			if ((flag == 1 && noMove < 3) || noMove >= 3) {
				fish.move();
				noMove++;
			} else {
				noMove++;
			}

			round++;
			if (round % 5 == 0 && round != 0)
				noMove = 0;

		}

	}

}
