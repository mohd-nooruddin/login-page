# login-page
Working API's of basic login and registration page along with longin activity captured.

It has api's 
1. For Registering
  mapping - Post
  url - localhost:8095/user
  json data - {
    "fullName" : "Mohd Nooruddin",
    "email" : "mohd.nooruddin@example.com",
    "password" : "12345678"
}

2. Login User
   mapping - Get
   url - localhost:8095/login?username={email_id}&pass={your-password}
   note - Done forget to change email_id and your-password

Now Question Comes - Why is this ?
Answer - It will do give message message as per user login credentials and will record all the login attempts along with their specifice success of failure message into the database;
