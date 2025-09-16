package com.miorganizacion.simple.interprete.ast;
import java.util.Map;

public class GreaterEqual implements ASTNode {
    private ASTNode left, right;
    public GreaterEqual(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public Object execute(Map<String, Object> symbolTable) {
        return ((Number)left.execute(symbolTable)).doubleValue() >= ((Number)right.execute(symbolTable)).doubleValue();
    }
}