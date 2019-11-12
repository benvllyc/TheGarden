using System;
using System.Collections.Generic;
using System.Text;

namespace PolymorphismSnippet
{
    class Math{

        public int Multiply(int num1, int num2){
            //does integer data type multiplication
            return (num1 * num2);
        }
        public double Multiply(double num1, double num2){
            //does double data type multiplication (floating point values)
            return (num1 * num2);
        }
    }
}
