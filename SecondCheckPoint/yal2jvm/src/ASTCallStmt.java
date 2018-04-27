/* Generated By:JJTree: Do not edit this line. ASTCallStmt.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
import java.util.ArrayList;

public
class ASTCallStmt extends SimpleNode {
  private String name;
  	private String nameId2;

    public ASTCallStmt(int id) {
      super(id);
    }

    public ASTCallStmt(parserGrammar p, int id) {
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
  		if(name.equals("io"))
  			return true;

  		System.out.println("Call: The function doesn't call io and I'll go trough children");


      if(currentTable.returnSymbol(name) != null){
        analyseContent(currentTable);

  			System.out.println("This function exists: CallStmt");
        return true;
      }

      System.out.println("This function doesn't exist! " + name);
      return false;
    }

    @Override
    public boolean analyseContent(SymbolsTable currentTable){
  		System.out.println("Analyse children of CallStmt");

      for(int i=0; i < jjtGetNumChildren();i++){
        jjtGetChild(i).analyse(currentTable);
      }

      return true;
    }

    public String convertToByteCodes(MapVariables mapVariables){
      String line = "";
      String call = "";
      for(int i = 0; i < jjtGetNumChildren(); i++){
          jjtGetChild(i).convertToByteCodes(mapVariables);
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

      }
      else {
        call += "invokestatic "+ name + "/" + nameId2 + "(";
        if(name.equals("io")) {
          if(nameId2.equals("println"))
            call += "I)V";
          else if (nameId2.equals("read"))
            call += ")I";
          else
            call += ")V";
        }
        else {
          if(nameId2.equals("size"))
            call += ")I";
          else
            call += ")V";
        }
      }

      line += call;
      line += "\n";

      return line;
    }

}
/* JavaCC - OriginalChecksum=b1093cf9be00752b849437115fba253a (do not edit this line) */
