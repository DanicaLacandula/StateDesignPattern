public class ClosedState implements AccountState {
    @Override
    public void deposit(Account account, Double depositAmount) {
        System.out.println("You can not deposit on closed account!"); // [cite: 38]
        System.out.println(account.toString()); // [cite: 39]
    }

    @Override
    public void withdraw(Account account, Double withdrawAmount) {
        System.out.println("You can not withdraw on closed account!"); // [cite: 41]
        System.out.println(account.toString()); // [cite: 42]
    }

    @Override
    public void activate(Account account) {
        System.out.println("You can not activate closed account!"); // [cite: 36]
    }

    @Override
    public void suspend(Account account) {
        System.out.println("You cannot suspend closed account!"); // [cite: 32]
    }

    @Override
    public void close(Account account) {
        System.out.println("Account is already closed!"); // [cite: 34]
    }
}