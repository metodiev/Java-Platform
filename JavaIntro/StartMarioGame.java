package mario.bros.game;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;

public class StartMarioGame {

	public static int x;
	public static int y;
	
	
	public static void main(String[] args) {
		//System.out.println(createMarioObject());

		// left 8592;
		// 8593 up
		// 8594 right
		// 8595 down
		/*
		 * char test = 8592; System.out.println(test);
		 */
		Scanner input = new Scanner(System.in);

		while (true) {
			try {
				Thread.sleep(100);
				System.out.println(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			char keyPressed = input.next().charAt(0);
			keyPressed(Integer.valueOf(keyPressed));
			reDrawBoard( x,  y);
			
		}
	}

	public static String createMarioObject() {
		String marioObj = " o"
		// +"\\|/\n"
		// +"/\\"
		;

		return marioObj;
	}

	public static void keyPressed(int e) {

		//System.out.println(e);

		switch (e) {
		case 119://up
			
			reDrawBoard(x++,y);
			break;
		case 97://left
			
			reDrawBoard(x,y--);
			break;
		case 100://right
			
			reDrawBoard(x,y++);
			break;
		/*
		 * case 115://down
		 * 
		 * reDrawBoard(x--,y--); break;
		 */
		default:
			break;
		}

	}
	
	public final static void clearConsole()
	{
	    try
	    {
	        final String os = System.getProperty("os.name");

	        if (os.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    catch (final Exception e)
	    {
	        //  Handle any exceptions.
	    }
	}

	
	public static void reDrawBoard(int x, int y) {
		
		//System.out.print((char)8);
		//clearConsole();
	
		//System.out.print(ESC1 + "2J"); 
		
		for (int i = 0; i < 100; i++) {
			System.out.println("\n");
			 try {
				Runtime.getRuntime().exec("clear");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		for (int i = 0; i <= x; i++) {
			System.out.println();
			for (int j = 0; j <= y; j++) {
				System.out.print(" ");
				if ( i == x && j == y) {
					System.out.println(createMarioObject());
				}
			}
			
		}
		System.out.flush();  
	}

}
