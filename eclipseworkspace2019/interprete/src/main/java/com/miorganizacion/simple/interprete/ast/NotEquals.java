package com.miorganizacion.simple.interprete.ast;
import java.util.Map;

public class NotEquals implements ASTNode {
    private ASTNode left, right;
    public NotEquals(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object l = left.execute(symbolTable);
        Object r = right.execute(symbolTable);
        return !(l == null ? r == null : l.equals(r));
    }
}