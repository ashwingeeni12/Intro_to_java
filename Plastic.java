class Plastic extends Box{
  int weight; 
  String color = "transparent"; 

  Plastic(){
    super();
    weight = 3; 
  }
  Plastic(int lbs, int cube){
    super(cube);
    weight = lbs;   
  }
  Plastic(int lbs, int le, int wi, int he){
    super(wi, he, le); 
    weight = lbs; 
  }
}