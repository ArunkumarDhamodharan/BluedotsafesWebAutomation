Feature: Verify the header section navigation and search functionality 

@Header01
 Scenario: Website Loads Successfully

    Given User enters the URL in the browser
    When The homepage loads without errors
    Then The site logo and header section are displayed
   
@Header02
  Scenario: Verify Header Menu Navigation

    Given User is on the homepage

    When User clicks the site logo
    Then The homepage should reload

    When User clicks the phone number field
    Then The phone dialer box should open

    When User clicks the "Track Your Order" section
    Then User should be redirected to the "Track Your Product" page

    When User clicks the "My Account" menu
    Then The login submenu should be visible and redirect to sign in page 

    When User clicks the "My Account" icon
    Then The sign-in and register link should be visible and redirect to sign in and register page

    When User clicks the cart icon
    Then The cart mini dialog box should be displayed

    When User clicks a category menu and navigates through submenus
    Then Each link within the category and submenus should navigate to its respective page

    When User clicks header menu items and submenu pages
    Then Each link should navigate to its respective page
    
 
@Header03 
Scenario: Verify Complete Search Field Functionality

  Given I am on the home page
  When I see the search field
  Then The search field should be visible and editable

  When I select any product from the dropdown area
  Then The selected product should be visible in the search field
  When User clicks the search button after selecting the product from dropdown
  Then The user should be redirected to the respective product page

  When I search for a product using a valid product name
  Then I should see search results containing related products

  When I enter special characters in the search field
  Then I should see a "no results found" page

  When I enter numeric characters in the search field
  Then I should see a "no results found" page
    
  