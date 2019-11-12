using System;

namespace EncapsulationSnippet
{
    class Program
    {
        static void Main(string[] args)
        {
            
            Profile newUser = new Profile();

            Console.WriteLine("Accessing private date of birth via public method");
            Console.WriteLine(newUser.GetDOB());

            //variable string cannot change due to protection level
            //results in compiler error
            //newUser.dateOfBirth = "attempting to change private string value directly";

        }
    }
}
