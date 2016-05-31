/**
 * @author mnasraoui
 */
package com.sg.kata.bank.step;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/com/sg/kata/bank/features/account.features")
public class RunCukesTest {
}