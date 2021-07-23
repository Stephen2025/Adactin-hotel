Feature: Search hotel

  Scenario Outline: Verfifying adactin by all fields
    Given  User is on Adactin page
    When User should enter "<user_name>" and "<password>" and click login button 
    And User Should enter all fields "<Location>","<Hotels>","<Room_Type>","<Number_of_Room>","<Check_In_Date>","<Check_Out_Date>","<Adults_per_Room>","<Children_per_Room>"
    Then User Should navigate Select hotel
  
    
 Scenario Outline: Verifying adactin by all manditaroy field 
    Given  User is on Adactin page
    When User should enter "<user_name>" and "<password>" and click login button 
    And User Should Select all manditaroy filed"<Location>","<Hotels>","<Room_Type>","<Number_of_Room>","<Check_In_Date>","<Check_Out_Date>","<Adults_per_Room>","<Children_per_Room>"
    Then User Should navigate Select hotel
    
 Scenario Outline: Verifying adactin with date
    Given  User is on Adactin page
    When User should enter "<user_name>" and "<password>" and click login button 
    And User should select checkin and checkout date field"<Location>","<Hotels>","<Room_Type>","<Number_of_Room>","<Check_In_Date>","<Check_Out_Date>","<Adults_per_Room>","<Children_per_Room>"
    Then User Should navigate Select hotel
    
  Scenario Outline: Verifying adactin wihtout any field
    Given  User is on Adactin page
    When User should enter "<user_name>" and "<password>" and click login button 
    And User should not select field "<Location>","<Hotels>","<Room_Type>","<Number_of_Room>","<Check_In_Date>","<Check_Out_Date>","<Adults_per_Room>","<Children_per_Room>"
    Then User Should Click serach button
    
    
    
    
 Feature: Booking Hotel

  Scenario Outline: Verifying adactin by all selected fields
    Given  User is on Adactin page
    When User should enter "<user_name>" and "<password>" and click login button 
    And User should select all fields "<Location>","<Hotels>","<Room_Type>","<Number_of_Room>","<Check_In_Date>","<Check_Out_Date>","<Adults_per_Room>","<Children_per_Room>"
    Then User should navigate to booking conformation

Scenario Outline: Verifying adactin without any field select
    Given  User is on Adactin page
    When User should enter "<user_name>" and "<password>" and click login button 
    And User should navigate to booking confrimation pgae  "<Location>","<Hotels>","<Room_Type>","<Number_of_Room>","<Check_In_Date>","<Check_Out_Date>","<Adults_per_Room>","<Children_per_Room>"
    Then User should not enter any field and click Book Now




Feature: Cancel Booking

  Scenario Outline: cancel booking
    Given  User is on Adactin page
    When User should enter "<user_name>" and "<password>" and click login button 
    And User should book the hotel "<Location>","<Hotels>","<Room_Type>","<Number_of_Room>","<Check_In_Date>","<Check_Out_Date>","<Adults_per_Room>","<Children_per_Room>"
    Then User should cancel the booked hotel
    
    
   Scenario Outline:  existing booked Id  cancel
    Given  User is on Adactin page
    When User should enter "<user_name>" and "<password>" and click login button 
    And User should navigate to booking confrimation page and select already booking option "<Location>","<Hotels>","<Room_Type>","<Number_of_Room>","<Check_In_Date>","<Check_Out_Date>","<Adults_per_Room>","<Children_per_Room>"
    Then User should cancel existing  booked hotel 
    
    
    
    
  
  Examples: 
      | user_name | password  | Location | Hotels       | Room_Type | Number_of_Room | Check_In_Date | Check_Out_Date | Adults_per_Room | Children_per_Room |
      | Stephend  | Steve@123 | London   | Hotel Hervey | Double    | 2 - Two        | 25/07/2021    | 29/07/2021     | 2 - Two         | 2 - Two           |
      
     