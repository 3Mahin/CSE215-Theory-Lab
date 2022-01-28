package Final;

class Demo{
      public static void main(String args[]){
          IVehicle oldCar = new Car();
          oldCar.tuneUpCost();
          ((Car) oldCar).builtBefore(1990);
      }
}