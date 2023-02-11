Feature: An example

  Scenario: The example
    Given I am on the main page
    When I write the email address of "test@tester.com"
    And I click the submit button

  Scenario: Negative #1
    Given I am on the main page
    When I write the email address of "test@tester.ro"
    And I click the submit button

  Scenario: Negative #2
    Given I am on the main page
    When I write the email address of "testsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestssss"
    And I click the submit button
