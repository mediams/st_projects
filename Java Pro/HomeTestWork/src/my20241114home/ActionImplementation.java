package my20241114home;

public class ActionImplementation implements Action{
    @Override
    public void perform() {
        System.out.println("Action performed!");
    }

    @Override
    public void perform(String message) {

    }
}