Feature: Values Validations on the Values Screen

Scenario: Verify the right count of values appear on the screen

Given Browser is opened
And values Screen is appeared
When Values in the textBox appeared
Then Count displayed is correct


#
#Scenario: Verify the values on the screen are greater than 0
#
#Given Browser is opened
#And values Screen is appeared
#When Values in the textBox appeared
#Then Displayed values are greater then 0
#
#Scenario: Verify the total balance is correct based on the values listed on the screen
#
#Given Browser is opened
#And values Screen is appeared
#When Values in the textBox appeared
#And Values displayed is summed up 
#Then total Balance Value should be same as summed up value 
#
#
#Scenario: Verify the values are formatted as currencies
#
#Given Browser is opened
#And values Screen is appeared
#When Values in the textBox appeared
#Then values displayed are starting with currency symbol
#
#
#Scenario: Verify the total balance matches the sum of the values
#
#Given Browser is opened
#And values Screen is appeared
#When Values in the textBox appeared
#And Values displayed is summed up 
#Then total Balance Value should be same as summed up value 
#
#

