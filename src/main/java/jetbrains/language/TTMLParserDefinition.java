package jetbrains.language;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import jetbrains.language.parser.TTMLParser;
import jetbrains.language.psi.TTMLTypes;
import org.jetbrains.annotations.NotNull;

public class TTMLParserDefinition implements ParserDefinition {
    @Override
    public @NotNull Lexer createLexer(final Project project) {
        return new TTMLLexerAdapter();
    }

    @Override
    public @NotNull PsiParser createParser(final Project project) {
        return new TTMLParser();
    }

    @Override
    public @NotNull IFileElementType getFileNodeType() {
        return new IFileElementType(TTMLLanguage.INSTANCE);
    }

    @Override
    public @NotNull TokenSet getCommentTokens() {
        return TokenSet.EMPTY;
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements() {
        return TokenSet.create(TTMLTypes.TEXT);
    }

    @Override
    public @NotNull PsiElement createElement(final ASTNode node) {
        return TTMLTypes.Factory.createElement(node);
    }

    @Override
    public @NotNull PsiFile createFile(@NotNull final FileViewProvider provider) {
        return new TTMLFile(provider);
    }
}
