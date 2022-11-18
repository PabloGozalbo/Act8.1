public class Forward implements Commands{
    private Beebot beebot;
    public Forward(Beebot beebot){
        this.beebot=beebot;
    }
    @Override
    public void move(){
        beebot.move("forward");
    }

}
