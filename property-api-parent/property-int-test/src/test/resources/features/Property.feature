@property
Feature: Property Features

  Scenario: Property value returns as Expected
    Given I set up data in DB using "insertproperties.sql", and rollback test data at the end using "deleteproperties.sql"
    When get property is called with "nameFive"
    Then "valueFive" is returned

    @wip
  Scenario: Property value updates  as Expected
    Given I set up data in DB using "insertproperties.sql", and rollback test data at the end using "deleteproperties.sql"
    When update property is called with "nameFive" and "updatedValueFive"
    And get property is called with "nameFive"
    Then "updatedValueFive" is returned

      @wip
  Scenario: Property value deletes as Expected
    Given I set up data in DB using "insertproperties.sql", and rollback test data at the end using "deleteproperties.sql"
    When delete property is called with "nameFive"
    And get property is called with "nameFive"
    Then "no property found for testName" is returned

        @wip
  Scenario: Property value creates as Expected
    Given I set up data in DB using "insertproperties.sql", and rollback test data at the end using "deleteproperties.sql"
    When create property is called with "nameEleven" and "valueEleven"
    And get property is called with "nameEleven"
    Then "valueEleven" is returned
