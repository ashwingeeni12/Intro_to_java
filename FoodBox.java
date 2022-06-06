class FoodBox extends Plastic{
  int diameter; 

  FoodBox(int d, int lbs_){
    super(lbs_);
    diameter = d; 
  }
  FoodBox(int d, int lbs_, int cube_){
    super(lbs_, cube_);
    diameter = d; 
  }
  FoodBox(int d, int lbs_, int len, int wid, int hei){
    super(lbs_, len, wid, hei);
    diameter = d; 
  }
  double FoodBoxVolume(){
    return (((width*height*length)/weight)*diameter); 
  }
}