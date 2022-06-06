class Box
{
    int width, height, length;
    Box(int w, int h, int l){
        width = w;
        height = h;
        length = l;
    }
    Box(){
        width = height = length = 1;
    }
    Box(int cuboid){
        width = height = length = cuboid;
    }
    double volume(){
        return width * height * length;
    }
}