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

public class TTMLContentImpl extends ASTWrapperPsiElement implements TTMLContent {

  public TTMLContentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TTMLVisitor visitor) {
    visitor.visitContent(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TTMLVisitor) accept((TTMLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TTMLLine> getLineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TTMLLine.class);
  }

}
