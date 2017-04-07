/**
 * miniJava Abstract Syntax Tree classes
 * @author prins
 * @version COMP 520 (v2.2)
 */
package miniJava.AbstractSyntaxTrees;

import miniJava.SyntacticAnalyzer.SourcePosition;

public class WhileStmt extends Statement
{
	public WhileStmt(Expression e, Statement s) {
		this(e, s, SourcePosition.ZERO);
	}
	
    public WhileStmt(Expression e, Statement s, SourcePosition posn){
        super(posn);
        cond = e;
        body = s;
    }
        
    public Object visit(Visitor v, Object o) {
        return v.visitWhileStmt(this, o);
    }

    public Expression cond;
    public Statement body;
}
