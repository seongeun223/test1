package member.model.vo;

public class Gold extends Member implements Buyable{

    public Gold(String name, String grade, int point) {
        super(name, grade, point);
    }

    @Override
    public double calculateInterest() {
        double point = (getPoint() * 0.05);
        return point;
    }

    @Override
    public int buy(int price) {
        double sale = price * 0.05;
        return (int) (price - sale);
    }
}
