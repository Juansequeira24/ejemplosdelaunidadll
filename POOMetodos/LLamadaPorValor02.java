package POOMetodos;

public class LLamadaPorValor02 {

	public int sumar(int arg1, int arg2) {
		arg1 = 100;
		int resultado = arg1 + arg2;
		return resultado;
	}
	public static void main(String[] args) {
	  LLamadaPorValor02 calc = new LLamadaPorValor02();
	  int arg1 = 10, arg2 = 30;
	  System.out.println("arg1 antes de ser pasado por valor = " + arg1);
	  int resultado = calc.sumar(arg1,arg2);
	  System.out.println("arg1 despues de ser pasado por valor = " + arg1);
	  System.out.println("resultado = " + resultado);

	}

}
