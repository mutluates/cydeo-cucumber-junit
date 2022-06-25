Feature: Calculator Tests
  @calculator
  Scenario: Test Adding
    Given User is on calculator page
    When User clicks "5" on calculator
    And User clicks "+" on calculator
    And User clicks "5" on calculator
    Then result "10" should be displayed

  Scenario: Test Subtracting
    Given User is on calculator page
    When User clicks "10" on calculator
    And User clicks "-" on calculator
    And User clicks "5" on calculator
    Then result "5" should be displayed