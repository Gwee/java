import java.util.Scanner;

public class Rectangle {
	private int width, height;

	public Rectangle(int w, int h) {
		width = w;
		height = h;
	}

	public void drawfilled() {
		drawfilled('*');
	}

	public void drawfilled(char Character) {
		for (int i = 0; i < height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print(Character);
				if (j == width) {
					System.out.println("");
				}
			}
		}
	}

	public void draw() {
		draw('*');
	}

	public void draw(char Character){
		for (int i = 0; i < height; i++) {
			if (i == 0 || i == height - 1) {
				for (int j = 1; j <= width; j++) {
					System.out.print(Character);
				}
			} else {
				for (int j = 0; j < width; j++) {
					if (j == 0 || j == width - 1) {
						System.out.print(Character);
					} else {
						System.out.print(" ");
					}
				}
			}		
			System.out.println();
		}
	}
	public void readrect(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the dimenions of the new rectangle");
		System.out.println("Width:");
		width = scan.nextInt();
		System.out.println("Height:");
		height = scan.nextInt();
		scan.close();
	}
}
