package com.example.fetchdatafromwebtutorial

class Request(
    var result: String,
    var time_last_update_utc: String,
    var time_next_update_utc: String,
    var base_code: String,
    var rates: Currency
)