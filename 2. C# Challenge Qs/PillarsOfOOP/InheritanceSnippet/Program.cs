using System;

namespace InheritanceSnippet
{
    class Program
    {
        static void Main(string[] args){
            //sub class of Shape, declaring new rectangle
            Rectangle parallelogram = new Rectangle();

            //accessing sub class function
            parallelogram.SetWidth(33);
            parallelogram.SetHeight(47);
            
            //returning sub class function
            Console.WriteLine("Area of parallelogram is: " + parallelogram.GetArea());
        }
    }
}
