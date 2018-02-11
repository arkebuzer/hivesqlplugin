// This is a generated file. Not intended for manual editing.
package ru.hivesqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HiveSQLDataType extends PsiElement {

  @Nullable
  HiveSQLArrayType getArrayType();

  @Nullable
  HiveSQLMapType getMapType();

  @Nullable
  HiveSQLPrimitiveType getPrimitiveType();

  @Nullable
  HiveSQLStructType getStructType();

  @Nullable
  HiveSQLUnionType getUnionType();

}
