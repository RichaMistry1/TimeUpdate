
# Database Connection
- spring.datasource.url=jdbc:mysql://localhost:3306/{YourDatabase name}
- spring.datasource.driver-class-name= com.mysql.cj.jdbc.Driver
- spring.datasource.username= {Connection user name}

- spring.datasource.password= {Connection password}

- spring.jpa.hibernate.ddl-auto=update

- spring.jpa.show-sql= true


# API's Working
- port number= 8080
- API hitting URL: localhost:8080/{API}
   ###    Get Data
- Get User Data API: localhost:8080/finduser/{id} where id is User ID
- This is used to get the data of user

  ###     Update Shift Start Time
- Update Start Shift Time: localhost:8080/updatestarttime 
- This API updates the Start Time for the shift

  ###     Update Shift End Time
- Update End Shift TIme: localhost:8080/updateendtime
- This API updates the End Time for the shift

  ###    Update Break Start Time
- Update End Shift TIme: localhost:8080/updatebreakstart
- This API updates the Start Time for the break

  ###    Update Break End Time
- Update End Shift TIme: localhost:8080/updatebreakend
- This API updates the End Time for the break

  ###    Update Lunch Start Time
- Update End Shift TIme: localhost:8080/updatelunchstart
- This API updates the Start Time for the Lunch

  ###    Update Lunch End Time
- Update End Shift TIme: localhost:8080/updatelunchend
- This API updates the End Time for the Lunch

  ###    Save User
- Update End Shift TIme: localhost:8080/saveuser
- This API saves the user data in the database