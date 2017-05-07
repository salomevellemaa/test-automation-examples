Feature: Test basic functionality

  Scenario: EnButtonTest
    Given I wait for the "buttonTest" button to appear
    And I press enButton
    Then I should see "This will end the activity"
    And I press NO button

  Scenario: PopupTest
    Given I wait for the "buttonTest" button to appear
    And I press "Display Popup Window"
    Then I should see "Dismiss"
    And I press "Dismiss"

  Scenario: UnhandledExceptionTest
    Given I wait for the "buttonTest" button to appear
    And I press "Press to throw unhandled exception"
    Then I should see "Ava rakendus uuesti"
    And i press "Ava rakendus uuesti"

  Scenario: CheckElementsOnHomeScreenTest
    Given I wait for the "buttonTest" button to appear
    Then I should see "Show Progress Bar for a while"
    Then I should see "Display text view"
    Then I should see "Display Popup Window"
    Then I should see "Press to throw unhandled exception"
    Then I should see "Display and focus on layout"
    Then I should see "Touch actions"

  Scenario: RegisterUserTest
    Given I wait for the "Show Progress Bar for a while" button to appear
    When I press "Show Progress Bar for a while"
    Then I should see "Waiting Dialog"
    Then I wait for the "Welcome to register a new User" view to appear
    Then I should see "Welcome to register a new User"
    Then I fill username
    Then I fill email
    Then I fill password
    Then I fill name
    And I scroll down
    And I press "Ruby"
    And I press "Java"
    And I scroll down
    Then I press "I accept adds"
    Then I press "Register User (verify)"
    Then I press "Register User"

  Scenario:GesturesTest
    When I press "Touch Actions"
    Then I should see "LAST GESTURE:"
    Then I press "Scale Factor: 1.0"
    Then I should see "SINGLE TAP CONFIRMED"




