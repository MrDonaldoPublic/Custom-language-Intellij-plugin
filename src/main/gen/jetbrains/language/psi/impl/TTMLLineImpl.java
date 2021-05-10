// This is a generated file. Not intended for manual editing.
package jetbrains.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static jetbrains.language.psi.TTMLTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import jetbrains.language.psi.*;

public class TTMLLineImpl extends ASTWrapperPsiElement implements TTMLLine {

  public TTMLLineImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TTMLVisitor visitor) {
    visitor.visitLine(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TTMLVisitor) accept((TTMLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TTMLMarkup> getMarkupList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TTMLMarkup.class);
  }

}
