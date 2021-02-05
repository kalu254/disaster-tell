package com.kalu.models

data class User (
    val id : String,
    val f_name : String,
    val l_name : String,
    val email_address : String,
    val location : String,
    val phone_number : Int,
    val password : String,
)
data class Disaster(
    val disaster_id: String,
    val date_reported: String,
    val disaster_type: String,
    val disaster_description: String,
    val village: String,
    val disaster_img_url_one: String,
    val disaster_img_url_two: String,
    val disaster_img_url_three: String,
    val disaster_img_url_four: String,
)
