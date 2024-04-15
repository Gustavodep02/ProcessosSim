package controller;

import java.util.concurrent.Semaphore;

public class ThreadProcessos extends Thread{
	Semaphore semaforo = new Semaphore(1);
	int processo ;
	public ThreadProcessos(int processo) {
		this.processo = processo;
	}
	
	@Override
	public void run() {
		try {
			semaforo.acquire();
			processar();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			semaforo.release();
		}
		System.out.println("Processo "+processo+" finalizado");
		
	}
	public void processar() {
		int num = (int) (Math.random()*117) + 4;
		try {
			Thread.sleep(num*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
