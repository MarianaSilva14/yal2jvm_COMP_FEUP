/* Generated By:JJTree: Do not edit this line. ASTCall.java Version 6.0 */
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
  public int analyse(SymbolsTable currentTable){
    if(name != null && nameId2 != null)
      return 0;

    System.out.println("Call: The function doesn't call io and I'll go trough children");
    return analyseContent(currentTable);
  }

  @Override
  public int analyseContent(SymbolsTable currentTable){
    System.out.println("Analyse children of Call");
    int b = 0;

    for(int i=0; i < jjtGetNumChildren();i++){
      if(jjtGetChild(i).analyseContent(currentTable)==-1)
        b= -1;
    }

    return b;
  }

  public int analyseRhs(SymbolsTable currentTable){
    System.out.println("Analyse the right part of Call");

    analyseContent(currentTable);

    if(name.equals("io"))
      return 1;

    if(nameId2 != null){
      return 0;
    }
    else{
      Symbol symbol = currentTable.returnSymbol(name);
      if(symbol != null){
        if(symbol.isScalar())
          return 1;
        else
          return 0;
      }
    }
    return 0;
  }


  public String convertToByteCodes(MapVariables mapVariables){
    String line = "";
    String call = "";

    for(int i = 0; i < jjtGetNumChildren(); i++){
        line += jjtGetChild(i).convertToByteCodes(mapVariables);
    }

    if(nameId2 == null){
      SimpleNode node = (SimpleNode)this;
      while(node.jjtGetParent() != null) {
        node = (SimpleNode)node.jjtGetParent();
      }
      call += "invokestatic "+ node.getName() + "/" + name + "(";
      for(int i = 0; i < jjtGetNumChildren(); i++){
        call += jjtGetChild(i).checkArgumentsType();
      }
      call += ")";
      call += mapVariables.returnFunctionType(name);
    }
    else {
      call += "invokestatic "+ name + "/" + nameId2 + "(";
      for(int i = 0; i < jjtGetNumChildren(); i++){
        call += jjtGetChild(i).checkArgumentsType();
      }
      call += ")";

    }

    Node node=this;
    boolean value= false;
    while(node.getId() != parserGrammarTreeConstants.JJTFUNCTION){
      if(node.getId()== parserGrammarTreeConstants.JJTASSIGN){
        value=true;
        break;
      }
      node=node.jjtGetParent();
    }

    if(!value){
      call+="V";
    }
    else{
      if(node.jjtGetChild(0).jjtGetChild(0).getId()==parserGrammarTreeConstants.JJTARRAYACCESS)
        call+="I";
      else{
        ASTScalarAccess scalarAccess = (ASTScalarAccess) node.jjtGetChild(0).jjtGetChild(0);
        if(scalarAccess.isScalar())
          call+="I";
        else
          call+="[I";

      }  
        
    }

    line += call;
    line += "\n\n";

    return line;
  }

}
/* JavaCC - OriginalChecksum=5426cbd81caaa60f1af1e93f4db8172e (do not edit this line) */
