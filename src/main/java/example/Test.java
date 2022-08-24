package example;

public class Test {
    public static void main(String[] args) {

        User user = new User();
        user.setId(1L);
        user.setFirstName("Mehmet");
        user.setLastName("Kaynak");

        Account account = new Account();
        account.setId(1L);
        account.setAccountNumber(11231234234123234L);
        account.setBalance(5000.0);

        UserRepository userRepository = new UserRepository();
        userRepository.save(user);

        AccountRepository accountRepository = new AccountRepository();
        accountRepository.save(account);



    }
}
