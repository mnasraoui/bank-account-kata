/**
 * @author mnasraoui
 */
package com.sg.kata.bank.step;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Assert;

import com.sg.kata.bank.models.Account;
import com.sg.kata.bank.models.Amount;
import com.sg.kata.bank.models.Statement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PrintingSteps {

    private Account account;
//    private Amount balance;
    private List<Object> statementResult;

	@Given("^I make a deposit of (\\d+) on \"(.*?)\"$")
	public void i_make_a_deposit_of_on(int value1, String dateString1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		account = new Account(new Statement(), new Amount(0));
		
	    Amount amount = new Amount(value1);
	    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date date = null;
		try {

			date = dateString1==null? null: formatter.parse(dateString1);

		} catch (ParseException e) {
			e.printStackTrace();
		}
	    account.deposit(amount, date);
	}

	@Given("^a deposit of (\\d+) on \"(.*?)\"$")
	public void a_deposit_of_on(int value2, String dateString2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Amount amount = new Amount(value2);
	    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date date = null;
		try {

			date = dateString2==null? null: formatter.parse(dateString2);

		} catch (ParseException e) {
			e.printStackTrace();
		}
	    account.deposit(amount, date);
	}

	@Given("^a withdrawal of (\\d+) on \"(.*?)\"$")
	public void a_withdrawal_of_on(int value3, String dateString3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Amount amount = new Amount(value3);
	    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date date = null;
		try {

			date = dateString3==null? null: formatter.parse(dateString3);

		} catch (ParseException e) {
			e.printStackTrace();
		}
	    account.withdrawal(amount, date);
	}

	@When("^I print my bank statement$")
	public void i_print_my_bank_statement() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		statementResult = account.printStatement();
	}

	@Then("^the line number (\\d+) contains \"(.*?)\", (\\d+), (\\d+), (\\d+)		 the line number (\\d+) contains \"(.*?)\", (\\d+), (\\d+), (\\d+)		 the line number (\\d+) contains \"(.*?)\", (\\d+), (\\d+), (\\d+)$")
	public void the_line_number_contains_the_line_number_contains_the_line_number_contains(
			int arg1, String arg2, int arg3, int arg4, int arg5, 
			int arg6, String arg7, int arg8, int arg9, int arg10, 
			int arg11, String arg12, int arg13, int arg14, int arg15) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//		System.out.println( arg1+" "+  arg2+" "+  arg3+" "+  arg4+" "+  arg5 +" "+ arg6+" "+  arg7+" "+  arg8+" "+  arg9 +" "+ arg10 +" "+ arg11 +" "+ arg12 +" "+ arg13 +" "+ arg14 +" "+ arg15);
//		System.out.println(statementResult);
	    Assert.assertTrue(statementResult.get(0).equals(arg1));
	    Assert.assertTrue(statementResult.get(1).equals(arg2));
	    Assert.assertTrue(statementResult.get(2).equals(arg3));
	    Assert.assertTrue(statementResult.get(3).equals(arg4));
	    Assert.assertTrue(statementResult.get(4).equals(arg5));
	    Assert.assertTrue(statementResult.get(5).equals(arg6));
	    Assert.assertTrue(statementResult.get(6).equals(arg7));
	    Assert.assertTrue(statementResult.get(7).equals(arg8));
	    Assert.assertTrue(statementResult.get(8).equals(arg9));
	    Assert.assertTrue(statementResult.get(9).equals(arg10));
	    Assert.assertTrue(statementResult.get(10).equals(arg11));
	    Assert.assertTrue(statementResult.get(11).equals(arg12));
	    Assert.assertTrue(statementResult.get(12).equals(arg13));
	    Assert.assertTrue(statementResult.get(13).equals(arg14));
	    Assert.assertTrue(statementResult.get(14).equals(arg15));
	}

}
