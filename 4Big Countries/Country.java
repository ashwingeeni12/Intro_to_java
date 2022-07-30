// class Country{
//   public boolean is_big = false;
//   private String country1 = "";
//   public double pd = 0.0;
//   Country(String country, int population, double size){
//     is_big = false;
//     if(population > 250000000 || size > 3000000){
//       is_big = true;
//     }
//     country1 = country;
//     pd = population / size;
//   }
//   public String compare_pd(Country other){
//     if(this.pd == other.pd){
//       return this.country1 + " and " + other.country1 + " are the same size";
//     }
//     if(this.pd > other.pd){
//       return this.country1 + " is bigger than " + other.country1;
//     }
//     if(this.pd < other.pd){
//       return this.country1 + " is smaller than " + other.country1;
//     }
//     return "Error";
//   }
// }