package view;

import controller.ThreadProcessos;

public class Principal {

	public static void main(String[] args) {
		
		for (int i = 0;i<20;i++) {
			Thread t = new ThreadProcessos(i+1);
            t.start();
		}

	}

}
