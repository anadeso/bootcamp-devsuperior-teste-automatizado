package tests.entities;

import entities.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTests {

    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount() {

        // Arrange
        double amount = 200.0;
        double expectedValue = 196.0;
        Account account = new Account(1L, 0.0);

        // Act
        account.deposit(amount);

        // Assert
        Assertions.assertEquals(expectedValue, account.getBalance());
    }
}
