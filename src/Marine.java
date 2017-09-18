public class Marine extends FootSoldier implements Fighting, RangedCombat{

    public Marine(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    public String speak() {
        return "Oohrah!";
    }

    public String fight() {
        return "Fights like a marine";
    }

    @Override
    public String overpower() {
        return "Wins many times, but sometimes doesn't";
    }

    @Override
    public String attackAtDistance() {
        return "got em from 500 yds";
    }
}
