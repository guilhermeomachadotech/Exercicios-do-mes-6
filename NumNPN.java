import java.util.*;
public class NumNPN {
	public static void main (String []args) {
		Scanner ler= new Scanner (System.in);
		short num;
		System.out.println ("Digite um n�mero:");
		num=ler.nextShort();
		if (num==0) {
			System.out.println("O n�mero � neutro.");
		}else if(num<0) {
			System.out.println("O n�mero � negativo.");
		}else {
			System.out.println("O n�mero � positivo.");
		}
		ler.close();
	}

}
