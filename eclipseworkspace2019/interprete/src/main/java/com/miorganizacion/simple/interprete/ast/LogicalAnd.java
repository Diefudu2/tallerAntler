package com.miorganizacion.simple.interprete.ast;
import java.util.Map;
public class LogicalAnd implements ASTNode {
    private ASTNode left, right;
    public LogicalAnd(ASTNode left, ASTNode right) { this.left = left; this.right = right; }
    @Override
    public Object execute(Map<String, Object> symbolTable) {
        return (Boolean)left.execute(symbolTable) && (Boolean)right.execute(symbolTable);
    }
}