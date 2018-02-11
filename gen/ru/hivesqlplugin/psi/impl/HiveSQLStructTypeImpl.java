// This is a generated file. Not intended for manual editing.
package ru.hivesqlplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static ru.hivesqlplugin.psi.HiveSQLTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import ru.hivesqlplugin.psi.*;

public class HiveSQLStructTypeImpl extends ASTWrapperPsiElement implements HiveSQLStructType {

  public HiveSQLStructTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HiveSQLVisitor visitor) {
    visitor.visitStructType(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HiveSQLVisitor) accept((HiveSQLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<HiveSQLDataType> getDataTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HiveSQLDataType.class);
  }

}
