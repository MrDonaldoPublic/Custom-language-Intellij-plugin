package jetbrains.language.psi;

import com.intellij.psi.tree.IElementType;
import jetbrains.language.TTMLLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class TTMLElementType extends IElementType {
    public TTMLElementType(@NotNull @NonNls final String name) {
        super(name, TTMLLanguage.INSTANCE);
    }
}
