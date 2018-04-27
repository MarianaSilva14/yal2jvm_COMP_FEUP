import java.util.HashMap;

public class MapVariables {

    public HashMap<String,Integer> variableByteCodes = new HashMap<String,Integer>();
    public int counter;

    public MapVariables(){
      counter = 0;
    }

    public void putOnHashMap(String variable){
        variableByteCodes.put(variable, counter);
        counter++;
    }

    public int returnByteCode(String variable){
        if(variableByteCodes.containsKey(variable))
            return variableByteCodes.get(variable);

        return -1;
    }

}
