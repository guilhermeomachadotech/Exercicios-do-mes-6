package prjSalarioMinimo;
import java.util.*;
public class SalarioMinimo {
	public static void main (String args[]) {
		Scanner in=new Scanner (System.in);
		double salario;
		System.out.println ("Digite o sal�rio do usu�rio:");
		salario=in.nextDouble();
		if (salario>=954) {
			System.out.println ("O sal�rio est� acima ou � igual ao valor do sal�rio m�nimo.");
		}else {
			System.out.println ("O sal�rio est� abaixo do valor do sal�rio m�nimo.");
		}
		in.close();
	}

}
