package miniJava.SyntacticAnalyzer;

public enum TokenKind {
	// OPERATORS
	GTR, LSS, EQU, LSS_EQU, GTR_EQU, NOT_EQU,
	AND, OR, NOT, PLUS, MINUS, MULT, DIV,
	
	ASSIGN,
	DOT, SEMICOLON, COMMA,
	
	// PARENTHESIS
	PAREN_OPEN, PAREN_CLOSE, SQR_OPEN, SQR_CLOSE,
	CURL_OPEN, CURL_CLOSE,
	
	// KEY WORDS
	CLASS, VOID, PUBLIC, PRIVATE, STATIC, INT,
	BOOLEAN, THIS, IF, WHILE, ELSE, TRUE, FALSE,
	NEW, RETURN,
	
	NUM,
	IDENTIFIER,
	EOT,
	
	// SPECIAL ERROR VALUE
	ERROR
}