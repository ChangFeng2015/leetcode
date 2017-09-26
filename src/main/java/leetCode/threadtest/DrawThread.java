package leetCode.threadtest;

/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/25 17:42
 */
public class DrawThread extends Thread {

    private Account account;
    private double drawAmount;

    public DrawThread(String name,Account account,double drawAmount){
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }

    public void run(){
        if(account.getBalance() >= drawAmount){
            System.out.println(getName() + " drow money:" + drawAmount);
            account.setBalance(account.getBalance() - drawAmount);
            System.out.println(account.getAccountNo() + "'s balance is " + account.getBalance());
        }else {
            System.out.println(account.getAccountNo() + " Get balance failed!");
        }
    }
}
