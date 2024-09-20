public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartPhoneCharger smartPhoneCharger = new SmartPhoneCharger();


        PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
        PowerOutlet smartPhoneAdapter = new SmartPhoneAdapter(smartPhoneCharger);

        laptopAdapter.plugin();
        refrigeratorAdapter.plugin();
        smartPhoneAdapter.plugin();

    }
}