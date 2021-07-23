 
 Feature: Booking Hotel

  Scenario Outline: Verifying adactin by all selected fields
    Given  User is on Adactin page
    When User should enter "<user_name>" and "<password>" and click login button 
    And User should select all fields "<Location>","<Hotels>","<Room_Type>","<Number_of_Room>","<Check_In_Date>","<Check_Out_Date>","<Adults_per_Room>","<Children_per_Room>"
    Then User should navigate to booking conformation



 Examples: 
      | user_name | password  | Location | Hotels       | Room_Type | Number_of_Room | Check_In_Date | Check_Out_Date | Adults_per_Room | Children_per_Room |
      | Stephend  | Steve@123 | London   | Hotel Hervey | Double    | 2 - Two        | 25/07/2021    | 29/07/2021     | 2 - Two         | 2 - Two           |
      
  
