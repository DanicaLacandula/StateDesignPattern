public class SuspendedState implements AccountState {
    @Override
    public void deposit(Account account, Double depositAmount) {
        System.out.println("You can not deposit on suspended account!"); // [cite: 24]
        System.out.println(account.toString()); // [cite: 25]
    }

    @Override
    public void withdraw(Account account, Double withdrawAmount) {
        System.out.println("You can not withdraw on suspended account!"); // [cite: 27]
        System.out.println(account.toString()); // [cite: 28]
    }

    @Override
    public void activate(Account account) {
        account.setAccountState(new ActiveState()); // [cite: 21]
        System.out.println("Account is activated!"); // [cite: 22]
    }

    @Override
    public void suspend(Account account) {
        System.out.println("Account is already suspended!"); // [cite: 18]
    }

    @Override
    public void close(Account account) {
        account.setAccountState(new ClosedState()); // [cite: 19]
        System.out.println("Account is closed!"); // [cite: 20]
    }
}