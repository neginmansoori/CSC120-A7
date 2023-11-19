Use this file to record your reflection on this assignment.

- Which methods did you decide to `overload`, and why?

I overloaded goToFloor function for library. This was done to reflect the presence of an elevator in the building, and to give the option of moving throughout the building with either foot or the elevator. I don't understand why the goToFloor function in the parent class allows for movement between floors without considering elevators. Doesn't this function in the parent class allow the subclasses to use it regardless of having/non having an elevator?
Additionally, I overloaded the house constructor to enable it to create a house object only given the address. Moreover, I overloaded the cafe constructor to avoid having to enter the whole inventory, and to construct a cafe object just given the name and address. Furthermore, I overloaded library contructor to create an object given name, address and whether it has an elevator, though I wonder overloading what other methods would be more helpful. 

- What worked, what didn't, what advice would you give someone taking this course in the future?
Initially, I was confused about overloading constructors and calling constructors within other constructors (as I was absent on the day they were discussed in class). I was able to develop a better understanding through running different examples in the main and going through the slides, but still require to go to office hours to make sure I fully understand.
Something else within the code that I had problems with checkOut(String title) in the library class. After adding titles, when trying to checkout a book, the program returns the exception that this book is not in our collection. I checked the spellings and the methods for both adding keys and changing its values but couldnt identify the problem.
