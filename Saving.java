public class Saving extends Account{
    Saving(){
        super(0);
    }
    int deposits = 0;

    @Override
    public void withdraw(double x){
        this.setAccountBalance(getAccountBalance() - x);
        if(this.getAccountBalance() < 500){
            System.out.println("Charging an overdraft fee of $10 because account is below $500");
            this.setAccountBalance(getAccountBalance() - 10);
        }
    }

    @Override
    public void deposit(double x){
        deposits++;
        System.out.println("This is deposit " + deposits + " to this account");
        if(deposits > 5){
            System.out.println("Charging a fee of $10");
            this.setAccountBalance(getAccountBalance() + x - 10);

        }
        else{
            this.setAccountBalance(getAccountBalance() + x);
        }


    }

    public void interest(){
        double interest = this.getAccountBalance() * .015;
        System.out.println("Customer earned " + interest + " in interest");
        this.setAccountBalance(getAccountBalance() + interest);

    }
}

