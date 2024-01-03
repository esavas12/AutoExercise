@api @allBrands
Feature: Get all brands


  Scenario Outline: Get all brands in the response body

    Given user gets all "<apiType>" api
    Then status code should be <statusCode>

    Examples:
      | apiType    | statusCode |
      | brandsList | 200        |
      | brandsList | 405        |