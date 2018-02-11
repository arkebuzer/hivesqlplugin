// This is a generated file. Not intended for manual editing.
package ru.hivesqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HiveSQLCreateTable extends PsiElement {

  @Nullable
  HiveSQLConstraintSpecification getConstraintSpecification();

  @NotNull
  List<HiveSQLDataType> getDataTypeList();

  @Nullable
  HiveSQLFileFormat getFileFormat();

  @Nullable
  HiveSQLRowFormat getRowFormat();

  @Nullable
  HiveSQLSelectStatement getSelectStatement();

  @Nullable
  PsiElement getInteger();

}
