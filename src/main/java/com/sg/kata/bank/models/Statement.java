/**
 * @author mnasraoui
 */
package com.sg.kata.bank.models;

import java.util.LinkedList;
import java.util.List;

public class Statement {

    private final List<StatementLine> statementLines = new LinkedList<StatementLine>();
    private final List<Object> statementResult = new LinkedList<Object>();
    int index = 0;

    public void addLine(Transaction transaction, Amount currentBalance) {
        statementLines.add(new StatementLine(transaction, currentBalance));
    }

    public List<Object> printStatementLines() {
        for (StatementLine statementLine : statementLines) {
            index++;
            statementResult.add(index);
            statementResult.add(statementLine.getTransaction().getDate());
            if(statementLine.getTransaction().getType().equals(TransactionType.Deposit))
            {
            	statementResult.add(statementLine.getTransaction().getValue().getValue());
            	statementResult.add(0);
            }
            else if(statementLine.getTransaction().getType().equals(TransactionType.Withdrawal))
            {
            	statementResult.add(0);
            	statementResult.add(statementLine.getTransaction().getValue().getValue());
            }
            
            statementResult.add(statementLine.getCurrentBalance().getValue());
        }
        return statementResult;
    }
    
}