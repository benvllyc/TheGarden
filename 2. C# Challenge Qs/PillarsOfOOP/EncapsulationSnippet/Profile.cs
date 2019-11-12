using System;
using System.Collections.Generic;
using System.Text;

namespace EncapsulationSnippet
{
    public class Profile{
        private string dateOfBirth;

        public string GetDOB(){
            dateOfBirth = "01/01/1947";
            return dateOfBirth;
        }
    }
}
