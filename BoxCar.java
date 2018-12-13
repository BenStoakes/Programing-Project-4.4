/**
 * @(#)BoxCar.java
 * @author 
 * @version 1.00 2018/12/11
 */

public class BoxCar
{
    public void BoxCarMethod(int dieOne,int dieTwo)
  {
   int boxCarTrue = 0;
   int OneSix = 0;
   int TwoSix = 0;
   	
   	//===================
   if(dieOne == 6)
   {
   		OneSix = 1;
   }
   //------------------------
   if(dieTwo == 6)
   {
   		TwoSix = 1;
   }
   //-------------------------
   if(OneSix == TwoSix)
   {  
   		boxCarTrue = 1;
   }
 }
}
