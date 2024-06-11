@US01

  Feature: US01 Should be able to register as a customer

    Scenario: TC01 It should be possible to register on the site as a customer with valid data
      Given go to Url
      When click on the Register link
      And enter a data in the Username input
      And enter a data in the Your Email address input
      And enter a data in the password input
      And select "I agree to the privacy policy" box
      And click to Sign Up box
      But wait 5 seconds
      Then verify that the homepage opens and the Sign Out link appears




