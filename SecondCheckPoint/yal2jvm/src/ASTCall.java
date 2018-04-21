/* Generated By:JJTree: Do not edit this line. ASTCall.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTCall extends SimpleNode {
	private String name;
	private String nameId2;
	
  public ASTCall(int id) {
    super(id);
  }

  public ASTCall(parserGrammar p, int id) {
    super(p, id);
  }
  
  public String getName() {
	  return name;
  }
  
  public String getNameId2() {
	  return nameId2;
  }
  
  public void setName(String name) {
	  this.name = name;
  }
  
  public void setNameId2(String name) {
	  this.nameId2 = name;
  }
  
  public String toString() {
	  String test = super.toString();
			  
	if(name != null)
	  test+= " " + name;
	
	if(nameId2 != null)
	  test+= " " + nameId2;
	  
	  return test;
  }

  @Override
  public boolean analyse(SymbolsTable currentTable){
    currentTable.putOnHashMap(new Symbol("Call",name));
    System.out.println("Call: ");
    System.out.println(currentTable);

    analyseContent(currentTable);
    return true;
  }
  
  @Override
  public boolean analyseContent(SymbolsTable currentTable){
   
    for(int i=0; i < jjtGetNumChildren();i++){
      jjtGetChild(i).analyse(currentTable);
    }

    return true;
  }

}
/* JavaCC - OriginalChecksum=fe714bd707fec445bf7be522458e02bb (do not edit this line) */
