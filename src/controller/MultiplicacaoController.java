package controller;

public class MultiplicacaoController {
	
	//função recursiva
	public int multiplicacao(int a, int b) {
	    if (a == 0 || b == 0) {
	        return 0;
	    } 
	    else if (a < 0 && b < 0) {
	        a = -a;
	        b = -b;
	    } 
	    else if (a < 0) {
	        a = -a;
	        b = -b;
	    }
	    if (b > 0) {
	        return a + multiplicacao(a, b-1);
	    } 
	    else {
	        return -a + multiplicacao(a, b+1);
	    }
	}

}