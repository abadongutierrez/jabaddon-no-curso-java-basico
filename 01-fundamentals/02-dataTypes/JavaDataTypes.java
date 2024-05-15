
void main() {
    System.err.println("Hello Java 23!");

    // ------------------------------------------------
    // Tipos de datos enteros: byte, short, int y long
    // ------------------------------------------------

    // declarando e inicializando la variable miByte
    byte miByte = 127;
    // declarando la variable
    byte noValorByte;
    // inicializando la variable
    noValorByte = 10;
    System.err.println(127);
    System.err.println(miByte);
    System.err.println(noValorByte);

    short shortLimiteNegativo = -32768;
    short shortLimitePositivo = 32767;
    System.err.println(shortLimiteNegativo);
    System.err.println(shortLimitePositivo);

    int intLimiteNegativo = -2147483648;
    // 2,147,483,647
    int intLimitePositivo = 2_147_483_647;
    System.err.println(intLimiteNegativo);
    System.err.println(intLimitePositivo);

    long longLimiteNegativo = -9_223_372_036_854_775_808L;
    long longLimitePositivo = 9_223_372_036_854_775_807L;
    System.err.println(longLimiteNegativo);
    System.err.println(longLimitePositivo);

    // ------------------------------------------------
    // Tipos de datos numero flotante: float y double
    // ------------------------------------------------

    float miFloat = 0.435F;
    System.err.println(miFloat);

    double miDouble = 9.81;
    System.err.println(miDouble);

    // ------------------------------------------------
    // Tipos de datos boolean: true y false
    // ------------------------------------------------

    boolean verdadero = true;
    boolean blablabla = true;
    boolean falso = false;
    System.err.println(verdadero);
    System.err.println(false);

    // ------------------------------------------------
    // Tipos de datos char: caracters
    // ------------------------------------------------

    // representado con unicode
    char miCaracterUnicode = '\u0000';
    char miCaracterUnicode2 = '\u0023';
    char miCaracterUnicode3 = '\u0424';
    char miCaracterUnicode4 = '\u3045';
    char miCaracterUnicode5 = '\ufffc';
    // representado con entero
    char miCaracterInt = 65_535;
    char miCaracterInt2 = 35;
    // caracter con comillas simples
    char miCaracter = 'a';
    System.err.println(miCaracterUnicode);
    System.err.println(miCaracterUnicode2);
    System.err.println(miCaracterInt2);
    System.err.println(miCaracterUnicode3);
    System.err.println(miCaracterUnicode4);
    System.err.println(miCaracterUnicode5);
    System.err.println(miCaracterInt);
    System.err.println(miCaracterUnicode5 == miCaracterInt);
    System.err.println(miCaracter);
}
