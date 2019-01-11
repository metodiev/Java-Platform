package test.loops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionsInJava {

	public static void main(String[] args) throws Exception {

		// tryCatchFinally();
		// stackOverflowExceptionFunc(5);
		//uncheckedContext();
		//System.out.println(tryFinallyMethod());
		 //catchException();
		exceptionWithFile();
	}

	
	public static void exceptionWithFile() throws IOException{
		FileInputStream in = null;
	      FileOutputStream out = null;

	      try {
	         in = new FileInputStream("input.txt");
	         out = new FileOutputStream("output.txt");
	         
	         int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);
	         }
	      }catch (FileNotFoundException e) {
	    	  StringWriter writer = new StringWriter();
				e.printStackTrace(new PrintWriter(writer, true));
				System.out.println("exeption stack is :\n" + writer.toString());
		}
	      finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	}
	
	public static void catchException() throws Exception
    {
        try
        {
            int[] piNumbers = { 2, 3, 4 };

            for (int i = 0; i < 41; i++)
            {
                System.out.println(piNumbers[i]);
            }
        }
        catch (Exception e)
        {
            
            throw new Exception("Error Message");
            
        }
    }
	
	@SuppressWarnings("finally")
	private static int tryFinallyMethod() {
		int a = 5;
		int b = 2;
		try {
			
			System.out.println("Try 1 ");

				try {
					int a1 = 5;
					int b1 = 2;
					System.out.println("Try 2 ");
					return a1 + b1;
				} catch (Exception e) {
					System.out.println("Catch 1 ");
				} finally {
					System.out.println("Finally 1");
					
				}

			return a + b;
		} finally {
			System.out.println("Finally");
			return a + b+10000;
			
		}

	}

	private static int stackOverflowExceptionFunc(int sum) {
		try {
			return stackOverflowExceptionFunc(sum) + 1;
		} catch (StackOverflowError e) {
			StringWriter writer = new StringWriter();
			e.printStackTrace(new PrintWriter(writer, true));
			System.out.println("exeption stack is :\n" + writer.toString());

			System.out.println("StackOVerflow exception");
			System.out.println(e);

		}
		return sum;

	}

	private static void tryCatchFinally() {
		try {
			int sum = 100;
			System.out.println("Try block");
		} catch (Exception e) {
			System.out.println("This exception is not going to be executed");
		} finally {
			System.out.println("The finally method is always executed it doesn't mather of situation");
		}
	}

	public static void uncheckedContext() {
		// The first short will overflow after the second short does.
		short a = 0;
		short b = 100;
		try {
			//
			// Keep incrementing the shorts until an exception is thrown.
			// ... This is terrible program design.
			//

			while (true) {
				b++;
				// There are two types of exceptions checked and uncheked
				// checked - compile time exception
				// unchecked - runtime exception

				try {
					a++;
					short p = Short.MIN_VALUE + 1;
					String str = String.valueOf(a);

				}

				catch (Exception e) {
					StringWriter writer = new StringWriter();
					e.printStackTrace(new PrintWriter(writer, true));
					System.out.println("exeption stack is :\n" + writer.toString());

				}

			}
		} catch (Exception e) {
			// Display the value of the shorts when overflow exception occurs.
			System.out.println(a);
			System.out.println(b);
		}
	}

}
