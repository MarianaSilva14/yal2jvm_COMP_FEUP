/* Generated By:JJTree: Do not edit this line. ASTArrayAccess.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTArrayAccess extends SimpleNode {
	private String name;

	
  public ASTArrayAccess(int id) {
    super(id);
  }

  public ASTArrayAccess(parserGrammar p, int id) {
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
    currentTable.putOnHashMap(new Symbol("ArrayAccess",name));
    System.out.println("ArrayAccess: ");
    System.out.println(currentTable);

    if(currentTable.containsHashMap(name)){
      return true;}

    System.out.println("This array doesn't exist! ");
    return false;

  }



}
/* JavaCC - OriginalChecksum=0240680d35f6578981079353ffaf52fb (do not edit this line) */
