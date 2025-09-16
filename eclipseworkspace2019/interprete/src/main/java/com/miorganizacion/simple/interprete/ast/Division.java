package com.miorganizacion.simple.interprete.ast;

import java.util.Map;

public class Division implements ASTNode {
    private ASTNode operand1;
    private ASTNode operand2;
    
    public Division(ASTNode operand1, ASTNode operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        int divisor = (int)operand2.execute(symbolTable);
        if (divisor == 0) {
            throw new RuntimeException("Division by zero");
        }
        return (int)operand1.execute(symbolTable) / divisor;
    }
}