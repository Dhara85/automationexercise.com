@regression
Feature: As a user,
  I should register successfully
  I should see error message while register with existing email
  I should Place Order: Register while Checkout
  I should Place Order: Register before Checkout
  I should Place Order: Login before Checkout
  I should verify address details in checkout page

  @author_Dhara @sanity @smoke
  Scenario: User should register successfully
    Given I am on homepage and verify the homepage URL
    When I click on header menu option "Signup / Login"
    Then I should see the login page text "New User Signup!"
    And I send name "Leo" and email "leo" to signup
    And I click on button "Signup"
    Then I should see text "ENTER ACCOUNT INFORMATION"
    And I fill all details in signup page "Mr" "leo789" "25" "July" "1985" "Leo" "Smith" "Prince Court" "Waghodiya Road" "India" "Gujarat" "Vadodara" "390019" "09584766214"
    And I click on news letter subscription check box
    And I click on special offers check box
    And I click on Create Account button
    Then I see account created message "ACCOUNT CREATED!"
    And I click on continue button
    Then I should see the text "Logged in as " "Leo"
    And I click on header menu option "Delete Account"
    Then I should see the account deleted message "ACCOUNT DELETED!"
    And I click on continue button after deleting account

  @author_Dhara
  Scenario: User should scroll down and scroll up using Arrow button at bottom right corner
    Given I am on homepage and verify the homepage URL
    When I scroll down up to subscription link
    Then I should see the subscription "SUBSCRIPTION" text
    And I click on arrow up button at bottom right corner
    And I should see the message "Full-Fledged practice website for Automation Engineers"

  @author_Dhara
  Scenario: User should scroll down and scroll up without Arrow button
    Given I am on homepage and verify the homepage URL
    When I scroll down up to subscription link
    Then I should see the subscription "SUBSCRIPTION" text
    And I scroll up
    And I should see the message "Full-Fledged practice website for Automation Engineers"