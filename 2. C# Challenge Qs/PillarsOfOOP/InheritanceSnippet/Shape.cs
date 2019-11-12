using System;
using System.Collections.Generic;
using System.Text;

namespace InheritanceSnippet
{
    class Shape{
        public int width;
        public int height;

        public void SetWidth(int w){
            width = w;
        }

        public void SetHeight(int h){
            height = h;
        }
    }

    //extends from base class Shape
    //inherits from original super class
    class Rectangle:Shape{
        public int GetArea(){
            return width * height;
        }


    }
}
