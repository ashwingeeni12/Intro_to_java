class Box{
  int length = 2;
  int height = 2;
  int width = 2;

  int BoxVol(){
    return length*width*height;
  }
  int BoxVol(int cuboid){
    cuboid = length = width = height;
    return cuboid*cuboid*cuboid; 
  }
  int BoxVol(int l, int h, int w){
    return l*h*w;
  }
}