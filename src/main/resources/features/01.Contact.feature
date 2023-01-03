Feature: form contact

  Scenario: tcc01 form contact
    When User berada di web Juara Coding
    And User click menu contact
    And User input nama lengkap
    And User input email
    And User input mobile phone
    And User input Subject
    And User input Message
    And User click send
    Then Pesan berhasil di kirim

  Scenario: tcc02 form contact
    When tc02 User input email
    And tc02 User input mobile phone
    And tc02 User input Subject
    And tc02 User input Message
    And tc02 User click send
    Then Pesan gagal di kirim

  Scenario: tcc03 form contact
    When tcc03 User input nama lengkap
    And tcc03 User Kosongkan email
    And tcc03 User click send
    Then tcc03 Pesan gagal di kirim

  Scenario: tcc04 form contact
    When tcc04 User input email
    And tcc04 Kosongkan mobile phone
    And tcc04 User click send
    Then tcc04 Pesan gagal di kirim

  Scenario: tcc05 form contact
    When tcc05 User input mobile phone
    And tcc05 User Kosongkan Subject
    And tcc05 User click send
    Then tcc05 Pesan gagal di kirim

  Scenario: tcc06 form contact
    When tcc06 User input Subject
    And tcc06 User Kosongkan Message
    And tcc06 User click send
    Then tcc06 Pesan gagal di kirim

  Scenario: tcc07 form contact invalid email
    When tcc07 User input nama lengkap
    And tcc07 User input email
    And tcc07 User input mobile phone
    And tcc07 User input Subject
    And tcc07 User input Message
    And tcc07 User click send
    Then tcc07 Pesan gagal di kirim

  Scenario: tcc08 form contact invalid phone number
    When tcc08 User input nama lengkap
    And tcc08 User input email
    And tcc08 User input mobile phone
    And tcc08 User input Subject
    And tcc08 User input Message
    And tcc08 User click send
    Then tcc08 Pesan gagal di kirim