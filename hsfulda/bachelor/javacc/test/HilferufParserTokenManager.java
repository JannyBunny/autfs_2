package hsfulda.bachelor.javacc.test;
/* HilferufParserTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. HilferufParserTokenManager.java */

/** Token Manager. */
@SuppressWarnings("unused")public class HilferufParserTokenManager implements HilferufParserConstants {

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_6(){
   switch(curChar)
   {
      case 46:
         return jjMoveStringLiteralDfa1_6(0xd57620L);
      case 95:
         return jjMoveStringLiteralDfa1_6(0x72a89c0L);
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa1_6(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 35:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(1, 9);
         else if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(1, 21);
         break;
      case 46:
         return jjMoveStringLiteralDfa2_6(active0, 0x3c0b5c0L);
      case 95:
         return jjMoveStringLiteralDfa2_6(active0, 0x41f4820L);
      default :
         return 2;
   }
   return 2;
}
static private int jjMoveStringLiteralDfa2_6(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 2;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 2;
   }
   switch(curChar)
   {
      case 35:
         if ((active0 & 0x20L) != 0L)
            return jjStopAtPos(2, 5);
         else if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(2, 13);
         else if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(2, 17);
         break;
      case 46:
         return jjMoveStringLiteralDfa3_6(active0, 0x5991940L);
      case 95:
         return jjMoveStringLiteralDfa3_6(active0, 0x244c480L);
      default :
         return 3;
   }
   return 3;
}
static private int jjMoveStringLiteralDfa3_6(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 3;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 3;
   }
   switch(curChar)
   {
      case 35:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(3, 8);
         else if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(3, 11);
         else if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(3, 15);
         else if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(3, 20);
         else if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(3, 22);
         break;
      case 46:
         return jjMoveStringLiteralDfa4_6(active0, 0x50514c0L);
      case 95:
         return jjMoveStringLiteralDfa4_6(active0, 0x2884000L);
      default :
         return 4;
   }
   return 4;
}
static private int jjMoveStringLiteralDfa4_6(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 4;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 4;
   }
   switch(curChar)
   {
      case 35:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(4, 6);
         else if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(4, 7);
         else if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(4, 10);
         else if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(4, 12);
         else if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(4, 14);
         else if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(4, 16);
         else if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(4, 18);
         else if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(4, 19);
         else if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(4, 23);
         else if ((active0 & 0x2000000L) != 0L)
            return jjStopAtPos(4, 25);
         else if ((active0 & 0x4000000L) != 0L)
            return jjStopAtPos(4, 26);
         break;
      case 95:
         return jjMoveStringLiteralDfa5_6(active0, 0x1000000L);
      default :
         return 5;
   }
   return 5;
}
static private int jjMoveStringLiteralDfa5_6(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 5;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 5;
   }
   switch(curChar)
   {
      case 35:
         if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(5, 24);
         break;
      default :
         return 6;
   }
   return 6;
}
static private int jjMoveStringLiteralDfa0_2()
{
   return 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa0_3()
{
   return 1;
}
static private int jjMoveStringLiteralDfa0_4()
{
   return 1;
}
static private int jjMoveStringLiteralDfa0_1()
{
   return 1;
}
private static final int jjStopStringLiteralDfa_7(int pos, long active0){
   switch (pos)
   {
      default :
         return -1;
   }
}
private static final int jjStartNfa_7(int pos, long active0){
   return jjMoveNfa_7(jjStopStringLiteralDfa_7(pos, active0), pos + 1);
}
static private int jjMoveStringLiteralDfa0_7(){
   switch(curChar)
   {
      case 35:
         return jjStopAtPos(0, 31);
      case 46:
         return jjMoveStringLiteralDfa1_7(0x60000000L);
      case 95:
         return jjMoveStringLiteralDfa1_7(0x18000000L);
      default :
         return jjMoveNfa_7(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_7(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_7(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 46:
         return jjMoveStringLiteralDfa2_7(active0, 0x28000000L);
      case 95:
         return jjMoveStringLiteralDfa2_7(active0, 0x50000000L);
      default :
         break;
   }
   return jjStartNfa_7(0, active0);
}
static private int jjMoveStringLiteralDfa2_7(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_7(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_7(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 35:
         if ((active0 & 0x8000000L) != 0L)
            return jjStopAtPos(2, 27);
         break;
      case 46:
         return jjMoveStringLiteralDfa3_7(active0, 0x20000000L);
      case 95:
         return jjMoveStringLiteralDfa3_7(active0, 0x50000000L);
      default :
         break;
   }
   return jjStartNfa_7(1, active0);
}
static private int jjMoveStringLiteralDfa3_7(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_7(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_7(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 35:
         if ((active0 & 0x10000000L) != 0L)
            return jjStopAtPos(3, 28);
         else if ((active0 & 0x20000000L) != 0L)
            return jjStopAtPos(3, 29);
         else if ((active0 & 0x40000000L) != 0L)
            return jjStopAtPos(3, 30);
         break;
      default :
         break;
   }
   return jjStartNfa_7(2, active0);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0x1000000000000L, 0x0L
};
static private int jjMoveNfa_7(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 5;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjAddStates(0, 1); }
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) != 0L && kind > 32)
                     kind = 32;
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) != 0L && kind > 33)
                     kind = 33;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 3:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 5 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static private int jjMoveStringLiteralDfa0_5()
{
   return 1;
}
static final int[] jjnextStates = {
   1, 3, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\56\137\43", "\137\56\56\56\43", 
"\137\56\137\56\43", "\137\56\56\43", "\56\43", "\56\56\137\56\43", "\137\137\56\43", 
"\56\56\56\56\43", "\56\56\43", "\56\137\137\137\43", "\137\56\137\43", "\56\137\56\56\43", 
"\137\137\43", "\56\137\137\56\43", "\137\137\56\137\43", "\56\137\56\43", "\137\43", 
"\56\56\137\43", "\56\56\56\137\43", "\137\56\56\56\137\43", "\137\56\137\137\43", 
"\137\137\56\56\43", "\137\56\43", "\137\137\137\43", "\56\56\56\43", "\56\137\137\43", "\43", null, 
null, };
static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   switch(curLexState)
   {
     case 0:
       try { input_stream.backup(0);
          while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
             curChar = input_stream.BeginToken();
       }
       catch (java.io.IOException e1) { continue EOFLoop; }
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       break;
     case 1:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
       break;
     case 2:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_2();
       break;
     case 3:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_3();
       break;
     case 4:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_4();
       break;
     case 5:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_5();
       break;
     case 6:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_6();
       break;
     case 7:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_7();
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

    /** Constructor. */
    public HilferufParserTokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public HilferufParserTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream)
  {
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 5; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream, int lexState)
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  static public void SwitchTo(int lexState)
  {
    if (lexState >= 8 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "ERR",
   "RAUTE",
   "BREIT",
   "LAENG",
   "END",
   "WRONG",
   "RIGHT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x3ffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[5];
    static private final int[] jjstateSet = new int[2 * 5];

    
    static protected char curChar;
}
