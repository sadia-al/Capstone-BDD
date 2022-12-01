Feature: Retail Account Page
  Note: For this feature you have to have an account and be logged in into account. Repeated steps are 
  under Background Keyword

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'panthersxy@tekschool.us' and password 'Tek@123456'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option

  Scenario: Verify User can update Profile Information
    And User update Name 'Sadi' and Phone '1234567890'
    And User click on Update button
    Then user profile information should be updated

  Scenario: Verify User can Update password
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Tek@123456       | Tek@12345   | Tek@12345       |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully’

  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1234567890126756 | value      |              12 |           2022 |          101 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

  Scenario: Verify User can edit Debit or Credit card
    When User click on added card
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1234567890123587 | saggg      |               12 |           2025 |          110 |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’

  Scenario: Verify User can remove Debit or Credit card
    When User click on added card
    And User click on remove option of card section
    Then payment details should be removed

  
  Scenario: Verify User can add an Address
    And User click on Add address option
    And user fill new address form with below information
      | country     | fullName | phoneNumber | streetAddress | apt | city  | state | zipCode |
      | Afghanistan | sadia    |  6086428220 | 25 S          | 2e  | kabul | Kabul |   10601 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’

  
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And user fill new address form with below informations
      | country | fullName | phoneNumber | streetAddress | apt   | city  | state | zipCode |
      | United States   | sadia | 1234567890| 34 S  | 2w |  white plains | New York | 17896  |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’
    
	 @testAccount
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
