public class Symbol{

    public String symbolType;
    public String symbolName;

    public Symbol(String symbolType, String symbolName){
        this.symbolType=symbolType;
        this.symbolName=symbolName;
    }

    public String getSymbolType(){
        return symbolType;
    }

    public String getSymbolName(){
        return symbolName;
    }
}