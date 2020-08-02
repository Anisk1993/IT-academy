//package HomeWork5.Car1.Car2;
//
//public class Car {
//
//    private Brand brand;
//    private Engine engine;
//    private int number;
//
//    public Car(int number, Brand brand, boolean EngineStarted) {
//        engine = new Engine(EngineStarted);
//        brand = new Brand(brand);
//        this.number = number;
//
//    }
//
//    public void showCar() {
//        brand.showBrandCar();
//        engine.engineStatus();
//        System.out.println(number);
//
//    }
//
//    public void engine(boolean EngineStart) {
//        System.out.println(String.format(" Двигатель %sзапушен ", EngineStart ? "" : "не "));
//    }
//
//
//    private class Brand {
//        public BrandCar nameCar;
//
//        public Brand(Brand name){
//            this.nameCar = name;
//        }
//
//        public void setBrandCar(BrandCar brand) {
//            this.nameCar = nameCar;
//        }
//
//        public void showBrandCar(){
//            System.out.println("Марка: " + brand.getName());
//        }
//
//    }
//
//    private class Engine {
//        public boolean EngineStart;
//
//        public Engine(boolean engineStart) {
//            this.EngineStart = engineStart;
//        }
//
//        public void engineStatus() {
//            System.out.println(String.format(" Двигатель %sзапушен ", EngineStart ? "" : "не "));
//        }
//
//    }
//
//
//}



