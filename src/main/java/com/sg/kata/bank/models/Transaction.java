/**
 * @author mnasraoui
 */
package com.sg.kata.bank.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {

    private static final String DATE_FORMAT = "dd-MM-yyyy";

    private final SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);

    private final Amount value;

    private final Date date;
    
    private TransactionType type;

    public TransactionType getType() {
		return type;
	}

	public void setType(TransactionType type) {
		this.type = type;
	}

	public Amount getValue() {
		return value;
	}

	public String getDate() {
		return sdf.format(date);
	}

	public Transaction(Amount value, Date date, TransactionType type) {
        this.value = value;
        this.date = date;
        this.type = type;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Transaction other = (Transaction) obj;
        if (date == null) {
            if (other.date != null) {
                return false;
            }
        } else if (!date.equals(other.date)) {
            return false;
        }
        if (value == null) {
            if (other.value != null) {
                return false;
            }
        } else if (!value.equals(other.value)) {
            return false;
        }
        return true;
    }

}