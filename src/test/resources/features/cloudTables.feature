Feature: DDT example with CloudTables
  @wip
  Scenario: Adding one person
    Given User is on cloudTables homepage
    When User clicks on New button
    When User enters "chuck" to firstname field
    And User enters "norris" to lastname field
    And User enters "SDET" to position field
    And User enters "10000" to salary field
    And user clicks on create button
    And User should be able to find person at the search box "positive"
    And User deletes the person created
    And User should be able to find person at the search box "negative"
# change this scenario into DDT format --> turn it into scenario outline


  Scenario Outline:
    Given User is on cloudTables homepage
    When User clicks on New button
    When User enters "<firstname>" to firstname field
    And User enters "<lastname>" to lastname field
    And User enters "<position>" to position field
    And User enters "<salary>" to salary field
    And user clicks on create button
    And User should be able to find person at the search box "positive"
    And User deletes the person created
    And User should be able to find person at the search box "negative"
    Examples:
      | firstname | lastname  | position  | salary |
      | Marie     | Curie     | SDET      | 10000  |
      | Rosaline  | Frankline | Developer | 15000  |
      | mahmut    | Davut     | QA        | 13000  |
      | Ali       | Guven     | BA        | 12000  |
