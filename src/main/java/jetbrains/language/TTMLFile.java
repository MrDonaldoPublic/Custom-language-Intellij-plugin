package jetbrains.language;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class TTMLFile extends PsiFileBase {
    public TTMLFile(@NotNull final FileViewProvider provider) {
        super(provider, TTMLLanguage.INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType() {
        return TTMLFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "TTML File";
    }
}
