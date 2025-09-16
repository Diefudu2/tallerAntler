package com.miorganizacion.simple.interprete.ast;
import java.util.Map;
public class LogicalNot implements ASTNode {
    private ASTNode operand;
    public LogicalNot(ASTNode operand) { this.operand = operand; }
    @Override
    public Object execute(Map<String, Object> symbolTable) {
        return !(Boolean)operand.execute(symbolTable);
    }
}