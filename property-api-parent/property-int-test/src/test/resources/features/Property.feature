@permission
Feature: Property Features

  Scenario: Property value returns as Expected
    Given property "testName" and "testValue" exist
    When get property is called with "testName"
    Then "testValue" is returned

  @Wip
  Scenario: Property value updates  as Expected
    Given property "testName" and "testValue" exist
    When update property is called with "testName" and "testValue1"
    And get property is called with "testName"
    Then "testValue1" is returned

  @Wip
  Scenario: Property value deletes as Expected
    Given property "testName" and "testValue" exist
    When delete property is called with "testName"
    And get property is called with "testName"
    Then "no property found for testName" is returned

  @Wip
  Scenario: Property value creates as Expected
    Given property "testName" and "testValue" does not exist
    When create property is called with "testName" and "testValue"
    And get property is called with "testName"
    Then "testValue" is returned