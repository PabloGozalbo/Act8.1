public class TurnRight implements Commands{
    private Beebot beebot;
    public TurnRight(Beebot beebot){
        this.beebot=beebot;
    }

    @Override
    public void move() {
        beebot.move("turning right");    }
}
