package ru.hivesqlplugin.psi;

import com.intellij.psi.tree.IElementType;
import ru.hivesqlplugin.HiveSQLLanguage;
import org.jetbrains.annotations.*;

public class HiveSQLTokenType extends IElementType {

    public HiveSQLTokenType(@NotNull @NonNls String debugName) {
        super(debugName, HiveSQLLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "HiveSQLTokenType." + super.toString();
    }
}
