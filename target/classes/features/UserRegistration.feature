Feature: Registration for gaming

  @registration
  Scenario: Register for online gaming as a new player
    When Navigation and registration of a new player at moneygaming.com
    Then Validate message with the text "This field is required" is Displayed under DOB