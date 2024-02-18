public class Human extends Actor{
    public Human(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setMakeOrder(boolean MakeOrder) {
        isMakeOrder = MakeOrder;
    }

    @Override
    public void setTakeOrder(boolean TakeOrder) {
        isTakeOrder = TakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}
