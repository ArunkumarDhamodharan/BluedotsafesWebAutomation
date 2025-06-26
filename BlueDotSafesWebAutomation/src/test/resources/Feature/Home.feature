Feature: Verify the Home Page Functionalities

@Home01
  Scenario: Verify the banner section functionality
    Given the user is on the homepage
    When the user views the banner section
    And the user slides through each banner image one by one
    And each banner displays a corresponding navigation link
    And the user clicks the button on each banner
    Then the user should be redirected to the correct page for each banner link

  Scenario: Verify the company features and major products section
    Given the user is on the homepage
    When the user views the "Company Features" section with four distinct features
    And the user sees the "Major Products" section
    And the user clicks on each product link in the "Major Products" section
    Then each product link should redirect to its respective product page

  Scenario: Verify the Depository Safes section
    Given the user is on the homepage
    When the user scrolls to "Depository Safes" section
    And the user sees product name, price, add to cart button, product image, and "Made in USA" label
    And the user clicks on each product in the "Depository Safes" section
    Then each product should navigate to its respective page with matching product details
    And the user should see the "Mission" section content below the depository safes section

  Scenario: Verify the Deals section functionality
    Given the user is on the homepage
    When the user scrolls to the "Deals" section
    And the user views the product name, actual price, offer price, offer percentage, add to cart button, buy now button, and "Made in USA" label
    And the user clicks on each product in "Deals" section
    Then each product should navigate to its respective page with correct deal details
    And the user should see the "Trusted" and "Company Features" sections below

  Scenario: Verify Popular Search, Top Rated, and Featured Products sections
    Given the user is on the homepage
    When the user clicks on each keyword in the "Popular Search" section
    Then each keyword should navigate to the relevant search results page
    When the user views the "Top Rated Products" section
    And clicks on each top-rated product
    Then each product should redirect to its detailed product page
    When the user views the "Featured Products" section
    And clicks on each featured product
    Then each product should redirect to its detailed product page
