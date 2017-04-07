/**
 * miniJava Abstract Syntax Tree classes
 * @author prins
 * @version COMP 520 (v2.2)
 */
package miniJava.AbstractSyntaxTrees;

import miniJava.SyntacticAnalyzer.SourcePosition;

public class BinaryExpr extends Expression
{
	public BinaryExpr(Operator o, Expression e1, Expression e2){
		this(o,e1,e2,SourcePosition.ZERO);
	}
	
    public BinaryExpr(Operator o, Expression e1, Expression e2, SourcePosition posn){
        super(posn);
        operator = o;
        left = e1;
        right = e2;
    }
        
    public Object visit(Visitor v, Object o) {
        return v.visitBinaryExpr(this, o);
    }
    
    public Operator operator;
    public Expression left;
    public Expression right;
}