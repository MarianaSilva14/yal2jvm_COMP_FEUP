import java.util.HashMap;

public class MapVariables {

    public MapVariables parent;
    public HashMap<String,Integer> variableByteCodes = new HashMap<String,Integer>();
    public HashMap<String,String> functionReturn = new HashMap<String,String>();
    public int counter;

    public MapVariables(MapVariables parent){
      counter = 0;
      this.parent = parent;
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

    public void putOnHashMapFunctionReturn(String variable, String returnType){
        functionReturn.put(variable, returnType);
    }

    public String returnFunctionType(String variable){
        if(parent.functionReturn.containsKey(variable))
            return parent.functionReturn.get(variable);

        return "";
    }
}
