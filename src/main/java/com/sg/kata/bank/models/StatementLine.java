/**
 * @author mnasraoui
 */
package com.sg.kata.bank.models;

public class StatementLine {

    private final Transaction transaction;

    private final Amount currentBalance;

    public Transaction getTransaction() {
		return transaction;
	}

	public Amount getCurrentBalance() {
		return currentBalance;
	}

	public StatementLine(Transaction transaction, Amount currentBalance) {
        this.transaction = transaction;
        this.currentBalance = currentBalance;
    }

}