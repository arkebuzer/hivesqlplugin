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

public class HiveSQLDmlImpl extends ASTWrapperPsiElement implements HiveSQLDml {

  public HiveSQLDmlImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HiveSQLVisitor visitor) {
    visitor.visitDml(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HiveSQLVisitor) accept((HiveSQLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HiveSQLDeleteStatement getDeleteStatement() {
    return findChildByClass(HiveSQLDeleteStatement.class);
  }

  @Override
  @Nullable
  public HiveSQLInsertStatement getInsertStatement() {
    return findChildByClass(HiveSQLInsertStatement.class);
  }

  @Override
  @Nullable
  public HiveSQLLoadData getLoadData() {
    return findChildByClass(HiveSQLLoadData.class);
  }

  @Override
  @Nullable
  public HiveSQLMergeStatement getMergeStatement() {
    return findChildByClass(HiveSQLMergeStatement.class);
  }

  @Override
  @Nullable
  public HiveSQLSelectStatement getSelectStatement() {
    return findChildByClass(HiveSQLSelectStatement.class);
  }

  @Override
  @Nullable
  public HiveSQLUpdateStatement getUpdateStatement() {
    return findChildByClass(HiveSQLUpdateStatement.class);
  }

}
