import java.util.HashMap;

public class SymbolsTable {

    public HashMap<String,Symbol> symbolsTable = new HashMap<String,Symbol>();
    public SymbolsTable parentTable;

    public SymbolsTable(SymbolsTable parentTable){
        this.parentTable=parentTable;
    }

    public void putOnHashMap(Symbol symbol){
        symbolsTable.put(symbol.getSymbolName(), symbol);
    }

    public Symbol returnSymbol(String symbolName){
        if(symbolsTable.containsKey(symbolName))
            return symbolsTable.get(symbolName);
        else if(parentTable != null){
            return parentTable.returnSymbol(symbolName);
        }
        return null;
    }
}
