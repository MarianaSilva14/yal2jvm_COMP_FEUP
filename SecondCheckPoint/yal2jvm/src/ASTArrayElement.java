/* Generated By:JJTree: Do not edit this line. ASTArrayElement.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTArrayElement extends SimpleNode {
  private String name;


    public ASTArrayElement(int id) {
      super(id);
    }

    public ASTArrayElement(parserGrammar p, int id) {
      super(p, id);
    }

    public String getName() {
  	  return name;
    }

    public void setName(String name) {
  	  this.name = name;
    }

    public String toString() {
  	  String test;

  	  test = super.toString() + " " + name;

  	  return test;
    }

    @Override
    public boolean analyse(SymbolsTable currentTable){
      currentTable.putOnHashMap(new Symbol("ArrayElement",name,false));
      System.out.println("ArrayElement pos na hashmap");
      return true;
    }

    public String convertToByteCodes(MapVariables data){
      String line = "";
      if(jjtGetParent().getId() == parserGrammarTreeConstants.JJTVARLIST)
        data.putOnHashMap(name);
      return line;
    }
}
/* JavaCC - OriginalChecksum=1663891d558e991061819f836a041373 (do not edit this line) */
