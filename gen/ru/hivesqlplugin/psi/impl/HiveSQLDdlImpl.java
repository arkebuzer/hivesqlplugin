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

public class HiveSQLDdlImpl extends ASTWrapperPsiElement implements HiveSQLDdl {

  public HiveSQLDdlImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HiveSQLVisitor visitor) {
    visitor.visitDdl(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HiveSQLVisitor) accept((HiveSQLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HiveSQLAlterDatabase getAlterDatabase() {
    return findChildByClass(HiveSQLAlterDatabase.class);
  }

  @Override
  @Nullable
  public HiveSQLCreateDatabase getCreateDatabase() {
    return findChildByClass(HiveSQLCreateDatabase.class);
  }

  @Override
  @Nullable
  public HiveSQLCreateTable getCreateTable() {
    return findChildByClass(HiveSQLCreateTable.class);
  }

  @Override
  @Nullable
  public HiveSQLDropDatabase getDropDatabase() {
    return findChildByClass(HiveSQLDropDatabase.class);
  }

  @Override
  @Nullable
  public HiveSQLDropTable getDropTable() {
    return findChildByClass(HiveSQLDropTable.class);
  }

  @Override
  @Nullable
  public HiveSQLTruncateTable getTruncateTable() {
    return findChildByClass(HiveSQLTruncateTable.class);
  }

  @Override
  @Nullable
  public HiveSQLUseStatement getUseStatement() {
    return findChildByClass(HiveSQLUseStatement.class);
  }

}
