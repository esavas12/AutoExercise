Feature: Get all products list

  @api @allProducts
  Scenario Outline: Get all products list in the response body
    Given user gets all "<apiType>" api
    Then status code should be <statusCode>

    Examples:
      | apiType      | statusCode |
      | productsList | 200        |
