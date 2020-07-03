# giovannyg32@gmail.com -> Demoblaze automation
# Author: Giovanni Gómez Restrepo

Feature: Demoblaze product store
  As a user i want to buy a a new laptop
  categories Dell i7

  Scenario: Buying a new laptop in demoblaze
    Given User is in the main page
    When User choose categories laptops
    And User chooses a new laptop mark Dell
    Then User validates if is selectioned mark
    And User adds to cart the new laptop

