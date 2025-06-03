Feature: Verify the footer section of the website

@Footer01
  Scenario: Verify that all sections in the footer are visible
    Given the user is on the homepage
    When the user scrolls down to the footer section
    Then the user should see the following footer sections:
      | Contact Details     |
      | Product Links       |
      | Quick Links         |
      | Customer Care       |
      | Security Sale Offer |
      | Copyright           |
    And all footer links should be displayed correctly

@Footer02
  Scenario: Verify the contact details links
    Given the user clicks the email address in the Contact Details section
    Then the user should be redirected to the default email client

    When the user clicks the phone number in the Contact Details section
    Then a phone call alert should be triggered

@Footer03
  Scenario: Verify product link redirection
    Given the user clicks each link under the Product Links section
    Then the user should be redirected to the respective product pages

@Footer04
  Scenario: Verify quick links redirection
    Given the user clicks each link under the Quick Links section
    Then the user should be redirected to the respective pages

@Footer05
  Scenario: Verify customer care link redirection
    Given the user clicks each link under the Customer Care section
    Then the user should be redirected to the respective pages

@Footer06
  Scenario: Verify the Security Sale Offer link in the footer
    Given the user clicks the Security Sale Offer link
    Then the user should be redirected to the Security Sale page

@Footer07
  Scenario: Verify the Copyright section
    Given the user scrolls to the bottom of the footer
    Then the user should see the current year displayed in the copyright
    When the user clicks the "BlueDotSafes" link
    Then the user should be redirected to the homepage