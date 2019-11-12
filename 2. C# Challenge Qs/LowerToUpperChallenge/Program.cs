using System;

//Corbin Benally
//Interview exercise - IPro Sr. Software Development Engineer In Test (SDET)

namespace Program
{
    class Program
    {

        // Main Method 
        public static void Main(){
            //declaring user input as integer
            int userInput;

            //prompt user to enter character
            Console.WriteLine("This C# program receives the first alphabet character input and converts it into its uppercase equivalent.");
            Console.WriteLine("Enter one lowercase character: ");
            userInput = Console.Read();
            Console.WriteLine();

            //checks ascii decimal integer boundaries
            if (userInput >= 97 && userInput <= 122){
                userInput = userInput - 32;

                Console.WriteLine("Uppercase equivalent for entered character is: " + (char)userInput);
            }
            else{
                Console.WriteLine("Not a lowercase character!");
            }

            
        }
    }
}
