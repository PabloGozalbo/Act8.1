import java.util.LinkedList;
import java.util.Queue;

public class GO {
    public Queue<Commands> commands;

    public GO(){
        commands = new LinkedList<>();
    }

    public void addCommand(Commands command){
        commands.add(command);
    }

    public void executeCommands(){
        while(!commands.isEmpty()){
            commands.poll().move();
        }
    }
}
