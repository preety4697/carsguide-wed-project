Feature: Search functionality
  @author_MKT @regression
  Scenario Outline: Search the buy car with model
    Given  I am on homepage
    When   I mouse hover on “buy+sell” tab
    And    I click ‘Search Cars’ link
    Then   I navigate to ‘new and used car search’ page
    And    I select make '<make>'
    And    I select model '<model>'
    And    I select location '<location>'
    And    I select price '<price>'
    And    I click on Find My Next Car tab
    Then   I should see the make '<make>' in results
  Examples:
  |make          |model        |location               |price      |
  |Nissan        |180SX        |Any Location           |$50,000    |
  |BMW           |1 Series     |Any Location           |$2,000     |
  |Suzuki        |Baleno       |Any Location           |$35,000    |
  |Subaru        |Sambar       |Any Location           |$35,000    |
  |Cadillac      |Escalade     |Any Location           |$90,000    |
  |Hyundai       |Accent       |Any Location           |$7,500     |


  Scenario Outline: Search the used car with model
    Given  I am on homepage
    When   I mouse hover on “buy+sell” tab
    And    I click ‘Used’ link
    Then   I navigate to ‘Used Cars For Sale’ page
    And    I select make '<make>'
    And    I select model '<model>'
    And    I select location '<location>'
    And    I select price '<price>'
    And    I click on Find My Next Car tab
    Then   I should see the make '<make>' in results

    Examples:
      |make            |model        |location               |price            |
      |Isuzu           |Bellet       |Any Location           |$10,000          |
      |Kia             |Carnival     |Any Location           |$15,000          |
      |Volkswagen      |Golf         |Any Location           |$45,000          |
      |Volkswagen      |Golf         |Any Location           |$60,000          |
      |Mini            |Hatch        |Any Location           |$45,000          |
      |BMW             |M135i        |Any Location           |$90,000          |