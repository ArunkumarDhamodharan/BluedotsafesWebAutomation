Feature: Verify the footer section of the website

@Footer
Scenario: Comprehensive Footer Verification

  Given the user is on the homepage
  When the user scrolls down to the footer section
  Then the user should see the "Contact Details" section
  And the user should see the "Product Links" section
  And the user should see the "Quick Links" section
  And the user should see the "Customer Care" section
  And the user should see the "Copyright" section
  And all footer links should be displayed correctly

  When the user clicks the phone number in the Contact Details section
  Then a phone call alert should be triggered

  When the user clicks each link under the Product Links section
  Then the user should be redirected to the respective product pages

  When the user clicks each link under the Quick Links section
  Then the user should be redirected to the respective pages

  When the user clicks each link under the Customer Care section
  Then the user should be redirected to the respective pages

  When the user scrolls to the bottom of the footer
  Then the user should see the current year displayed in the copyright
  And the user clicks the "BlueDotSafes" link
  Then the user should be redirected to the homepage
  
  And the user click the top to scroll icon 
  Then the user should redirect to top of the page 