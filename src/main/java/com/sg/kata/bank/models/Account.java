/**
 * @author mnasraoui
 */
package com.sg.kata.bank.models;

import java.util.Date;
import java.util.List;

public class Account {

    private final Statement statement;

    private Amount balance;

    public Account(Statement statement, Amount balance) {
        this.statement = statement;
        this.balance = balance;
    }

    public void deposit(Amount value, Date date) {
    	addTransaction(value, date, TransactionType.Deposit);
    }

    public void withdrawal(Amount value, Date date) {
    	addTransaction(value, date, TransactionType.Withdrawal);
    }

    public List<Object> printStatement() {
        return statement.printStatementLines();
    }

    private void addTransaction(Amount value, Date date, TransactionType type)
    {
    	Transaction transaction = new Transaction(value, date, type);
    	
    	if(type.equals(TransactionType.Deposit))
    		{System.out.println("Dep "+ balance.getValue());
    		balance = balance.plus(value);
    		statement.addLine(transaction, balance);
    		}
    	else if(type.equals(TransactionType.Withdrawal))
    		{System.out.println("Withd "+ balance.getValue());
    		balance = balance.minus(value);
    		statement.addLine(transaction, balance);
    		}
    }

}