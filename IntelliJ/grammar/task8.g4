grammar task8;

//Parser Rule start to parse the input and check whether it is accepted or rejected
start: (Q2 | Q3 | Q4) + EOF ;

//Lexer Rule Q2 which has the Regular Expression of the accepted state Q2
Q2: Q0LOOP* ZERO ZERO ;

//Lexer Rule Q3 which has the Regular Expression of the accepted state Q3
Q3: Q0LOOP* ZERO (ONE+ ZERO)* ZERO (ZERO | ONE+ ZERO) (ONE+ ZERO)*;

//Lexer Rule Q4 which has the Regular Expression of the accepted state Q4
Q4: Q0LOOP* ZERO ZERO (ONE+ | ZERO ONE)*  ;

//Fragments representing the zeros and ones
fragment ZERO: '0' ;
fragment ONE: '1' ;
fragment Q0LOOP: (Q0LOOP1 | Q0LOOP2 | Q0LOOP3);
fragment Q0LOOP1: ONE+ ;
fragment Q0LOOP2: ZERO ONE+;
fragment Q0LOOP3: ZERO ZERO (ZERO | ONE+ ZERO) Q3LOOP* ZERO;
fragment Q3LOOP: ONE+ ZERO ;
