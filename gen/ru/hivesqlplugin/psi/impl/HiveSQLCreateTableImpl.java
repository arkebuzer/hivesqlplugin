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

public class HiveSQLCreateTableImpl extends ASTWrapperPsiElement implements HiveSQLCreateTable {

  public HiveSQLCreateTableImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HiveSQLVisitor visitor) {
    visitor.visitCreateTable(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HiveSQLVisitor) accept((HiveSQLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HiveSQLConstraintSpecification getConstraintSpecification() {
    return findChildByClass(HiveSQLConstraintSpecification.class);
  }

  @Override
  @NotNull
  public List<HiveSQLDataType> getDataTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HiveSQLDataType.class);
  }

  @Override
  @Nullable
  public HiveSQLFileFormat getFileFormat() {
    return findChildByClass(HiveSQLFileFormat.class);
  }

  @Override
  @Nullable
  public HiveSQLRowFormat getRowFormat() {
    return findChildByClass(HiveSQLRowFormat.class);
  }

  @Override
  @Nullable
  public HiveSQLSelectStatement getSelectStatement() {
    return findChildByClass(HiveSQLSelectStatement.class);
  }

  @Override
  @Nullable
  public PsiElement getInteger() {
    return findChildByType(INTEGER);
  }

}
