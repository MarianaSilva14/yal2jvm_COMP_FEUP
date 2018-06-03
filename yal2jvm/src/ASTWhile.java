/* Generated By:JJTree: Do not edit this line. ASTWhile.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTWhile extends SimpleNode {

  public ASTWhile(int id) {
    super(id);
  }

  public ASTWhile(parserGrammar p, int id) {
    super(p, id);
  }

  @Override
  public int analyseContent(SymbolsTable currentTable){
    System.out.println("Analyse the children of While");
    int b=0;

    for(int i=0; i < jjtGetNumChildren();i++){
      if(jjtGetChild(i).analyse(currentTable)==-1)
        b=-1;
    }

    return b;
  }

  public String convertToByteCodes(MapVariables data){
    String line = "";

    String loopname="loop" + data.loopCounter;
    line += loopname +  ":\n";
    line += "\n";

    for(int i = 0; i < jjtGetNumChildren(); i++){
      line += jjtGetChild(i).convertToByteCodes(data);
    }

    line += "goto "+ loopname + "\n\n";
    line += loopname + "_end:\n";
    data.loopCounter++;
    line += "\n";
    return line;
  }

}
/* JavaCC - OriginalChecksum=98e9f9132d5f2dd8e8478e4f328518ba (do not edit this line) */