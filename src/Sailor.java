public class Sailor extends FootSoldier implements Fighting, RangedCombat{

    public Sailor(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    public String speak() {
        return "Hooyah!";
    }

    public String fight() {
        return "Sinks their ship";
    }

    @Override
    public String attackAtDistance() {
        return "Destroyed target from 10 miles away";
    }
}
