
package entites;
  public class student {
          private string _name;
          private int _age;
          private boolean _isFemale;
          
          public student()
          {
              _name="tina";
              _age=19;
              _isFemale=true;
          }
          public student(string name,int age, boolean isFemale)
          { _name = name;
            _age = age;
            _isFemale = isFemale;
          }
          public string tostring();
                  return -name + _age (_isFmale?"female":"male");
  

}
