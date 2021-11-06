
package ass_3_1;

public class Ball implements Tossable{
    String brandName;
    public void Ball(String brandName) {
        this.brandName = brandName;
    }
    public String getBrandName() {
        return brandName;
    }
    public void bounnce(){}

    @Override
    public void toss() {}
    
}
