class PriorityExample extends Thread{
public void run(){
System.out.println(
Thread.currentThread().getName()+"-Priority:"+
Thread.currentThread().getPriority()
);
}
public static void main(String[]args){
PriorityExample t1=new PriorityExample();
PriorityExample t2=new PriorityExample();
PriorityExample t3=new PriorityExample();
t1.setName("Low Priority Thread");
t2.setName("Normal priority Thread");
t3.setName("High Priority Thread");
t1.setPriority(Thread.MIN_PRIORITY);
t2.setPriority(Thread.NORM_PRIORITY);
t3.setPriority(Thread.MAX_PRIORITY);
t1.start();
t2.start();
t3.start();
}
}
