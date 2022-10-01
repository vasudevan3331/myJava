package vasu.salem.Projectjava;

public class methodSampleForATM {
    public static void main(String[] args) {
        atm card = new atm();
        card.balance = 5000.60;
        card.accno = 234567899875l;
        card.name = "vasu";
        //card.amount=3000;
        card.deposte(400);
    }
}


//        Bank acc=new Bank();
//        acc.balance=50000.34;acc.name="arun";acc.accoundnum=4476158248L;acc.mobileno=9898989898L;acc.amount=2000;
//
//        acc.withdrawl(500);
//        acc.withdrawl(45000);
//
//        Bank acc1=new Bank();
//        acc1.balance=1000.87; acc1.mobileno=87656787656L;acc1.name="Vasu";acc1.accoundnum=12121219834567L;acc1.amount=4000;
//        acc1.withdrawl(1000);
//
//    }
//}
//
//class Bank{
//    String name;
//    long accoundnum;
//    long mobileno;
//    double balance;
//    int amount;
//
//    public void withdrawl(int required) {
//        if (required <= balance) {
//            balance -= required;
//            System.out.println(required + " cash withdrawn successfully from " + accoundnum);
//            System.out.println("your balance is " + balance);
//        } else {
//            System.out.println("Insufficient balance in account " + accoundnum);
//        }
//    }
        class atm {
            String name;
            double balance;
            int amount;
            long accno;

            public void deposte(int required) {
                balance =required+amount;
                System.out.println("your amount has be deposited " + balance+" to the "+accno+" "+name);


            }
        }



