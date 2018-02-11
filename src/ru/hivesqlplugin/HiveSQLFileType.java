package ru.hivesqlplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.*;

import javax.swing.*;

public class HiveSQLFileType extends LanguageFileType {
    public static final HiveSQLFileType INSTANCE = new HiveSQLFileType();

    private HiveSQLFileType() {
        super(HiveSQLLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Hive SQL file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Hive SQL language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "hsql";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return HiveSQLIcons.FILE;
    }
}