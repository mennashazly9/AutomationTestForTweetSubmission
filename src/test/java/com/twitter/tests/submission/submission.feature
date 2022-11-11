Feature: submissions

  Scenario Outline: check that max number of characters in a tweet is 280
    When click on username field in login overlay
    And enter user name "<userName>" in username field in login overlay
    And click on next button in login overlay
    And enter password "<password>" in password field in enter your password overlay
    And click on login button in enter your password overlay
    And click on tweet button in home page
    And enter a tweet "<tweet>" with 281 character in tweet overlay
    Then tweet button in tweet overlay should be dimmed
    And counter of characters in tweet overlay should be "<negativeCounter>"

    Examples:
      | userName     | password  | tweet                                                                                                                                                                                                                                                                                     | negativeCounter |
      | test13183867 | Test@2022 | Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat mass | -1              |

  @Delete-TWEET
  Scenario Outline: check that user can't post same tweet twice in a row
    When click on username field in login overlay
    When enter user name "<userName>" in username field in login overlay
    And click on next button in login overlay
    And enter password "<password>" in password field in enter your password overlay
    And click on login button in enter your password overlay
    And click on tweet button in home page
    And enter a tweet "<tweet>" in tweet overlay
    And click on tweet button in tweet overlay
    And click on tweet button in home page
    And enter a tweet "<tweet>" in tweet overlay
    And click on tweet button in tweet overlay
    Then error message in tweet overlay should be "<errorMessage>"

    Examples:
      | userName     | password  | tweet                                                     | errorMessage                   |
      | test13183867 | Test@2022 | Lorem ipsum dolor sit amet, consectetuer adipiscing elit. | Whoops! You already said that. |

  Scenario Outline: check that user can't post a gif and image in the same tweet
    When enter user name "<userName>" in username field in login overlay
    And click on next button in login overlay
    And enter password "<password>" in password field in enter your password overlay
    And click on login button in enter your password overlay
    And click on tweet button in home page
    And click on gif icon in tweet overlay
    And click on agree gifs in gif category
    And click on first gif in dance gif category
    Then media icon in tweet overlay should be dimmed

    Examples:
      | userName     | password  |
      | test13183867 | Test@2022 |
