
package ass_3_2;

public class Mammal implements animal{

    public String NoOfLegs;

    public String FavFood;

    public Mammal(String NoOfLegs, String FavFood) {
        this.NoOfLegs = NoOfLegs;
        this.FavFood = FavFood;
    }

    public String getFavFood() {
        return FavFood;
    }

    public String getNoOfLegs() {
        return NoOfLegs;
    }

    @Override
    public void eat() {}

    @Override
    public void travel() {}
    
}
