/**
 * miniJava Abstract Syntax Tree classes
 * @author prins
 * @version COMP 520 (v2.2)
 */
package miniJava.AbstractSyntaxTrees;

import miniJava.SyntacticAnalyzer.Token;

public class BooleanLiteral extends Terminal {

  public BooleanLiteral(Token t) {
    super (t);
  }
 
  public Object visit(Visitor v, Object o) {
      return v.visitBooleanLiteral(this, o);
  }
}
