package jetbrains.language;

import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TTMLSyntaxHighlighterFactory extends SyntaxHighlighterFactory {
    @Override
    public @NotNull SyntaxHighlighter getSyntaxHighlighter(@Nullable final Project project, @Nullable final VirtualFile file) {
        return new TTMLSyntaxHighlighter();
    }
}
