// This is a generated file. Not intended for manual editing.
package ru.hivesqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HiveSQLDml extends PsiElement {

  @Nullable
  HiveSQLDeleteStatement getDeleteStatement();

  @Nullable
  HiveSQLInsertStatement getInsertStatement();

  @Nullable
  HiveSQLLoadData getLoadData();

  @Nullable
  HiveSQLMergeStatement getMergeStatement();

  @Nullable
  HiveSQLSelectStatement getSelectStatement();

  @Nullable
  HiveSQLUpdateStatement getUpdateStatement();

}
