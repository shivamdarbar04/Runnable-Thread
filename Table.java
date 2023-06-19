package Thread.java;

public class Table
{
    public synchronized void printTable(int num)
    {
        try{
            for(int i=1;i<=10;i++)
            {
                System.out.println(num + i + (num*i));
                Thread.sleep(1500);
            }
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
 }
    class syncMain
 {
    public static void main(String[] args) {
        Table obj = new Table();
        Thread t1 = new Thread()
        {
        @Override
        public void run()
       {
        obj.printTable(13);    
        }
    };
    Thread t2 = new Thread()
    {
        @Override
        public void run()
        {
            obj.printTable(17);
        }
    };
    t1.start();
    t2.start();
    }
}