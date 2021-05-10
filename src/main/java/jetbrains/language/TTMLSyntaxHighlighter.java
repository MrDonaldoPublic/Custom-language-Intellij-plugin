package jetbrains.language;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import jetbrains.language.psi.TTMLTypes;
import org.jetbrains.annotations.NotNull;

public class TTMLSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey NORMAL = TextAttributesKey.createTextAttributesKey(
            "TTML_NORMAL", DefaultLanguageHighlighterColors.NUMBER
    );
    public static final TextAttributesKey BOLD = TextAttributesKey.createTextAttributesKey(
            "TTML_BOLD", DefaultLanguageHighlighterColors.CONSTANT
    );
    public static final TextAttributesKey ITALIC = TextAttributesKey.createTextAttributesKey(
            "TTML_ITALIC", DefaultLanguageHighlighterColors.METADATA
    );
    public static final TextAttributesKey UNDERLINED = TextAttributesKey.createTextAttributesKey(
            "TTML_UNDERLINED", DefaultLanguageHighlighterColors.BLOCK_COMMENT
    );
    public static final TextAttributesKey STRIKETHROUGH = TextAttributesKey.createTextAttributesKey(
            "TTML_STRIKETHROUGH", DefaultLanguageHighlighterColors.HIGHLIGHTED_REFERENCE
    );
    public static final TextAttributesKey OTHER = TextAttributesKey.createTextAttributesKey(
            "TTML_OTHER", DefaultLanguageHighlighterColors.INLAY_DEFAULT
    );
    public static final TextAttributesKey TEXT = TextAttributesKey.createTextAttributesKey(
            "TTML_TEXT", DefaultLanguageHighlighterColors.IDENTIFIER
    );

    private static final TextAttributesKey[] NORMAL_KEYS = new TextAttributesKey[]{NORMAL};
    private static final TextAttributesKey[] BOLD_KEYS = new TextAttributesKey[]{BOLD};
    private static final TextAttributesKey[] ITALIC_KEYS = new TextAttributesKey[]{ITALIC};
    private static final TextAttributesKey[] UNDERLINED_KEYS = new TextAttributesKey[]{UNDERLINED};
    private static final TextAttributesKey[] STRIKETHROUGH_KEYS = new TextAttributesKey[]{STRIKETHROUGH};
    private static final TextAttributesKey[] OTHER_KEYS = new TextAttributesKey[]{OTHER};
    private static final TextAttributesKey[] TEXT_KEYS = new TextAttributesKey[]{TEXT};
    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{HighlighterColors.BAD_CHARACTER};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new TTMLLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(final IElementType tokenType) {
        if (tokenType.equals(TTMLTypes.NORMAL)) {
            return NORMAL_KEYS;
        } else if (tokenType.equals(TTMLTypes.BOLD)) {
            return BOLD_KEYS;
        } else if (tokenType.equals(TTMLTypes.ITALIC)) {
            return ITALIC_KEYS;
        } else if (tokenType.equals(TTMLTypes.UNDERLINED)) {
            return UNDERLINED_KEYS;
        } else if (tokenType.equals(TTMLTypes.STRIKETHROUGH)) {
            return STRIKETHROUGH_KEYS;
        } else if (tokenType.equals(TTMLTypes.OTHER)) {
            return OTHER_KEYS;
        } else if (tokenType.equals(TTMLTypes.TEXT)) {
            return TEXT_KEYS;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}
