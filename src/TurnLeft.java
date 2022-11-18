public class TurnLeft implements Commands{
    private Beebot beebot;
    public TurnLeft(Beebot beebot){
        this.beebot=beebot;
    }

    @Override
    public void move() {
        beebot.move("turning left");    }
}
