package ru.hivesqlplugin.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.*;
import ru.hivesqlplugin.HiveSQLLanguage;

public class HiveSQLElementType extends IElementType {
    public HiveSQLElementType(@NotNull @NonNls String debugName) {
        super(debugName, HiveSQLLanguage.INSTANCE);
    }
}
