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
    
    When User clicks the Save Up to 15% on Featured Safes! Shop Now link 
    Then User should be redirect to security sale page 

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
  Scenario: Verify Search Field Availability and Editability

    Given I am on the home page
    When I see the search field
    Then The search field should be visible and editable
 
@Header04
  Scenario: Verify Product Selection from Dropdown

    When I select any product from the dropdown area
    Then The selected product should be visible in the serach field 
    When User click the search button after select the dropdown 
    Then The user should redirect to respective product page
  
@Header05 
  Scenario: Verify Product Search with Valid Input

    When I search for a product using a valid product name
    Then I should see search results containing related products
 
@Header06  
  Scenario: Verify Search with Special Characters

    When I enter special characters in the search field
    Then I should see a "no results found" page
    
@Header07
  Scenario: Verify Search with Numeric Characters

    When I enter numeric characters in the search field
    Then I should see a "no results found" page	
    
  