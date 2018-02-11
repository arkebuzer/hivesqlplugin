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

public class HiveSQLDataTypeImpl extends ASTWrapperPsiElement implements HiveSQLDataType {

  public HiveSQLDataTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HiveSQLVisitor visitor) {
    visitor.visitDataType(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HiveSQLVisitor) accept((HiveSQLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HiveSQLArrayType getArrayType() {
    return findChildByClass(HiveSQLArrayType.class);
  }

  @Override
  @Nullable
  public HiveSQLMapType getMapType() {
    return findChildByClass(HiveSQLMapType.class);
  }

  @Override
  @Nullable
  public HiveSQLPrimitiveType getPrimitiveType() {
    return findChildByClass(HiveSQLPrimitiveType.class);
  }

  @Override
  @Nullable
  public HiveSQLStructType getStructType() {
    return findChildByClass(HiveSQLStructType.class);
  }

  @Override
  @Nullable
  public HiveSQLUnionType getUnionType() {
    return findChildByClass(HiveSQLUnionType.class);
  }

}
