package jetbrains.language;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;
import org.jetbrains.annotations.NotNull;

public class TTMLLexerAdapter extends FlexAdapter {
    public TTMLLexerAdapter() {
        super(new TTMLLexer(null));
    }
}
