/**
 * @author mnasraoui
 */
package com.sg.kata.bank.models;


public class Amount {

    private final int value;

    public int getValue() {
		return value;
	}

	public Amount(int value) {
        this.value = value;
    }

    public static Amount amountOf(int value) {
        return new Amount(value);
    }

    public Amount plus(Amount otherAmount) {
        return amountOf(this.value + otherAmount.value);
    }
    
    public Amount minus(Amount otherAmount) {
        return amountOf(this.value - otherAmount.value);
    }


    @Override
    public boolean equals(Object obj) {
        Amount other = (Amount) obj;
        if (value != other.value) {
            return false;
        }
        return true;
    }

}