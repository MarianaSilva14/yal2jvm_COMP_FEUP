/* Generated By:JJTree: Do not edit this line. ASTScalarElement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTScalarElement extends SimpleNode {
	private String name;
	
  public ASTScalarElement(int id) {
    super(id);
  }

  public ASTScalarElement(parserGrammar p, int id) {
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
    currentTable.putOnHashMap(new Symbol("ScalarElement",name));
    System.out.println("ScalarElement: ");
    System.out.println(currentTable);
    return true;
  }

}
/* JavaCC - OriginalChecksum=1889502b0ba78baadf48eb3c8b72daa7 (do not edit this line) */
