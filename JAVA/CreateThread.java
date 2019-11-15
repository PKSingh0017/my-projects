class CreateThread implements Runnable{  
	public void run(){  
		System.out.println("Another thread is running...");
	      	System.out.println("Thread id is "+Thread.currentThread().getId());
	} 

	public static void main(String args[]){  
		CreateThread m1=new CreateThread();
	        System.out.println("Thread "+ Thread.currentThread().getName()+" is running .");
                System.out.println("Thread id is "+Thread.currentThread().getId());
                System.out.println("Thread priority is "+Thread.currentThread().getPriority());
	
		Thread t1 =new Thread(m1);  
		t1.start();  
	}  
}  
