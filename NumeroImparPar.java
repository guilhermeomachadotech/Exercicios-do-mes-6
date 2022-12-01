package prjNumeroImparPar;
import java.util.*;
public class NumeroImparPar {
	public static void main (String args[]) {
		Scanner ler=new Scanner (System.in);
		short num, imparPar;
		System.out.println("Digite um número para descobrir se ele é impar ou par:");
		num=ler.nextShort();
		imparPar= (short) (num%2);
		if (imparPar==0) {
			System.out.println ("O número é par.");
		}else {
			System.out.println ("O número é impar.");
		}
		ler.close();
	}

}
