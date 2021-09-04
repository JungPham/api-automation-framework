Feature: Users

  Background: Common step for scenario
    Given Setup base request specification

  Scenario: CU01 When getting public profile of a user, the information of user returns
    When User defines request with path parameter 'username' and value 'likis69883'
      And User sends valid GET request to get profile of a user
    Then Response status should be 200
      And Response should contain key 'username' with value 'likis69883'