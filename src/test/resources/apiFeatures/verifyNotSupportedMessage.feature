Feature: Post all products list

  @api @postResponse
  Scenario Outline: Verify response code message is not supported

    Given user "<postType>" to all "<apiType>"
    Given user "<postType>" to all "<apiType>"

    Examples:
      | postType | apiType      |
      | puts     | productsList |