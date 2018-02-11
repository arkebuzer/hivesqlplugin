// This is a generated file. Not intended for manual editing.
package ru.hivesqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HiveSQLDdl extends PsiElement {

  @Nullable
  HiveSQLAlterDatabase getAlterDatabase();

  @Nullable
  HiveSQLCreateDatabase getCreateDatabase();

  @Nullable
  HiveSQLCreateTable getCreateTable();

  @Nullable
  HiveSQLDropDatabase getDropDatabase();

  @Nullable
  HiveSQLDropTable getDropTable();

  @Nullable
  HiveSQLTruncateTable getTruncateTable();

  @Nullable
  HiveSQLUseStatement getUseStatement();

}
