package jetbrains.language;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class TTMLLanguage extends Language {
    public static final TTMLLanguage INSTANCE = new TTMLLanguage();

    private TTMLLanguage() {
        super("TTML");
    }
}
