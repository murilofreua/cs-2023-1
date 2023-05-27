import java.util.Stack;
import java.util.Random;

class Par {
	
    private final int x;
    private final int y;
 
    Par(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
 
    public int getX() { return x; }
    public int getY() { return y; }
}

public class QuickSort {

	public static void swap(int[] v, int i, int j)
	{
		int temp = v[i];
		v[i] = v[j];
		v[j] = temp;
	}

	public static int divide(int[] v, int low, int high)
	{
		int pivo = v[high];

		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) {
			
			if (v[j] < pivo) {
				
				i++;
				swap(v, i, j);
			}
		}
		
		swap(v, i + 1, high);
		
		return (i + 1);
	}
	
	public static void RecursivoQS(int[] v, int low, int high)
	{
		if (low < high) {

			int pi = divide(v, low, high);
			
			RecursivoQS(v, low, pi - 1);
			RecursivoQS(v, pi + 1, high);
		}
	}
	
	public static void IterativoQS(int[] v)
    {
        Stack<Par> stack = new Stack<>();
 
        int start = 0;
        int end = v.length - 1;
 
        stack.push(new Par(start, end));
 
        while (!stack.empty())
        {
            start = stack.peek().getX();
            end = stack.peek().getY();
            stack.pop();
 
            int pivo = divide(v, start, end);
 
            if (pivo - 1 > start) {
                stack.push(new Par(start, pivo - 1));
            }
 
            if (pivo + 1 < end) {
                stack.push(new Par(pivo + 1, end));
            }
        }
    }

	public static void main(String[] args)
	{
		Random random = new Random();
		
		int[] v1 = new int[100];
		int[] v2 = new int[1000];
		int[] v3 = new int[10000];
		
		for(int i = 0; i < v1.length; i++) {
			v1[i] = random.nextInt();
		}
		
		for(int i = 0; i < v2.length; i++) {
			v2[i] = random.nextInt();
		}
		
		for(int i = 0; i < v3.length; i++) {
			v3[i] = random.nextInt();
		}
		
		long start = System.nanoTime();
		
		RecursivoQS(v1, 0, 99);
		
		long end = System.nanoTime();
		long execution = end - start;
		
		System.out.println("Tempo de execução (100 elementos - Método Recursivo): " + execution + " ns");
		
		start = System.nanoTime();
		
		RecursivoQS(v2, 0, 999);
		
		end = System.nanoTime();
		execution = end - start;
		
		System.out.println("Tempo de execução (1000 elementos - Método Recursivo): " + execution + " ns");
		
		start = System.nanoTime();
		
		RecursivoQS(v3, 0, 9999);
		
		end = System.nanoTime();
		execution = end - start;
		
		System.out.println("Tempo de execução (10000 elementos - Método Recursivo): " + execution + " ns");
		
		for(int i = 0; i < v1.length; i++) {
			v1[i] = random.nextInt();
		}
		
		for(int i = 0; i < v2.length; i++) {
			v2[i] = random.nextInt();
		}
		
		for(int i = 0; i < v3.length; i++) {
			v3[i] = random.nextInt();
		}
		
		long start2 = System.nanoTime();
		
		IterativoQS(v1);
		
		long end2 = System.nanoTime();
		long execution2 = end2 - start2;
		
		System.out.println("\n\nTempo de execução (100 elementos - Método Iterativo): " + execution2 + " ns");
		
		start2 = System.nanoTime();
		
		IterativoQS(v2);
		
		end2 = System.nanoTime();
		execution2 = end2 - start2;
		
		System.out.println("Tempo de execução (1000 elementos - Método Iterativo): " + execution2 + " ns");
		
		start2 = System.nanoTime();
		
		IterativoQS(v3);
		
		end2 = System.nanoTime();
		execution2 = end2 - start2;
		
		System.out.println("Tempo de execução (10000 elementos - Método Iterativo): " + execution2 + " ns");
	}
}

