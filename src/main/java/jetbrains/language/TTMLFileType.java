package jetbrains.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.util.NlsSafe;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class TTMLFileType extends LanguageFileType {
    public static final TTMLFileType INSTANCE = new TTMLFileType();

    private TTMLFileType() {
        super(TTMLLanguage.INSTANCE);
    }

    @Override
    public @NonNls @NotNull String getName() {
        return "TTML File";
    }

    @Override
    public @NlsContexts.Label @NotNull String getDescription() {
        return "TTML language file";
    }

    @Override
    public @NlsSafe @NotNull String getDefaultExtension() {
        return "ttml";
    }

    @Override
    public @Nullable Icon getIcon() {
        return TTMLIcons.FILE;
    }
}
