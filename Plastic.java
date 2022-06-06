class Plastic extends Box{
  int weight;  
  Plastic() { 
    System.out.println("Constructor called"); 
  }
  Plastic(int lbs){
    super();
    weight = lbs; 
  }
  Plastic(int lbs, int cube){
    super(cube);
    weight = lbs;   
  }
  Plastic(int lbs, int le, int wi, int he){
    super(wi, he, le); 
    weight = lbs; 
  }
  double PlasticVolume(){
    return ((width*height*length)/weight); 
  }
}