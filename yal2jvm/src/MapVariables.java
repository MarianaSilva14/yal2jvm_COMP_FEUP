import java.util.HashMap;
import java.util.ArrayList;

public class MapVariables {

    public MapVariables parent;
    public HashMap<String,Integer> variableByteCodes = new HashMap<String,Integer>();
    public HashMap<String,String> functionReturn = new HashMap<String,String>();
    public ArrayList<Symbol> globalVariables  = new ArrayList<Symbol>();
    public int counter;
    public int loopCounter=0;

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

    public ArrayList<Symbol> getGlobalVariables(){
        return globalVariables;
    }

    public void putOnGlobalVariables(Symbol symbol){
        globalVariables.add(symbol);
    }

    public boolean existsGlobalVariable(String variableName){
        for(int i = 0; i  < parent.globalVariables.size();i++){
            if(parent.globalVariables.get(i).getSymbolName().equals(variableName))
                return true;
        }
        return false;
    }

    public boolean getGlobalVariableIsScalar(String variableName){
        for(int i = 0; i  < parent.globalVariables.size();i++){
            if(parent.globalVariables.get(i).getSymbolName().equals(variableName))
                return parent.globalVariables.get(i).isScalar();
        }
        return true;
    }

    public void putOnHashMapFunctionReturn(String variable, String returnType){
        functionReturn.put(variable, returnType);
    }

    public String returnFunctionType(String variable){
        if(parent.functionReturn.containsKey(variable))
            return parent.functionReturn.get(variable);

        return "";
    }

    public int getLoopCounter(){
        return loopCounter;
    }

}
