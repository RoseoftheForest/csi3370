import org.junit.Test;
import static org.junit.Assert.*;


public class AccountTest {
    @Test
    public void testAccountthings() {
        Account account1 = new Account("Ted Murphy", 72354, 102.56);
        Account account2 = new Account("Jane Smith", 69713, 40.00);
        Account account3 = new Account("Edward Demsey", 93757, 759.32);
        Account account4 = account1; // Account4 is an alias of Account1

        assertEquals(account1, account4);

        double newBalance = account1.deposit(100.00);
        assertEquals(202.56, newBalance, 0.01);

        assertNotNull(account2);
        newBalance = account2.withdraw(10.00, 2.00);
        assertEquals(28.00, newBalance, 0.01);

        double initialBalance = account3.getBalance();
        newBalance = account3.addInterest();
        double expectedBalance = initialBalance + (initialBalance * 0.035); 
        assertEquals(expectedBalance, newBalance, 0.01);


        String expectedString = "69713\tJane Smith\t$28.00";//lol this took me so long to figure out what it equaled appartently you need the tab
        String actualString = account2.toString();

        assertEquals(expectedString, actualString);
    }
}
