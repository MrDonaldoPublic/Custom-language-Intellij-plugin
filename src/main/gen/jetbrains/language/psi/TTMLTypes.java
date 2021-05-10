// This is a generated file. Not intended for manual editing.
package jetbrains.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import jetbrains.language.psi.impl.*;

public interface TTMLTypes {

  IElementType CONTENT = new TTMLElementType("CONTENT");
  IElementType LINE = new TTMLElementType("LINE");
  IElementType MARKUP = new TTMLElementType("MARKUP");

  IElementType BOLD = new TTMLTokenType("BOLD");
  IElementType ITALIC = new TTMLTokenType("ITALIC");
  IElementType NORMAL = new TTMLTokenType("NORMAL");
  IElementType OTHER = new TTMLTokenType("OTHER");
  IElementType STRIKETHROUGH = new TTMLTokenType("STRIKETHROUGH");
  IElementType TEXT = new TTMLTokenType("TEXT");
  IElementType UNDERLINED = new TTMLTokenType("UNDERLINED");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CONTENT) {
        return new TTMLContentImpl(node);
      }
      else if (type == LINE) {
        return new TTMLLineImpl(node);
      }
      else if (type == MARKUP) {
        return new TTMLMarkupImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
