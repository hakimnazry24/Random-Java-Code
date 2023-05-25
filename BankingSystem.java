public class BankingSystem {
    public static void main(String[] args){
    
    }
}
class BankAccount{
    private long account_number;
    private float balance;

    BankAccount(long a){
        account_number = a;
    }

    public long getAccount_number(){
        return account_number;
    }
    public float getBalance(){
        return balance;
    }
    public void  setBalance(float amount){
        balance = amount;
    }
    public void transferMoney(int amount, BankAccount account){
        account.balance += amount;
        this.balance -= amount;
    }
}
class ChildAccount extends BankAccount{
    private int parent_cred;

    ChildAccount(int a, int p){
        super(a);
        parent_cred = p;
    }
    public Boolean verifyWithParent(int cred){
        if(parent_cred == cred){
            return true;
        }
        return false;
    }
}
class AdultAccount extends BankAccount{
    AdultAccount(long a){
        super(a);
    }
}

class User{
    String name;
    String username;
    int password;
    int phone_num;
    Boolean isLoggedIn;

    User(String n, String u, int p, int ph){
        name = n;
        username = u;
        password = p;
        phone_num = ph;
    }

    public void loginAccount(String username, int password){
        if((this.username == username) && (this.password == password)){
            isLoggedIn = true;
        }
    }
    public void logoutAccount(){
        isLoggedIn = false;
    }
}
