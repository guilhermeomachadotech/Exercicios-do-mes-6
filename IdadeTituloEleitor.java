import java.util.*;
public class IdadeTituloEleitor {
	public static void main (String args[]) {
		Scanner ler=new Scanner (System.in);
		short anoNascto, anoAtual, idade;
		System.out.println("Digite o seu ano de nascimento:");
		anoNascto=ler.nextShort();
		System.out.println("Digite o ano atual:");
		anoAtual=ler.nextShort();
		idade=(short) (anoAtual-anoNascto);
		System.out.println("Voc� possui "+idade+" anos de idade.");
		if (idade>=16) {
			System.out.println("Voc� poder� tirar o seu t�tulo de eleitor.");
		}else {
			System.out.println("Voc� n�o poder� tirar o seu t�tulo de eleitor.");
		}
		ler.close();
	}

}
