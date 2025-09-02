package DefaultMethodInterface;

public class DefaultExample implements DefaultExample1,DefaultExample2 {
    @Override
    public void defaultMethod() {
        DefaultExample1.super.defaultMethod();
    }
}
