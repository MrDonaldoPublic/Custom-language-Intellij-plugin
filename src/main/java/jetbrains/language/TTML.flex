package jetbrains.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import jetbrains.language.psi.TTMLTypes;
import com.intellij.psi.TokenType;

%%

%class TTMLLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType

%{
    private void print(final String type) {
        System.out.println("Found " + type + ", matched " + yytext());
    }
%}

%eof{
    print("End of File has been reached!");
    return;
%eof}

NORMAL=\^B
BOLD=\^A
ITALIC=\^E
UNDERLINED=\^F
STRIKETHROUGH=\^U
MARKUP=\^[@A-Z\[\\\]\^_?]
TEXT=[^\^]+

%%

{NORMAL}        { print("normal"); return TTMLTypes.NORMAL; }
{BOLD}          { print("bold"); return TTMLTypes.BOLD; }
{ITALIC}        { print("italic"); return TTMLTypes.ITALIC; }
{UNDERLINED}    { print("underlined"); return TTMLTypes.UNDERLINED; }
{STRIKETHROUGH} { print("strikethrough"); return TTMLTypes.STRIKETHROUGH; }
{MARKUP}        { print("other markup"); return TTMLTypes.OTHER; }
{TEXT}          { print("text"); return TTMLTypes.TEXT; }
[^]             { print("unexpected"); return TokenType.BAD_CHARACTER; }