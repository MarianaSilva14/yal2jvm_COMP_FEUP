/* Generated By:JJTree: Do not edit this line. ASTArgumentList.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTArgumentList extends SimpleNode {
  public ASTArgumentList(int id) {
    super(id);
  }

  public ASTArgumentList(parserGrammar p, int id) {
    super(p, id);
  }

  @Override
  public boolean analyseContent(SymbolsTable currentTable){
    System.out.println("Analyse children of ArgumentList");


    for(int i=0; i < jjtGetNumChildren();i++){
      jjtGetChild(i).analyse(currentTable);
    }

    return true;
  }
}
/* JavaCC - OriginalChecksum=65f9f6dc936f457252451f98383ad1aa (do not edit this line) */