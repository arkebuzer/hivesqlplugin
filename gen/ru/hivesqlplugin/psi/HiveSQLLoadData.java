// This is a generated file. Not intended for manual editing.
package ru.hivesqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HiveSQLLoadData extends PsiElement {

  @NotNull
  List<HiveSQLPartitionColumn> getPartitionColumnList();

  @NotNull
  PsiElement getSinglequotedstring();

}
