// This is a generated file. Not intended for manual editing.
package ru.hivesqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HiveSQLInsertStatement extends PsiElement {

  @Nullable
  HiveSQLFromStatement getFromStatement();

  @NotNull
  List<HiveSQLPartitionColumn> getPartitionColumnList();

  @Nullable
  HiveSQLSelectStatement getSelectStatement();

  @Nullable
  PsiElement getIdentifier();

}
