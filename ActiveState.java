public class ActiveState implements AccountState {
    @Override
    public void deposit(Account account, Double depositAmount) {
        account.setBalance(account.getBalance() + depositAmount); // [cite: 10]
        System.out.println(account.toString()); // [cite: 11]
    }

    @Override
    public void withdraw(Account account, Double withdrawAmount) {
        account.setBalance(account.getBalance() - withdrawAmount); // [cite: 13]
        System.out.println(account.toString()); // [cite: 14]
    }

    @Override
    public void activate(Account account) {
        System.out.println("Account is already activated!"); // [cite: 8]
    }

    @Override
    public void suspend(Account account) {
        account.setAccountState(new SuspendedState()); // [cite: 3]
        System.out.println("Account is suspended!"); // [cite: 4]
    }

    @Override
    public void close(Account account) {
        account.setAccountState(new ClosedState()); // [cite: 5]
        System.out.println("Account is closed!"); // [cite: 6]
    }
}