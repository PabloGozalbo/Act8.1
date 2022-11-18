import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class GO {
    public Deque<Commands> commands;

    public GO(){
        commands = new LinkedList<Commands>();
    }

    public void addCommand(Commands command){
        commands.addLast(command);
    }

    public void eraseCommand(){
        commands.pollLast();
    }

    public void executeCommands(){
        while(!commands.isEmpty()){
            commands.pollFirst().move();
        }
    }
}
