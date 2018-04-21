/* Generated By:JJTree: Do not edit this line. ASTDeclaration.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTDeclaration extends SimpleNode {
	private String name;
	private String nameInteger;


  public ASTDeclaration(int id) {
    super(id);
  }

  public ASTDeclaration(parserGrammar p, int id) {
    super(p, id);
  }
  
  public String getName() {
	  return name;
  }
  
  public String getNameInteger() {
	  return nameInteger;
  }
  
  public void setName(String name) {
	  this.name = name;
  }
  
  public void setNameInteger(String name) {
	  this.nameInteger = name;
  }
  
  public String toString() {
	  String test = super.toString();
			  
	if(name != null)
	  test+= " " + name;
	
	if(nameInteger != null)
	  test+= " " + nameInteger;
	  
	  return test;
  }

  public boolean analyse(SymbolsTable currentTable){
    currentTable.putOnHashMap(new Symbol("Declaration",name));
    System.out.println("Declaration");
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
/* JavaCC - OriginalChecksum=b5b37ba452e6c505558bbecb23b3ae06 (do not edit this line) */
