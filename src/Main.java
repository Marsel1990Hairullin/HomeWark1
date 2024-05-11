public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);

        var liftingCapacity = 50;
        var stuffWeight =20;
        var capacityleft = liftingCapacity - stuffWeight;
        System.out.println("Еще можно положить" + capacityleft + " кг вещей ");

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cocumbersWeight = 2;
        var pepersWeight = 2;
        var zucchiniWeight = 2;
        var vegetablesWeight = tomatoesWeight = cocumbersWeight = zucchiniWeight;
        var friesWeight = pepersWeight = zucchiniWeight;
        var fruitWeight = tomatoesWeight = vegetablesWeight;
        var productsWeight = fruitWeight + vegetablesWeight + meatWeight + waterWeight;
        System.out.println("Общий вес продуктов " + productsWeight + "кг !");

        var leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Место осталось " + leftWeight + " кг ! ");

        productsWeight = productsWeight * 2;
        System.out.println("Теперь все продукты" + productsWeight);

        leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println(" Теперь место осталось " + leftWeight + "кг !");

        var overload = (stuffWeight + productsWeight) % liftingCapacity;
        System.out.println("Перегруз на" + overload + " кг!");

        var productsInOneCar = productsWeight / 2;
        System.out.println("Продуктов в одой машине теперь" + productsInOneCar);





    }
}