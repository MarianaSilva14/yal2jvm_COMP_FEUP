/* Generated By:JJTree: Do not edit this line. ASTFunction.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTFunction extends SimpleNode {
  private String name;

  public ASTFunction(int id) {
    super(id);
  }

  public ASTFunction(parserGrammar p, int id) {
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
		boolean isScalar = jjtGetChild(0).isScalar();
		if(isScalar)
    	currentTable.putOnHashMap(new Symbol("Function",name,true));
		else
			currentTable.putOnHashMap(new Symbol("Function",name,false));

    System.out.println("Function: " + " name: " + name + " Tipo: " + isScalar);

    analyseContent(currentTable);
    return true;
  }

  @Override
  public boolean analyseContent(SymbolsTable currentTable){
		System.out.println("Analyse children of Function");

    SymbolsTable symbolsTable = new SymbolsTable(currentTable);

    for(int i=0; i < jjtGetNumChildren();i++){
      jjtGetChild(i).analyse(symbolsTable);
    }

    return true;
  }



  /** Accept the visitor. **/
  public Object jjtAccept(parserGrammarVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=421f3ada84af64c36108bae2638cc83c (do not edit this line) */
