public class DemoNiñoBeeBot2 {
    public static void main(String[] args) {
        Beebot bicho = new Beebot();
        GO ejecutor = new GO();
        Commands delante = new Forward(bicho);
        Commands atras = new Backward(bicho);
        Commands izquierda = new TurnLeft(bicho);
        Commands derecha = new TurnRight(bicho);

        ejecutor.addCommand(delante);
        ejecutor.addCommand(atras);
        ejecutor.addCommand(izquierda);
        ejecutor.addCommand(derecha);
        ejecutor.addCommand(delante);

        ejecutor.eraseCommand();

        ejecutor.executeCommands();
    }
}
