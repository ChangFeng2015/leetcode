package leetcode.threadtest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/26 10:55
 */
public class AccountLock {
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    private String accountNo;
    private double balance;

    private boolean flag = false;

    public AccountLock(){

    }

    public AccountLock(String accountNo,double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void draw(double drawAmount){
        lock.lock();
        try{
            if(!flag){
                condition.await();
            }else {
                System.out.println(Thread.currentThread().getName() + " draw:" + drawAmount);
                balance -= drawAmount;
                System.out.println("the balance is " + balance);
                flag = false;
                condition.signalAll();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }

    public void deposit(double depositAmount){
        lock.lock();
        try{
            if(flag){
                condition.await();
            }else {
                System.out.println(Thread.currentThread().getName() + "deposit:" + depositAmount);
                balance += depositAmount;
                System.out.println("the balance is " + balance);
                flag = true;
                condition.signalAll();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }


}
