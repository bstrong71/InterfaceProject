public class Soldier extends FootSoldier implements Fighting, RangedCombat{

    public Soldier(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    public String speak() {
        return "Hooah!";
    }

    public String fight() {
        return "Fights like a soldier in the Army";
    }

    @Override
    public String attackAtDistance() {
        return "blew them up from 1500 yards";
    }
}
