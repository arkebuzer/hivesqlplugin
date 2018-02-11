package ru.hivesqlplugin;

import com.intellij.lang.Language;

public class HiveSQLLanguage extends Language {
    public static final HiveSQLLanguage INSTANCE = new HiveSQLLanguage();

    private HiveSQLLanguage() {
        super("Hive SQL");
    }
}
