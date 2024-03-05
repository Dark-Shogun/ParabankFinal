@UI @Run
  Feature: Add new user

    Scenario Outline: Add new user to website1
      Given User navigate to the website1 homepage
      When User click to the register button
      And User give <userName>
       Examples:
         |userName|
         |Deonisios|
         |Grivei|


