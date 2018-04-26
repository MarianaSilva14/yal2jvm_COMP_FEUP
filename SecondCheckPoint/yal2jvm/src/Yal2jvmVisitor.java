import java.util.LinkedList;
import java.util.Queue;

public class Yal2jvmVisitor extends parserGrammarDefaultVisitor {

  Queue<Symbol> myQueue = new LinkedList<Symbol>();

  public Object visit(ASTModule node, Object data){
    System.out.println("Colocamos na lista o símbolo do Module");

    String nameModule = node.getName();
    Symbol symbol = new Symbol("Module", nameModule, false);

    myQueue.add(symbol);

    System.out.println("Colocamos na lista o símbolo do Module");

    Object obj = super.visit(node,data);
    return obj;
  }

}
