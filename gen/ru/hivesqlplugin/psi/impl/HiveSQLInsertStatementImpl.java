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

public class HiveSQLInsertStatementImpl extends ASTWrapperPsiElement implements HiveSQLInsertStatement {

  public HiveSQLInsertStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HiveSQLVisitor visitor) {
    visitor.visitInsertStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HiveSQLVisitor) accept((HiveSQLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HiveSQLFromStatement getFromStatement() {
    return findChildByClass(HiveSQLFromStatement.class);
  }

  @Override
  @NotNull
  public List<HiveSQLPartitionColumn> getPartitionColumnList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HiveSQLPartitionColumn.class);
  }

  @Override
  @Nullable
  public HiveSQLSelectStatement getSelectStatement() {
    return findChildByClass(HiveSQLSelectStatement.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

}
