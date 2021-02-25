@login
Feature: Users should be able to login

  // Background:
  //Given the user is on the login page
  //bu sekilde yazinca her sirada bunu tekrar tekrar yazmaya gerek yok. o kendisi hepsinde ilk siraya
  direk bunu yazacak
  //onemli olan senaryonun tamamiyle ayni olmasi lazim yoksa sikinti olur.
  @driver  @VYT-123
  Scenario: Login as a driver
    Given the user is on the login page
    When the user enters the driver information
    Then the user should be able to login

  @sales_manager     @VYT-123
  Scenario: Login as a sales manager
    Given the user is on the login page
    When the user enters the sales manager information
    Then the user should be able to login

  @store_manager   @smoke
  Scenario: Login as a store manager
    Given the user is on the login page
    When the user enters the store manager information
    Then the user should be able to login