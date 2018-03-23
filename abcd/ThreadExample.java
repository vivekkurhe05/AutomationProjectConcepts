package abcd;

public class ThreadExample {

	public static void main(String[] args) {
		
		PrintHi ph=new PrintHi();
		Thread tr=new Thread(ph);
		tr.start();
		
		
		Thread t=new Thread(new Runnable(){
			int count=0;
			public void run(){
				
				for(int i=1;i<6;i++){
					
					System.out.println("Hello");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					count++;
				}
				System.out.println("count hello: "+count);
				
			}
			
		});
		t.start();

	}

}

class PrintHi extends Thread{
	
	public void run(){
		
		int count=0; 
		for(int i=1;i<6;i++){
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
		}
		System.out.println("count Hi: "+count);
	}
	
}
