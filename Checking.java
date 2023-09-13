public class Checking extends Account {

    Checking(){
        super(0);
    }


    @Override
    public void withdraw(double x){
        this.setAccountBalance(getAccountBalance() - x);
        if(this.getAccountBalance() < 0){
            System.out.println("Charging an overdraft fee of $20 because account is below $0");
            this.setAccountBalance(getAccountBalance() - 20);
        }



    }




}



