// This is a generated file. Not intended for manual editing.
package ru.hivesqlplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import ru.hivesqlplugin.psi.impl.*;

public interface HiveSQLTypes {

  IElementType ALTER_DATABASE = new HiveSQLElementType("ALTER_DATABASE");
  IElementType ARRAY_TYPE = new HiveSQLElementType("ARRAY_TYPE");
  IElementType BOOLEAN_EXPRESSION = new HiveSQLElementType("BOOLEAN_EXPRESSION");
  IElementType COMMON_TABLE_EXPRESSION = new HiveSQLElementType("COMMON_TABLE_EXPRESSION");
  IElementType COMMON_TABLE_EXPRESSION_LIST = new HiveSQLElementType("COMMON_TABLE_EXPRESSION_LIST");
  IElementType CONSTRAINT_SPECIFICATION = new HiveSQLElementType("CONSTRAINT_SPECIFICATION");
  IElementType CREATE_DATABASE = new HiveSQLElementType("CREATE_DATABASE");
  IElementType CREATE_TABLE = new HiveSQLElementType("CREATE_TABLE");
  IElementType DATA_TYPE = new HiveSQLElementType("DATA_TYPE");
  IElementType DDL = new HiveSQLElementType("DDL");
  IElementType DELETE_STATEMENT = new HiveSQLElementType("DELETE_STATEMENT");
  IElementType DML = new HiveSQLElementType("DML");
  IElementType DROP_DATABASE = new HiveSQLElementType("DROP_DATABASE");
  IElementType DROP_TABLE = new HiveSQLElementType("DROP_TABLE");
  IElementType FILE_FORMAT = new HiveSQLElementType("FILE_FORMAT");
  IElementType FROM_STATEMENT = new HiveSQLElementType("FROM_STATEMENT");
  IElementType INSERT_STATEMENT = new HiveSQLElementType("INSERT_STATEMENT");
  IElementType LOAD_DATA = new HiveSQLElementType("LOAD_DATA");
  IElementType MAP_TYPE = new HiveSQLElementType("MAP_TYPE");
  IElementType MERGE_STATEMENT = new HiveSQLElementType("MERGE_STATEMENT");
  IElementType PARTITION_COLUMN = new HiveSQLElementType("PARTITION_COLUMN");
  IElementType PRIMITIVE_TYPE = new HiveSQLElementType("PRIMITIVE_TYPE");
  IElementType QUERY = new HiveSQLElementType("QUERY");
  IElementType ROW_FORMAT = new HiveSQLElementType("ROW_FORMAT");
  IElementType SELECT_EXPR = new HiveSQLElementType("SELECT_EXPR");
  IElementType SELECT_EXPR_LIST = new HiveSQLElementType("SELECT_EXPR_LIST");
  IElementType SELECT_STATEMENT = new HiveSQLElementType("SELECT_STATEMENT");
  IElementType SET_CLAUSE_LIST = new HiveSQLElementType("SET_CLAUSE_LIST");
  IElementType STRUCT_TYPE = new HiveSQLElementType("STRUCT_TYPE");
  IElementType TRUNCATE_TABLE = new HiveSQLElementType("TRUNCATE_TABLE");
  IElementType UNION_TYPE = new HiveSQLElementType("UNION_TYPE");
  IElementType UPDATE_STATEMENT = new HiveSQLElementType("UPDATE_STATEMENT");
  IElementType USE_STATEMENT = new HiveSQLElementType("USE_STATEMENT");

  IElementType ALL = new HiveSQLTokenType("ALL");
  IElementType ALTER = new HiveSQLTokenType("ALTER");
  IElementType AND = new HiveSQLTokenType("AND");
  IElementType ARRAY = new HiveSQLTokenType("ARRAY");
  IElementType AS = new HiveSQLTokenType("AS");
  IElementType ASC = new HiveSQLTokenType("ASC");
  IElementType AVRO = new HiveSQLTokenType("AVRO");
  IElementType BIGINT = new HiveSQLTokenType("BIGINT");
  IElementType BINARY = new HiveSQLTokenType("BINARY");
  IElementType BOOLEAN = new HiveSQLTokenType("BOOLEAN");
  IElementType BUCKETS = new HiveSQLTokenType("BUCKETS");
  IElementType BY = new HiveSQLTokenType("BY");
  IElementType CASCADE = new HiveSQLTokenType("CASCADE");
  IElementType CHAR = new HiveSQLTokenType("char");
  IElementType CLUSTER = new HiveSQLTokenType("CLUSTER");
  IElementType CLUSTERED = new HiveSQLTokenType("CLUSTERED");
  IElementType COLLECTION = new HiveSQLTokenType("COLLECTION");
  IElementType COLUMN = new HiveSQLTokenType("column");
  IElementType COMMENT = new HiveSQLTokenType("COMMENT");
  IElementType CONSTRAINT = new HiveSQLTokenType("CONSTRAINT");
  IElementType CREATE = new HiveSQLTokenType("CREATE");
  IElementType DATA = new HiveSQLTokenType("DATA");
  IElementType DATABASE = new HiveSQLTokenType("DATABASE");
  IElementType DATE = new HiveSQLTokenType("DATE");
  IElementType DBPROPERTIES = new HiveSQLTokenType("DBPROPERTIES");
  IElementType DECIMAL = new HiveSQLTokenType("DECIMAL");
  IElementType DEFAULT = new HiveSQLTokenType("DEFAULT");
  IElementType DEFINED = new HiveSQLTokenType("DEFINED");
  IElementType DELETE = new HiveSQLTokenType("DELETE");
  IElementType DELIMITED = new HiveSQLTokenType("DELIMITED");
  IElementType DESC = new HiveSQLTokenType("DESC");
  IElementType DIRECTORIES = new HiveSQLTokenType("DIRECTORIES");
  IElementType DISABLE = new HiveSQLTokenType("DISABLE");
  IElementType DISTINCT = new HiveSQLTokenType("DISTINCT");
  IElementType DISTRIBUTE = new HiveSQLTokenType("DISTRIBUTE");
  IElementType DOUBLE = new HiveSQLTokenType("DOUBLE");
  IElementType DOUBLEQUOTEDSTRING = new HiveSQLTokenType("doublequotedstring");
  IElementType DROP = new HiveSQLTokenType("DROP");
  IElementType ESCAPED = new HiveSQLTokenType("ESCAPED");
  IElementType EXISTS = new HiveSQLTokenType("EXISTS");
  IElementType EXPORT = new HiveSQLTokenType("export");
  IElementType EXPR = new HiveSQLTokenType("EXPR");
  IElementType EXTERNAL = new HiveSQLTokenType("EXTERNAL");
  IElementType FIELDS = new HiveSQLTokenType("FIELDS");
  IElementType FLOAT = new HiveSQLTokenType("FLOAT");
  IElementType FOREIGN = new HiveSQLTokenType("FOREIGN");
  IElementType FORMAT = new HiveSQLTokenType("FORMAT");
  IElementType FROM = new HiveSQLTokenType("FROM");
  IElementType GROUP = new HiveSQLTokenType("GROUP");
  IElementType IDENTIFIER = new HiveSQLTokenType("identifier");
  IElementType IF = new HiveSQLTokenType("IF");
  IElementType IMPORT = new HiveSQLTokenType("import");
  IElementType INPATH = new HiveSQLTokenType("INPATH");
  IElementType INPUTFORMAT = new HiveSQLTokenType("INPUTFORMAT");
  IElementType INSERT = new HiveSQLTokenType("INSERT");
  IElementType INT = new HiveSQLTokenType("INT");
  IElementType INTEGER = new HiveSQLTokenType("integer");
  IElementType INTO = new HiveSQLTokenType("INTO");
  IElementType ITEMS = new HiveSQLTokenType("ITEMS");
  IElementType KEY = new HiveSQLTokenType("KEY");
  IElementType KEYS = new HiveSQLTokenType("KEYS");
  IElementType LIKE = new HiveSQLTokenType("LIKE");
  IElementType LIMIT = new HiveSQLTokenType("LIMIT");
  IElementType LINES = new HiveSQLTokenType("LINES");
  IElementType LOAD = new HiveSQLTokenType("LOAD");
  IElementType LOCAL = new HiveSQLTokenType("LOCAL");
  IElementType LOCATION = new HiveSQLTokenType("LOCATION");
  IElementType MAP = new HiveSQLTokenType("MAP");
  IElementType MATCHED = new HiveSQLTokenType("MATCHED");
  IElementType MERGE = new HiveSQLTokenType("MERGE");
  IElementType NOT = new HiveSQLTokenType("NOT");
  IElementType NOVALIDATE = new HiveSQLTokenType("NOVALIDATE");
  IElementType NULL = new HiveSQLTokenType("NULL");
  IElementType NUMBER = new HiveSQLTokenType("number");
  IElementType ON = new HiveSQLTokenType("ON");
  IElementType ONELINE_COMMENT = new HiveSQLTokenType("oneline_comment");
  IElementType ORC = new HiveSQLTokenType("ORC");
  IElementType ORDER = new HiveSQLTokenType("ORDER");
  IElementType OUTPUTFORMAT = new HiveSQLTokenType("OUTPUTFORMAT");
  IElementType OVERWRITE = new HiveSQLTokenType("OVERWRITE");
  IElementType OWNER = new HiveSQLTokenType("OWNER");
  IElementType PARQUET = new HiveSQLTokenType("PARQUET");
  IElementType PARTITION = new HiveSQLTokenType("PARTITION");
  IElementType PARTITIONED = new HiveSQLTokenType("PARTITIONED");
  IElementType PRECISION = new HiveSQLTokenType("PRECISION");
  IElementType PRIMARY = new HiveSQLTokenType("PRIMARY");
  IElementType PURGE = new HiveSQLTokenType("PURGE");
  IElementType RCFILE = new HiveSQLTokenType("RCFILE");
  IElementType REFERENCES = new HiveSQLTokenType("REFERENCES");
  IElementType RESTRICT = new HiveSQLTokenType("RESTRICT");
  IElementType ROLE = new HiveSQLTokenType("ROLE");
  IElementType ROW = new HiveSQLTokenType("ROW");
  IElementType S = new HiveSQLTokenType("S");
  IElementType SCHEMA = new HiveSQLTokenType("SCHEMA");
  IElementType SELECT = new HiveSQLTokenType("SELECT");
  IElementType SEQUENCEFILE = new HiveSQLTokenType("SEQUENCEFILE");
  IElementType SERDE = new HiveSQLTokenType("SERDE");
  IElementType SERDEPROPERTIES = new HiveSQLTokenType("SERDEPROPERTIES");
  IElementType SET = new HiveSQLTokenType("SET");
  IElementType SINGLEQUOTEDSTRING = new HiveSQLTokenType("singlequotedstring");
  IElementType SKEWED = new HiveSQLTokenType("SKEWED");
  IElementType SMALLINT = new HiveSQLTokenType("SMALLINT");
  IElementType SORT = new HiveSQLTokenType("SORT");
  IElementType SORTED = new HiveSQLTokenType("SORTED");
  IElementType STORED = new HiveSQLTokenType("STORED");
  IElementType STRING = new HiveSQLTokenType("string");
  IElementType STRUCT = new HiveSQLTokenType("STRUCT");
  IElementType STUB = new HiveSQLTokenType("STUB");
  IElementType T = new HiveSQLTokenType("T");
  IElementType TABLE = new HiveSQLTokenType("TABLE");
  IElementType TABLENAME = new HiveSQLTokenType("tablename");
  IElementType TBLPROPERTIES = new HiveSQLTokenType("TBLPROPERTIES");
  IElementType TEMPORARY = new HiveSQLTokenType("TEMPORARY");
  IElementType TERMINATED = new HiveSQLTokenType("TERMINATED");
  IElementType TEXTFILE = new HiveSQLTokenType("TEXTFILE");
  IElementType THEN = new HiveSQLTokenType("THEN");
  IElementType TIMESTAMP = new HiveSQLTokenType("TIMESTAMP");
  IElementType TINYINT = new HiveSQLTokenType("TINYINT");
  IElementType TRUNCATE = new HiveSQLTokenType("TRUNCATE");
  IElementType UNIONTYPE = new HiveSQLTokenType("UNIONTYPE");
  IElementType UPDATE = new HiveSQLTokenType("UPDATE");
  IElementType USE = new HiveSQLTokenType("USE");
  IElementType USER = new HiveSQLTokenType("USER");
  IElementType USING = new HiveSQLTokenType("USING");
  IElementType VALUES = new HiveSQLTokenType("VALUES");
  IElementType VARCHAR = new HiveSQLTokenType("VARCHAR");
  IElementType WHEN = new HiveSQLTokenType("WHEN");
  IElementType WHERE = new HiveSQLTokenType("WHERE");
  IElementType WITH = new HiveSQLTokenType("WITH");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ALTER_DATABASE) {
        return new HiveSQLAlterDatabaseImpl(node);
      }
      else if (type == ARRAY_TYPE) {
        return new HiveSQLArrayTypeImpl(node);
      }
      else if (type == BOOLEAN_EXPRESSION) {
        return new HiveSQLBooleanExpressionImpl(node);
      }
      else if (type == COMMON_TABLE_EXPRESSION) {
        return new HiveSQLCommonTableExpressionImpl(node);
      }
      else if (type == COMMON_TABLE_EXPRESSION_LIST) {
        return new HiveSQLCommonTableExpressionListImpl(node);
      }
      else if (type == CONSTRAINT_SPECIFICATION) {
        return new HiveSQLConstraintSpecificationImpl(node);
      }
      else if (type == CREATE_DATABASE) {
        return new HiveSQLCreateDatabaseImpl(node);
      }
      else if (type == CREATE_TABLE) {
        return new HiveSQLCreateTableImpl(node);
      }
      else if (type == DATA_TYPE) {
        return new HiveSQLDataTypeImpl(node);
      }
      else if (type == DDL) {
        return new HiveSQLDdlImpl(node);
      }
      else if (type == DELETE_STATEMENT) {
        return new HiveSQLDeleteStatementImpl(node);
      }
      else if (type == DML) {
        return new HiveSQLDmlImpl(node);
      }
      else if (type == DROP_DATABASE) {
        return new HiveSQLDropDatabaseImpl(node);
      }
      else if (type == DROP_TABLE) {
        return new HiveSQLDropTableImpl(node);
      }
      else if (type == FILE_FORMAT) {
        return new HiveSQLFileFormatImpl(node);
      }
      else if (type == FROM_STATEMENT) {
        return new HiveSQLFromStatementImpl(node);
      }
      else if (type == INSERT_STATEMENT) {
        return new HiveSQLInsertStatementImpl(node);
      }
      else if (type == LOAD_DATA) {
        return new HiveSQLLoadDataImpl(node);
      }
      else if (type == MAP_TYPE) {
        return new HiveSQLMapTypeImpl(node);
      }
      else if (type == MERGE_STATEMENT) {
        return new HiveSQLMergeStatementImpl(node);
      }
      else if (type == PARTITION_COLUMN) {
        return new HiveSQLPartitionColumnImpl(node);
      }
      else if (type == PRIMITIVE_TYPE) {
        return new HiveSQLPrimitiveTypeImpl(node);
      }
      else if (type == QUERY) {
        return new HiveSQLQueryImpl(node);
      }
      else if (type == ROW_FORMAT) {
        return new HiveSQLRowFormatImpl(node);
      }
      else if (type == SELECT_EXPR) {
        return new HiveSQLSelectExprImpl(node);
      }
      else if (type == SELECT_EXPR_LIST) {
        return new HiveSQLSelectExprListImpl(node);
      }
      else if (type == SELECT_STATEMENT) {
        return new HiveSQLSelectStatementImpl(node);
      }
      else if (type == SET_CLAUSE_LIST) {
        return new HiveSQLSetClauseListImpl(node);
      }
      else if (type == STRUCT_TYPE) {
        return new HiveSQLStructTypeImpl(node);
      }
      else if (type == TRUNCATE_TABLE) {
        return new HiveSQLTruncateTableImpl(node);
      }
      else if (type == UNION_TYPE) {
        return new HiveSQLUnionTypeImpl(node);
      }
      else if (type == UPDATE_STATEMENT) {
        return new HiveSQLUpdateStatementImpl(node);
      }
      else if (type == USE_STATEMENT) {
        return new HiveSQLUseStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
