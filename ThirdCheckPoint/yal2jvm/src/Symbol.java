public class Symbol{

    public String symbolType;
    public String symbolName;
    public Boolean isScalar;

    public Symbol(String symbolType, String symbolName, Boolean isScalar){
        this.symbolType=symbolType;
        this.symbolName=symbolName;
        this.isScalar=isScalar;
    }

    public String getSymbolType(){
        return symbolType;
    }

    public String getSymbolName(){
        return symbolName;
    }

    public Boolean isScalar(){
      return isScalar;
    }
}
