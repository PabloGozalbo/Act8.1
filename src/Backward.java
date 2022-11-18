public class Backward implements Commands{
    private Beebot beebot;
    public Backward(Beebot beebot){
        this.beebot=beebot;
    }
    @Override
    public void move() {
        beebot.move("backwards");
    }
}
