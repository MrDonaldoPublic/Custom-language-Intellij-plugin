package jetbrains.language.psi;

import com.intellij.psi.tree.IElementType;
import jetbrains.language.TTMLLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class TTMLTokenType extends IElementType {
    public TTMLTokenType(@NotNull @NonNls final String name) {
        super(name, TTMLLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "TTMLTokenType." + super.toString();
    }
}
