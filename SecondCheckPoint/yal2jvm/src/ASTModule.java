/* Generated By:JJTree: Do not edit this line. ASTModule.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTModule extends SimpleNode {
  private String name;
	SymbolsTable symbolsTable;
  public ASTModule(int id) {
    super(id);
  }

  public ASTModule(parserGrammar p, int id) {
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

  public boolean analyse(SymbolsTable currentTable){
		System.out.println("Analyse of Module");

		symbolsTable = new SymbolsTable(currentTable);

    for(int i=0; i < jjtGetNumChildren();i++){
      jjtGetChild(i).analyse(symbolsTable);
    }

    for(int i=0; i < jjtGetNumChildren();i++){
      jjtGetChild(i).analyseContent(symbolsTable);
    }
    return true;
  }

  public void convertToByteCodes(MapVariables data){
    System.out.println(".class public " + name);
    System.out.println(".super java/lang/Object");
    System.out.println();

    for(int i = 0; i < jjtGetNumChildren(); i++){
      jjtGetChild(i).convertToByteCodes(data);
    }

    System.out.println();
    System.out.println(".met.method static public <clinit>()V");
    System.out.println(".limit stack 0");
    System.out.println(".limit locals 0");
    System.out.println("return");
    System.out.println(".end method");
  }

}
/* JavaCC - OriginalChecksum=642f3f3704f11600c98c0128057a09ad (do not edit this line) */