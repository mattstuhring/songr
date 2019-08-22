# Lab 11: Building Full-Stack Web Apps

## Feature Tasks
- Ensure that you can run the Spring app.
- Create a hello world route at /hello, and ensure that you can visit that route in your browser and see a rendered template come back.
- Create a route that turns words into UPPER CASE. For instance, I should be able to visit /capitalize/hello and get back an HTML page containing the response HELLO, or I could visit /capitalize/this is Kinda Capitalized and get an HTML page containing the response THIS IS KINDA CAPITALIZED.
- Create a route that reverses the order of the words in a query parameter. For example, if I visit /reverse?sentence=Hello world, it should return an HTML page containing world Hello.
Write a unit test for the word reversing functionality of the above route. (Note that this will be easiest if you write a helper method for the word reversing, so that you can call that method for testing.)

## Run the app
1. Navigate to project in the terminal
2. ``` $ gradle bootRun ```
3. Open browser and navigate to http://localhost:8080

## Routes
- /hello
- /capitalize/{user input here...}
- /reverse
- /reverse/?words={user input goes here...}

# Resources
- Jane Hur
