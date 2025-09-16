package com.miorganizacion.simple.interprete.ast;
import java.util.Map;
import java.util.Random;

public class SimulateGauss implements ASTNode {
    private ASTNode mu, sigma;
    private static final Random RANDOM = new Random();
    public SimulateGauss(ASTNode mu, ASTNode sigma) {
        this.mu = mu;
        this.sigma = sigma;
    }
    @Override
    public Object execute(Map<String, Object> symbolTable) {
        double mean = ((Number)mu.execute(symbolTable)).doubleValue();
        double stddev = ((Number)sigma.execute(symbolTable)).doubleValue();
        return mean + RANDOM.nextGaussian() * stddev;
    }
}