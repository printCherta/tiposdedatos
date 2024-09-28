package tiposdedatos.main;

public class Tiposdatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte ejbyte = -128;
		System.out.println("Valor mínimo " + Byte.MIN_VALUE+" valor máximo " + Byte.MAX_VALUE);
		
		short ejshort = 32767;
		System.out.println("Valor mínimo " + Short.MIN_VALUE+" valor máximo " + Short.MAX_VALUE);
		
		int ejint = 2147483647;
		System.out.println("Valor mínimo " + Integer.MIN_VALUE+" valor máximo " + Integer.MAX_VALUE);
		
		long ejlong = 9223372036854775807L;
		System.out.println("Valor mínimo " + Long.MIN_VALUE+" valor máximo " + Long.MAX_VALUE);
		
		float ejfloat = 3.4028235E38F;
		System.out.println("Valor mínimo " + Float.MIN_VALUE+" valor máximo " + Float.MAX_VALUE);
		
		double ejdouble = 1.7976931348623157E308D;
		System.out.println("Valor mínimo " + Double.MIN_VALUE+" valor máximo " + Float.MAX_VALUE);
		
		boolean ejbooltr = true;
		boolean ejboolfls = false;
		System.out.println("Valor cuando es Verdadero: "+ ejbooltr+ " Valor cuando es Falso: "+ejboolfls);
		
		char ejchar = 'A';
		System.out.println("Valor de la letra ejemplo: "+ ejchar);
		
		System.out.println("Elaboró Aldair Chávezzz");
	}

}
