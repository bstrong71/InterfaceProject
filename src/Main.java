public class Main {

    public static void main(String[] args) {

        Marine newMarine = new Marine("John Stryker", "sergeant", 12345);
        System.out.println("Name: " + newMarine.name + "  Rank: " + newMarine.rank + "  Serial No.: " + newMarine.serialNumber);
        System.out.println(newMarine.eat());
        System.out.println(newMarine.sleep());
        System.out.println(newMarine.walk());
        System.out.println(newMarine.speak());
        System.out.println(newMarine.fight());
        System.out.println(newMarine.attackAtDistance());
        System.out.println(newMarine.overpower());

    }
}
