using System;

namespace PolymorphismSnippet
{
    class Program{
        static void Main(string[] args){
            Math MultiplierObject = new Math();

            //call identical named functions, however, recognizes their value types and does appropriate multiplication function
            Console.WriteLine("Multiplication of two integer numbers is: " + MultiplierObject.Multiply(13, 33));
            Console.WriteLine("Multiplication of two double numbers is: " + MultiplierObject.Multiply(3.14159, 47.33));
        }
    }
}
