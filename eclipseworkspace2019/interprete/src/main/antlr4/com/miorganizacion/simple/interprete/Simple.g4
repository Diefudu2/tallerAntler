grammar Simple;

@parser::header{
    import java.util.Map;
    import java.util.HashMap;
    import java.util.List;
    import java.util.ArrayList;
    import com.miorganizacion.simple.interprete.ast.*;
}
@parser::members{
    Map<String, Object> symbolTable = new HashMap<String, Object>();
}

program: PROGRAM ID BRACKET_OPEN 
	{
		List<ASTNode> body = new ArrayList<ASTNode>();
		Map<String, Object> symbolTable = new HashMap<String,Object>();
	}
    (sentence{body.add($sentence.node);})*
    BRACKET_CLOSE
    {
    	for (ASTNode n : body){
    		n.execute(symbolTable);
    	}
    };

sentence returns [ASTNode node]:  
    println {$node = $println.node;} 
    | conditional {$node = $conditional.node;}
    | var_decl {$node = $var_decl.node;}
    | var_assign {$node = $var_assign.node;};

var_decl returns [ASTNode node]: VAR ID SEMICOLON
    {$node = new VarDecl($ID.text);};
    
var_assign returns [ASTNode node]: ID ASSIGN expression SEMICOLON
    {$node = new VarAssign($ID.text, $expression.node);};
    
println returns [ASTNode node]: PRINTLN expression SEMICOLON
    {$node = new Println($expression.node);};
    
conditional returns [ASTNode node]: IF PAR_OPEN expression PAR_CLOSE
    {
        List<ASTNode> body = new ArrayList<ASTNode>();
    }
    BRACKET_OPEN (s1=sentence{body.add($s1.node);})* BRACKET_CLOSE
    (ELSE
    {
        List<ASTNode> elseBody = new ArrayList<ASTNode>();
    }
    BRACKET_OPEN (s2=sentence{elseBody.add($s2.node);})* BRACKET_CLOSE
    {
        $node = new If($expression.node, body, elseBody);
    }
    | 
    {
        $node = new If($expression.node, body, null);
    });

// --- EXPRESIONES ---

expression returns [ASTNode node]
    : t1=logicTerm {$node = $t1.node;}
      (OR t2=logicTerm {$node = new LogicalOr($node, $t2.node);})*
    ;

logicTerm returns [ASTNode node]
    : t1=logicFactor {$node = $t1.node;}
      (AND t2=logicFactor {$node = new LogicalAnd($node, $t2.node);})*
    ;

logicFactor returns [ASTNode node]
    : NOT lf=logicFactor {$node = new LogicalNot($lf.node);}
    | t=relational {$node = $t.node;}
    ;

relational returns [ASTNode node]
    : t1=arithExpr {$node = $t1.node;}
      (
        GT t2=arithExpr {$node = new GreaterThan($node, $t2.node);}
      | LT t2=arithExpr {$node = new LessThan($node, $t2.node);}
      | GEQ t2=arithExpr {$node = new GreaterEqual($node, $t2.node);}
      | LEQ t2=arithExpr {$node = new LessEqual($node, $t2.node);}
      | EQ t2=arithExpr {$node = new Equals($node, $t2.node);}
      | NEQ t2=arithExpr {$node = new NotEquals($node, $t2.node);}
      )*
    ;

// --- OPERACIONES ARITMÉTICAS ---

arithExpr returns [ASTNode node]: 
    t1=term {$node = $t1.node;}
    ( (PLUS t2=term {$node = new Addition($node, $t2.node);})
    | (MINUS t2=term {$node = new Subtraction($node, $t2.node);})
    )*;

term returns [ASTNode node]: 
    t1=factor {$node = $t1.node;}
    ( (MULT t2=factor {$node = new Multiplication($node, $t2.node);})
    | (DIV t2=factor {$node = new Division($node, $t2.node);})
    )*;

factor returns [ASTNode node]:
    t1=exponent {$node = $t1.node;}
    (EXP t2=exponent {$node = new Exponentiation($node, $t2.node);})*;

exponent returns [ASTNode node]: 
    t1=specialFunc {$node = $t1.node;}
    | primary {$node = $primary.node;}
    ;

// --- FUNCIONES CREATIVAS Y PROBABILÍSTICAS ---

specialFunc returns [ASTNode node]
    : 'DIGITALROOT' PAR_OPEN e1=expression PAR_CLOSE
      {$node = new DigitalRoot($e1.node);}
    | 'SIMULATEGAUSS' PAR_OPEN e1=expression COMMA e2=expression PAR_CLOSE
      {$node = new SimulateGauss($e1.node, $e2.node);}
    ;

primary returns [ASTNode node]: 
    NUMBER {$node = new Constant(Integer.parseInt($NUMBER.text));}
    | ID {$node = new VarRef($ID.text);}
    | BOOLEAN {$node = new Constant(Boolean.parseBoolean($BOOLEAN.text));}
    | PAR_OPEN expression {$node = $expression.node;} PAR_CLOSE;

// --- TOKENS ---

PROGRAM: 'program';
VAR: 'var';
PRINTLN: 'println';
IF: 'if';
ELSE: 'else';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
EXP: '^';
AND: '&&';
OR: '||';
NOT: '!';
GT: '>';
LT: '<';
GEQ: '>=';
LEQ: '<=';
EQ: '==';
NEQ: '!=';
ASSIGN: '=';
BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';
PAR_OPEN: '(';
PAR_CLOSE: ')';
SEMICOLON: ';';
COMMA: ',';
BOOLEAN: 'true' | 'false';
ID: [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER: [0-9]+;
WS: [ \t\n\r]+ -> skip;