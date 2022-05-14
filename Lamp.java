class Lamp{
  static boolean isOn;
  static void turnOn(){
    isOn = true;
    System.out.println("Lamp is on.");
  }
  static void turnOff(){
    isOn = false;
    System.out.println("Lamp is off.");
  }
}