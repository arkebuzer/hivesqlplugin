// This is a generated file. Not intended for manual editing.
package ru.hivesqlplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static ru.hivesqlplugin.psi.HiveSQLTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class HiveSQLParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ALTER_DATABASE) {
      r = alter_database(b, 0);
    }
    else if (t == ARRAY_TYPE) {
      r = array_type(b, 0);
    }
    else if (t == BOOLEAN_EXPRESSION) {
      r = boolean_expression(b, 0);
    }
    else if (t == COMMON_TABLE_EXPRESSION) {
      r = common_table_expression(b, 0);
    }
    else if (t == COMMON_TABLE_EXPRESSION_LIST) {
      r = common_table_expression_list(b, 0);
    }
    else if (t == CONSTRAINT_SPECIFICATION) {
      r = constraint_specification(b, 0);
    }
    else if (t == CREATE_DATABASE) {
      r = create_database(b, 0);
    }
    else if (t == CREATE_TABLE) {
      r = create_table(b, 0);
    }
    else if (t == DATA_TYPE) {
      r = data_type(b, 0);
    }
    else if (t == DDL) {
      r = ddl(b, 0);
    }
    else if (t == DELETE_STATEMENT) {
      r = delete_statement(b, 0);
    }
    else if (t == DML) {
      r = dml(b, 0);
    }
    else if (t == DROP_DATABASE) {
      r = drop_database(b, 0);
    }
    else if (t == DROP_TABLE) {
      r = drop_table(b, 0);
    }
    else if (t == FILE_FORMAT) {
      r = file_format(b, 0);
    }
    else if (t == FROM_STATEMENT) {
      r = from_statement(b, 0);
    }
    else if (t == INSERT_STATEMENT) {
      r = insert_statement(b, 0);
    }
    else if (t == LOAD_DATA) {
      r = load_data(b, 0);
    }
    else if (t == MAP_TYPE) {
      r = map_type(b, 0);
    }
    else if (t == MERGE_STATEMENT) {
      r = merge_statement(b, 0);
    }
    else if (t == PARTITION_COLUMN) {
      r = partition_column(b, 0);
    }
    else if (t == PRIMITIVE_TYPE) {
      r = primitive_type(b, 0);
    }
    else if (t == QUERY) {
      r = query(b, 0);
    }
    else if (t == ROW_FORMAT) {
      r = row_format(b, 0);
    }
    else if (t == SELECT_EXPR) {
      r = select_expr(b, 0);
    }
    else if (t == SELECT_EXPR_LIST) {
      r = select_expr_list(b, 0);
    }
    else if (t == SELECT_STATEMENT) {
      r = select_statement(b, 0);
    }
    else if (t == SET_CLAUSE_LIST) {
      r = set_clause_list(b, 0);
    }
    else if (t == STRUCT_TYPE) {
      r = struct_type(b, 0);
    }
    else if (t == TRUNCATE_TABLE) {
      r = truncate_table(b, 0);
    }
    else if (t == UNION_TYPE) {
      r = union_type(b, 0);
    }
    else if (t == UPDATE_STATEMENT) {
      r = update_statement(b, 0);
    }
    else if (t == USE_STATEMENT) {
      r = use_statement(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return hsqlFile(b, l + 1);
  }

  /* ********************************************************** */
  // ALTER (DATABASE|SCHEMA) database_name SET DBPROPERTIES db_properties |
  //     ALTER (DATABASE|SCHEMA) database_name SET OWNER [USER|ROLE] user_or_role |
  //     ALTER (DATABASE|SCHEMA) database_name SET LOCATION hdfs_path
  public static boolean alter_database(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alter_database")) return false;
    if (!nextTokenIs(b, ALTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = alter_database_0(b, l + 1);
    if (!r) r = alter_database_1(b, l + 1);
    if (!r) r = alter_database_2(b, l + 1);
    exit_section_(b, m, ALTER_DATABASE, r);
    return r;
  }

  // ALTER (DATABASE|SCHEMA) database_name SET DBPROPERTIES db_properties
  private static boolean alter_database_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alter_database_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ALTER);
    r = r && alter_database_0_1(b, l + 1);
    r = r && database_name(b, l + 1);
    r = r && consumeTokens(b, 0, SET, DBPROPERTIES);
    r = r && db_properties(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DATABASE|SCHEMA
  private static boolean alter_database_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alter_database_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DATABASE);
    if (!r) r = consumeToken(b, SCHEMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // ALTER (DATABASE|SCHEMA) database_name SET OWNER [USER|ROLE] user_or_role
  private static boolean alter_database_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alter_database_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ALTER);
    r = r && alter_database_1_1(b, l + 1);
    r = r && database_name(b, l + 1);
    r = r && consumeTokens(b, 0, SET, OWNER);
    r = r && alter_database_1_5(b, l + 1);
    r = r && user_or_role(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DATABASE|SCHEMA
  private static boolean alter_database_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alter_database_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DATABASE);
    if (!r) r = consumeToken(b, SCHEMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // [USER|ROLE]
  private static boolean alter_database_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alter_database_1_5")) return false;
    alter_database_1_5_0(b, l + 1);
    return true;
  }

  // USER|ROLE
  private static boolean alter_database_1_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alter_database_1_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USER);
    if (!r) r = consumeToken(b, ROLE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ALTER (DATABASE|SCHEMA) database_name SET LOCATION hdfs_path
  private static boolean alter_database_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alter_database_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ALTER);
    r = r && alter_database_2_1(b, l + 1);
    r = r && database_name(b, l + 1);
    r = r && consumeTokens(b, 0, SET, LOCATION);
    r = r && hdfs_path(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DATABASE|SCHEMA
  private static boolean alter_database_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alter_database_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DATABASE);
    if (!r) r = consumeToken(b, SCHEMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ARRAY '<'data_type'>'
  public static boolean array_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type")) return false;
    if (!nextTokenIs(b, ARRAY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARRAY);
    r = r && consumeToken(b, "<");
    r = r && data_type(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, m, ARRAY_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // EXPR
  public static boolean boolean_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_expression")) return false;
    if (!nextTokenIs(b, EXPR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXPR);
    exit_section_(b, m, BOOLEAN_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // singlequotedstring
  static boolean col_comment(PsiBuilder b, int l) {
    return consumeToken(b, SINGLEQUOTEDSTRING);
  }

  /* ********************************************************** */
  // identifier
  static boolean col_name(PsiBuilder b, int l) {
    return consumeToken(b, IDENTIFIER);
  }

  /* ********************************************************** */
  // col_name (',' col_name)
  static boolean columns_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "columns_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = col_name(b, l + 1);
    r = r && columns_list_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ',' col_name
  private static boolean columns_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "columns_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && col_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // col_name data_type [COMMENT col_comment](',' col_name data_type [COMMENT col_comment])*
  static boolean columns_list_with_types_and_opt_comments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "columns_list_with_types_and_opt_comments")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = col_name(b, l + 1);
    r = r && data_type(b, l + 1);
    r = r && columns_list_with_types_and_opt_comments_2(b, l + 1);
    r = r && columns_list_with_types_and_opt_comments_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMENT col_comment]
  private static boolean columns_list_with_types_and_opt_comments_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "columns_list_with_types_and_opt_comments_2")) return false;
    columns_list_with_types_and_opt_comments_2_0(b, l + 1);
    return true;
  }

  // COMMENT col_comment
  private static boolean columns_list_with_types_and_opt_comments_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "columns_list_with_types_and_opt_comments_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMENT);
    r = r && col_comment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' col_name data_type [COMMENT col_comment])*
  private static boolean columns_list_with_types_and_opt_comments_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "columns_list_with_types_and_opt_comments_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!columns_list_with_types_and_opt_comments_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "columns_list_with_types_and_opt_comments_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' col_name data_type [COMMENT col_comment]
  private static boolean columns_list_with_types_and_opt_comments_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "columns_list_with_types_and_opt_comments_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && col_name(b, l + 1);
    r = r && data_type(b, l + 1);
    r = r && columns_list_with_types_and_opt_comments_3_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMENT col_comment]
  private static boolean columns_list_with_types_and_opt_comments_3_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "columns_list_with_types_and_opt_comments_3_0_3")) return false;
    columns_list_with_types_and_opt_comments_3_0_3_0(b, l + 1);
    return true;
  }

  // COMMENT col_comment
  private static boolean columns_list_with_types_and_opt_comments_3_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "columns_list_with_types_and_opt_comments_3_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMENT);
    r = r && col_comment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STUB
  public static boolean common_table_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "common_table_expression")) return false;
    if (!nextTokenIs(b, STUB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STUB);
    exit_section_(b, m, COMMON_TABLE_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // common_table_expression (',' common_table_expression)*
  public static boolean common_table_expression_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "common_table_expression_list")) return false;
    if (!nextTokenIs(b, STUB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = common_table_expression(b, l + 1);
    r = r && common_table_expression_list_1(b, l + 1);
    exit_section_(b, m, COMMON_TABLE_EXPRESSION_LIST, r);
    return r;
  }

  // (',' common_table_expression)*
  private static boolean common_table_expression_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "common_table_expression_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!common_table_expression_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "common_table_expression_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' common_table_expression
  private static boolean common_table_expression_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "common_table_expression_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && common_table_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  static boolean constraint_name(PsiBuilder b, int l) {
    return consumeToken(b, IDENTIFIER);
  }

  /* ********************************************************** */
  // [',' PRIMARY KEY (columns_list) DISABLE NOVALIDATE ]
  //                              [',' CONSTRAINT constraint_name FOREIGN KEY (columns_list) REFERENCES table_name(columns_list) DISABLE NOVALIDATE]
  public static boolean constraint_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRAINT_SPECIFICATION, "<constraint specification>");
    r = constraint_specification_0(b, l + 1);
    r = r && constraint_specification_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [',' PRIMARY KEY (columns_list) DISABLE NOVALIDATE ]
  private static boolean constraint_specification_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint_specification_0")) return false;
    constraint_specification_0_0(b, l + 1);
    return true;
  }

  // ',' PRIMARY KEY (columns_list) DISABLE NOVALIDATE
  private static boolean constraint_specification_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint_specification_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && consumeTokens(b, 0, PRIMARY, KEY);
    r = r && constraint_specification_0_0_3(b, l + 1);
    r = r && consumeTokens(b, 0, DISABLE, NOVALIDATE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (columns_list)
  private static boolean constraint_specification_0_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint_specification_0_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = columns_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',' CONSTRAINT constraint_name FOREIGN KEY (columns_list) REFERENCES table_name(columns_list) DISABLE NOVALIDATE]
  private static boolean constraint_specification_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint_specification_1")) return false;
    constraint_specification_1_0(b, l + 1);
    return true;
  }

  // ',' CONSTRAINT constraint_name FOREIGN KEY (columns_list) REFERENCES table_name(columns_list) DISABLE NOVALIDATE
  private static boolean constraint_specification_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint_specification_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && consumeToken(b, CONSTRAINT);
    r = r && constraint_name(b, l + 1);
    r = r && consumeTokens(b, 0, FOREIGN, KEY);
    r = r && constraint_specification_1_0_5(b, l + 1);
    r = r && consumeToken(b, REFERENCES);
    r = r && table_name(b, l + 1);
    r = r && constraint_specification_1_0_8(b, l + 1);
    r = r && consumeTokens(b, 0, DISABLE, NOVALIDATE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (columns_list)
  private static boolean constraint_specification_1_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint_specification_1_0_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = columns_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (columns_list)
  private static boolean constraint_specification_1_0_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint_specification_1_0_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = columns_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CREATE (DATABASE|SCHEMA) [IF NOT EXISTS] database_name
  //                       [COMMENT database_comment]
  //                       [LOCATION hdfs_path]
  //                       [WITH DBPROPERTIES db_properties]
  public static boolean create_database(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_database")) return false;
    if (!nextTokenIs(b, CREATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CREATE);
    r = r && create_database_1(b, l + 1);
    r = r && create_database_2(b, l + 1);
    r = r && database_name(b, l + 1);
    r = r && create_database_4(b, l + 1);
    r = r && create_database_5(b, l + 1);
    r = r && create_database_6(b, l + 1);
    exit_section_(b, m, CREATE_DATABASE, r);
    return r;
  }

  // DATABASE|SCHEMA
  private static boolean create_database_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_database_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DATABASE);
    if (!r) r = consumeToken(b, SCHEMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // [IF NOT EXISTS]
  private static boolean create_database_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_database_2")) return false;
    parseTokens(b, 0, IF, NOT, EXISTS);
    return true;
  }

  // [COMMENT database_comment]
  private static boolean create_database_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_database_4")) return false;
    create_database_4_0(b, l + 1);
    return true;
  }

  // COMMENT database_comment
  private static boolean create_database_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_database_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMENT);
    r = r && database_comment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [LOCATION hdfs_path]
  private static boolean create_database_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_database_5")) return false;
    create_database_5_0(b, l + 1);
    return true;
  }

  // LOCATION hdfs_path
  private static boolean create_database_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_database_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOCATION);
    r = r && hdfs_path(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [WITH DBPROPERTIES db_properties]
  private static boolean create_database_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_database_6")) return false;
    create_database_6_0(b, l + 1);
    return true;
  }

  // WITH DBPROPERTIES db_properties
  private static boolean create_database_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_database_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WITH, DBPROPERTIES);
    r = r && db_properties(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CREATE [TEMPORARY] [EXTERNAL] TABLE [IF NOT EXISTS] [database_name'.']table_name
  //                    [(columns_list_with_types_and_opt_comments [constraint_specification])]
  //                    [COMMENT table_comment]
  //                    [PARTITIONED BY (columns_list_with_types_and_opt_comments)]
  //                    [CLUSTERED BY (columns_list) [SORTED BY (col_name [ASC|DESC] (',' col_name [ASC|DESC])+ )] INTO num_buckets BUCKETS]
  //                    [SKEWED BY (columns_list)
  //                       ON ((columns_list) (',' (columns_list))+ )
  //                       [STORED AS DIRECTORIES]
  //                    ]
  //                    [
  //                       ROW FORMAT row_format
  //                       | STORED AS file_format
  //                       | ROW FORMAT row_format STORED AS file_format
  //                       | STORED BY 'storage.handler.class.name' [WITH SERDEPROPERTIES (serde_properties)]
  //                    ]
  //                    [LOCATION hdfs_path]
  //                    [TBLPROPERTIES (table_properties)]
  //                    [AS select_statement]
  //                  | CREATE [TEMPORARY] [EXTERNAL] TABLE [IF NOT EXISTS] [database_name'.']table_name
  //                    LIKE existing_table_or_view_name
  //                    [LOCATION hdfs_path]
  public static boolean create_table(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table")) return false;
    if (!nextTokenIs(b, CREATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = create_table_0(b, l + 1);
    if (!r) r = create_table_1(b, l + 1);
    exit_section_(b, m, CREATE_TABLE, r);
    return r;
  }

  // CREATE [TEMPORARY] [EXTERNAL] TABLE [IF NOT EXISTS] [database_name'.']table_name
  //                    [(columns_list_with_types_and_opt_comments [constraint_specification])]
  //                    [COMMENT table_comment]
  //                    [PARTITIONED BY (columns_list_with_types_and_opt_comments)]
  //                    [CLUSTERED BY (columns_list) [SORTED BY (col_name [ASC|DESC] (',' col_name [ASC|DESC])+ )] INTO num_buckets BUCKETS]
  //                    [SKEWED BY (columns_list)
  //                       ON ((columns_list) (',' (columns_list))+ )
  //                       [STORED AS DIRECTORIES]
  //                    ]
  //                    [
  //                       ROW FORMAT row_format
  //                       | STORED AS file_format
  //                       | ROW FORMAT row_format STORED AS file_format
  //                       | STORED BY 'storage.handler.class.name' [WITH SERDEPROPERTIES (serde_properties)]
  //                    ]
  //                    [LOCATION hdfs_path]
  //                    [TBLPROPERTIES (table_properties)]
  //                    [AS select_statement]
  private static boolean create_table_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CREATE);
    r = r && create_table_0_1(b, l + 1);
    r = r && create_table_0_2(b, l + 1);
    r = r && consumeToken(b, TABLE);
    r = r && create_table_0_4(b, l + 1);
    r = r && create_table_0_5(b, l + 1);
    r = r && table_name(b, l + 1);
    r = r && create_table_0_7(b, l + 1);
    r = r && create_table_0_8(b, l + 1);
    r = r && create_table_0_9(b, l + 1);
    r = r && create_table_0_10(b, l + 1);
    r = r && create_table_0_11(b, l + 1);
    r = r && create_table_0_12(b, l + 1);
    r = r && create_table_0_13(b, l + 1);
    r = r && create_table_0_14(b, l + 1);
    r = r && create_table_0_15(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [TEMPORARY]
  private static boolean create_table_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_1")) return false;
    consumeToken(b, TEMPORARY);
    return true;
  }

  // [EXTERNAL]
  private static boolean create_table_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_2")) return false;
    consumeToken(b, EXTERNAL);
    return true;
  }

  // [IF NOT EXISTS]
  private static boolean create_table_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_4")) return false;
    parseTokens(b, 0, IF, NOT, EXISTS);
    return true;
  }

  // [database_name'.']
  private static boolean create_table_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_5")) return false;
    create_table_0_5_0(b, l + 1);
    return true;
  }

  // database_name'.'
  private static boolean create_table_0_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = database_name(b, l + 1);
    r = r && consumeToken(b, ".");
    exit_section_(b, m, null, r);
    return r;
  }

  // [(columns_list_with_types_and_opt_comments [constraint_specification])]
  private static boolean create_table_0_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_7")) return false;
    create_table_0_7_0(b, l + 1);
    return true;
  }

  // columns_list_with_types_and_opt_comments [constraint_specification]
  private static boolean create_table_0_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = columns_list_with_types_and_opt_comments(b, l + 1);
    r = r && create_table_0_7_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [constraint_specification]
  private static boolean create_table_0_7_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_7_0_1")) return false;
    constraint_specification(b, l + 1);
    return true;
  }

  // [COMMENT table_comment]
  private static boolean create_table_0_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_8")) return false;
    create_table_0_8_0(b, l + 1);
    return true;
  }

  // COMMENT table_comment
  private static boolean create_table_0_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMENT);
    r = r && table_comment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [PARTITIONED BY (columns_list_with_types_and_opt_comments)]
  private static boolean create_table_0_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_9")) return false;
    create_table_0_9_0(b, l + 1);
    return true;
  }

  // PARTITIONED BY (columns_list_with_types_and_opt_comments)
  private static boolean create_table_0_9_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_9_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PARTITIONED, BY);
    r = r && create_table_0_9_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (columns_list_with_types_and_opt_comments)
  private static boolean create_table_0_9_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_9_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = columns_list_with_types_and_opt_comments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [CLUSTERED BY (columns_list) [SORTED BY (col_name [ASC|DESC] (',' col_name [ASC|DESC])+ )] INTO num_buckets BUCKETS]
  private static boolean create_table_0_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_10")) return false;
    create_table_0_10_0(b, l + 1);
    return true;
  }

  // CLUSTERED BY (columns_list) [SORTED BY (col_name [ASC|DESC] (',' col_name [ASC|DESC])+ )] INTO num_buckets BUCKETS
  private static boolean create_table_0_10_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_10_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CLUSTERED, BY);
    r = r && create_table_0_10_0_2(b, l + 1);
    r = r && create_table_0_10_0_3(b, l + 1);
    r = r && consumeToken(b, INTO);
    r = r && num_buckets(b, l + 1);
    r = r && consumeToken(b, BUCKETS);
    exit_section_(b, m, null, r);
    return r;
  }

  // (columns_list)
  private static boolean create_table_0_10_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_10_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = columns_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [SORTED BY (col_name [ASC|DESC] (',' col_name [ASC|DESC])+ )]
  private static boolean create_table_0_10_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_10_0_3")) return false;
    create_table_0_10_0_3_0(b, l + 1);
    return true;
  }

  // SORTED BY (col_name [ASC|DESC] (',' col_name [ASC|DESC])+ )
  private static boolean create_table_0_10_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_10_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SORTED, BY);
    r = r && create_table_0_10_0_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // col_name [ASC|DESC] (',' col_name [ASC|DESC])+
  private static boolean create_table_0_10_0_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_10_0_3_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = col_name(b, l + 1);
    r = r && create_table_0_10_0_3_0_2_1(b, l + 1);
    r = r && create_table_0_10_0_3_0_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ASC|DESC]
  private static boolean create_table_0_10_0_3_0_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_10_0_3_0_2_1")) return false;
    create_table_0_10_0_3_0_2_1_0(b, l + 1);
    return true;
  }

  // ASC|DESC
  private static boolean create_table_0_10_0_3_0_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_10_0_3_0_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASC);
    if (!r) r = consumeToken(b, DESC);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' col_name [ASC|DESC])+
  private static boolean create_table_0_10_0_3_0_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_10_0_3_0_2_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = create_table_0_10_0_3_0_2_2_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!create_table_0_10_0_3_0_2_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "create_table_0_10_0_3_0_2_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ',' col_name [ASC|DESC]
  private static boolean create_table_0_10_0_3_0_2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_10_0_3_0_2_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && col_name(b, l + 1);
    r = r && create_table_0_10_0_3_0_2_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ASC|DESC]
  private static boolean create_table_0_10_0_3_0_2_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_10_0_3_0_2_2_0_2")) return false;
    create_table_0_10_0_3_0_2_2_0_2_0(b, l + 1);
    return true;
  }

  // ASC|DESC
  private static boolean create_table_0_10_0_3_0_2_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_10_0_3_0_2_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASC);
    if (!r) r = consumeToken(b, DESC);
    exit_section_(b, m, null, r);
    return r;
  }

  // [SKEWED BY (columns_list)
  //                       ON ((columns_list) (',' (columns_list))+ )
  //                       [STORED AS DIRECTORIES]
  //                    ]
  private static boolean create_table_0_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_11")) return false;
    create_table_0_11_0(b, l + 1);
    return true;
  }

  // SKEWED BY (columns_list)
  //                       ON ((columns_list) (',' (columns_list))+ )
  //                       [STORED AS DIRECTORIES]
  private static boolean create_table_0_11_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_11_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SKEWED, BY);
    r = r && create_table_0_11_0_2(b, l + 1);
    r = r && consumeToken(b, ON);
    r = r && create_table_0_11_0_4(b, l + 1);
    r = r && create_table_0_11_0_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (columns_list)
  private static boolean create_table_0_11_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_11_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = columns_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (columns_list) (',' (columns_list))+
  private static boolean create_table_0_11_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_11_0_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = create_table_0_11_0_4_0(b, l + 1);
    r = r && create_table_0_11_0_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (columns_list)
  private static boolean create_table_0_11_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_11_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = columns_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' (columns_list))+
  private static boolean create_table_0_11_0_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_11_0_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = create_table_0_11_0_4_1_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!create_table_0_11_0_4_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "create_table_0_11_0_4_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ',' (columns_list)
  private static boolean create_table_0_11_0_4_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_11_0_4_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && create_table_0_11_0_4_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (columns_list)
  private static boolean create_table_0_11_0_4_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_11_0_4_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = columns_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [STORED AS DIRECTORIES]
  private static boolean create_table_0_11_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_11_0_5")) return false;
    parseTokens(b, 0, STORED, AS, DIRECTORIES);
    return true;
  }

  // [
  //                       ROW FORMAT row_format
  //                       | STORED AS file_format
  //                       | ROW FORMAT row_format STORED AS file_format
  //                       | STORED BY 'storage.handler.class.name' [WITH SERDEPROPERTIES (serde_properties)]
  //                    ]
  private static boolean create_table_0_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_12")) return false;
    create_table_0_12_0(b, l + 1);
    return true;
  }

  // ROW FORMAT row_format
  //                       | STORED AS file_format
  //                       | ROW FORMAT row_format STORED AS file_format
  //                       | STORED BY 'storage.handler.class.name' [WITH SERDEPROPERTIES (serde_properties)]
  private static boolean create_table_0_12_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_12_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = create_table_0_12_0_0(b, l + 1);
    if (!r) r = create_table_0_12_0_1(b, l + 1);
    if (!r) r = create_table_0_12_0_2(b, l + 1);
    if (!r) r = create_table_0_12_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ROW FORMAT row_format
  private static boolean create_table_0_12_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_12_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ROW, FORMAT);
    r = r && row_format(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STORED AS file_format
  private static boolean create_table_0_12_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_12_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STORED, AS);
    r = r && file_format(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ROW FORMAT row_format STORED AS file_format
  private static boolean create_table_0_12_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_12_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ROW, FORMAT);
    r = r && row_format(b, l + 1);
    r = r && consumeTokens(b, 0, STORED, AS);
    r = r && file_format(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STORED BY 'storage.handler.class.name' [WITH SERDEPROPERTIES (serde_properties)]
  private static boolean create_table_0_12_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_12_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STORED, BY);
    r = r && consumeToken(b, "storage.handler.class.name");
    r = r && create_table_0_12_0_3_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [WITH SERDEPROPERTIES (serde_properties)]
  private static boolean create_table_0_12_0_3_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_12_0_3_3")) return false;
    create_table_0_12_0_3_3_0(b, l + 1);
    return true;
  }

  // WITH SERDEPROPERTIES (serde_properties)
  private static boolean create_table_0_12_0_3_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_12_0_3_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WITH, SERDEPROPERTIES);
    r = r && create_table_0_12_0_3_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (serde_properties)
  private static boolean create_table_0_12_0_3_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_12_0_3_3_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = serde_properties(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [LOCATION hdfs_path]
  private static boolean create_table_0_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_13")) return false;
    create_table_0_13_0(b, l + 1);
    return true;
  }

  // LOCATION hdfs_path
  private static boolean create_table_0_13_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_13_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOCATION);
    r = r && hdfs_path(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [TBLPROPERTIES (table_properties)]
  private static boolean create_table_0_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_14")) return false;
    create_table_0_14_0(b, l + 1);
    return true;
  }

  // TBLPROPERTIES (table_properties)
  private static boolean create_table_0_14_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_14_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TBLPROPERTIES);
    r = r && create_table_0_14_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (table_properties)
  private static boolean create_table_0_14_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_14_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = table_properties(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [AS select_statement]
  private static boolean create_table_0_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_15")) return false;
    create_table_0_15_0(b, l + 1);
    return true;
  }

  // AS select_statement
  private static boolean create_table_0_15_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_0_15_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AS);
    r = r && select_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CREATE [TEMPORARY] [EXTERNAL] TABLE [IF NOT EXISTS] [database_name'.']table_name
  //                    LIKE existing_table_or_view_name
  //                    [LOCATION hdfs_path]
  private static boolean create_table_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CREATE);
    r = r && create_table_1_1(b, l + 1);
    r = r && create_table_1_2(b, l + 1);
    r = r && consumeToken(b, TABLE);
    r = r && create_table_1_4(b, l + 1);
    r = r && create_table_1_5(b, l + 1);
    r = r && table_name(b, l + 1);
    r = r && consumeToken(b, LIKE);
    r = r && existing_table_or_view_name(b, l + 1);
    r = r && create_table_1_9(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [TEMPORARY]
  private static boolean create_table_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_1_1")) return false;
    consumeToken(b, TEMPORARY);
    return true;
  }

  // [EXTERNAL]
  private static boolean create_table_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_1_2")) return false;
    consumeToken(b, EXTERNAL);
    return true;
  }

  // [IF NOT EXISTS]
  private static boolean create_table_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_1_4")) return false;
    parseTokens(b, 0, IF, NOT, EXISTS);
    return true;
  }

  // [database_name'.']
  private static boolean create_table_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_1_5")) return false;
    create_table_1_5_0(b, l + 1);
    return true;
  }

  // database_name'.'
  private static boolean create_table_1_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_1_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = database_name(b, l + 1);
    r = r && consumeToken(b, ".");
    exit_section_(b, m, null, r);
    return r;
  }

  // [LOCATION hdfs_path]
  private static boolean create_table_1_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_1_9")) return false;
    create_table_1_9_0(b, l + 1);
    return true;
  }

  // LOCATION hdfs_path
  private static boolean create_table_1_9_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_1_9_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOCATION);
    r = r && hdfs_path(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // primitive_type
  //                | array_type
  //                | map_type
  //                | struct_type
  //                | union_type
  public static boolean data_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_TYPE, "<data type>");
    r = primitive_type(b, l + 1);
    if (!r) r = array_type(b, l + 1);
    if (!r) r = map_type(b, l + 1);
    if (!r) r = struct_type(b, l + 1);
    if (!r) r = union_type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // singlequotedstring
  static boolean database_comment(PsiBuilder b, int l) {
    return consumeToken(b, SINGLEQUOTEDSTRING);
  }

  /* ********************************************************** */
  // identifier
  static boolean database_name(PsiBuilder b, int l) {
    return consumeToken(b, IDENTIFIER);
  }

  /* ********************************************************** */
  // '('property_name'='property_value(','property_name'='property_value)*')'
  static boolean db_properties(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "db_properties")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && property_name(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && property_value(b, l + 1);
    r = r && db_properties_4(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // (','property_name'='property_value)*
  private static boolean db_properties_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "db_properties_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!db_properties_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "db_properties_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','property_name'='property_value
  private static boolean db_properties_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "db_properties_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && property_name(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && property_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // create_database|drop_database|alter_database|use_statement|create_table|drop_table|truncate_table
  public static boolean ddl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ddl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DDL, "<ddl>");
    r = create_database(b, l + 1);
    if (!r) r = drop_database(b, l + 1);
    if (!r) r = alter_database(b, l + 1);
    if (!r) r = use_statement(b, l + 1);
    if (!r) r = create_table(b, l + 1);
    if (!r) r = drop_table(b, l + 1);
    if (!r) r = truncate_table(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DELETE FROM table_name [WHERE boolean_expression]
  public static boolean delete_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delete_statement")) return false;
    if (!nextTokenIs(b, DELETE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DELETE, FROM);
    r = r && table_name(b, l + 1);
    r = r && delete_statement_3(b, l + 1);
    exit_section_(b, m, DELETE_STATEMENT, r);
    return r;
  }

  // [WHERE boolean_expression]
  private static boolean delete_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delete_statement_3")) return false;
    delete_statement_3_0(b, l + 1);
    return true;
  }

  // WHERE boolean_expression
  private static boolean delete_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delete_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHERE);
    r = r && boolean_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // select_statement|load_data|insert_statement|delete_statement|update_statement|merge_statement|import|export
  public static boolean dml(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dml")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DML, "<dml>");
    r = select_statement(b, l + 1);
    if (!r) r = load_data(b, l + 1);
    if (!r) r = insert_statement(b, l + 1);
    if (!r) r = delete_statement(b, l + 1);
    if (!r) r = update_statement(b, l + 1);
    if (!r) r = merge_statement(b, l + 1);
    if (!r) r = consumeToken(b, IMPORT);
    if (!r) r = consumeToken(b, EXPORT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DROP (DATABASE|SCHEMA) [IF EXISTS] database_name [RESTRICT|CASCADE]
  public static boolean drop_database(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_database")) return false;
    if (!nextTokenIs(b, DROP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DROP);
    r = r && drop_database_1(b, l + 1);
    r = r && drop_database_2(b, l + 1);
    r = r && database_name(b, l + 1);
    r = r && drop_database_4(b, l + 1);
    exit_section_(b, m, DROP_DATABASE, r);
    return r;
  }

  // DATABASE|SCHEMA
  private static boolean drop_database_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_database_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DATABASE);
    if (!r) r = consumeToken(b, SCHEMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // [IF EXISTS]
  private static boolean drop_database_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_database_2")) return false;
    parseTokens(b, 0, IF, EXISTS);
    return true;
  }

  // [RESTRICT|CASCADE]
  private static boolean drop_database_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_database_4")) return false;
    drop_database_4_0(b, l + 1);
    return true;
  }

  // RESTRICT|CASCADE
  private static boolean drop_database_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_database_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RESTRICT);
    if (!r) r = consumeToken(b, CASCADE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DROP TABLE [IF EXISTS] table_name [PURGE]
  public static boolean drop_table(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_table")) return false;
    if (!nextTokenIs(b, DROP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DROP, TABLE);
    r = r && drop_table_2(b, l + 1);
    r = r && table_name(b, l + 1);
    r = r && drop_table_4(b, l + 1);
    exit_section_(b, m, DROP_TABLE, r);
    return r;
  }

  // [IF EXISTS]
  private static boolean drop_table_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_table_2")) return false;
    parseTokens(b, 0, IF, EXISTS);
    return true;
  }

  // [PURGE]
  private static boolean drop_table_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_table_4")) return false;
    consumeToken(b, PURGE);
    return true;
  }

  /* ********************************************************** */
  // identifier
  static boolean existing_table_or_view_name(PsiBuilder b, int l) {
    return consumeToken(b, IDENTIFIER);
  }

  /* ********************************************************** */
  // SEQUENCEFILE
  //                 | TEXTFILE
  //                 | RCFILE
  //                 | ORC
  //                 | PARQUET
  //                 | AVRO
  //                 | INPUTFORMAT input_format_classname OUTPUTFORMAT output_format_classname
  public static boolean file_format(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_format")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FILE_FORMAT, "<file format>");
    r = consumeToken(b, SEQUENCEFILE);
    if (!r) r = consumeToken(b, TEXTFILE);
    if (!r) r = consumeToken(b, RCFILE);
    if (!r) r = consumeToken(b, ORC);
    if (!r) r = consumeToken(b, PARQUET);
    if (!r) r = consumeToken(b, AVRO);
    if (!r) r = file_format_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // INPUTFORMAT input_format_classname OUTPUTFORMAT output_format_classname
  private static boolean file_format_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_format_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INPUTFORMAT);
    r = r && input_format_classname(b, l + 1);
    r = r && consumeToken(b, OUTPUTFORMAT);
    r = r && output_format_classname(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // singlequotedstring
  static boolean file_path(PsiBuilder b, int l) {
    return consumeToken(b, SINGLEQUOTEDSTRING);
  }

  /* ********************************************************** */
  // FROM
  public static boolean from_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "from_statement")) return false;
    if (!nextTokenIs(b, FROM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FROM);
    exit_section_(b, m, FROM_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // singlequotedstring
  static boolean hdfs_path(PsiBuilder b, int l) {
    return consumeToken(b, SINGLEQUOTEDSTRING);
  }

  /* ********************************************************** */
  // queries_*
  static boolean hsqlFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hsqlFile")) return false;
    int c = current_position_(b);
    while (true) {
      if (!queries_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "hsqlFile", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // singlequotedstring
  static boolean input_format_classname(PsiBuilder b, int l) {
    return consumeToken(b, SINGLEQUOTEDSTRING);
  }

  /* ********************************************************** */
  // INSERT OVERWRITE TABLE table_name [PARTITION (partition_spec) [IF NOT EXISTS]] select_statement FROM from_statement
  //            | INSERT INTO TABLE table_name [PARTITION (partition_spec)] select_statement FROM from_statement
  //            // Hive extension (multiple inserts):
  //            | FROM from_statement
  //            (INSERT OVERWRITE TABLE table_name [PARTITION (partition_spec) [IF NOT EXISTS]] select_statement |
  //            INSERT INTO TABLE table_name [PARTITION (partition_spec)] select_statement)
  //            (INSERT OVERWRITE TABLE table_name [PARTITION (partition_spec) [IF NOT EXISTS]] select_statement |
  //                       INSERT INTO TABLE table_name [PARTITION (partition_spec)] select_statement)*
  //            // Hive extension (dynamic partition inserts):
  //            | INSERT OVERWRITE TABLE tablename PARTITION (partition_columns_with_optional_values) select_statement FROM from_statement
  //            | INSERT INTO TABLE tablename PARTITION (partition_columns_with_optional_values) select_statement FROM from_statement
  //            // ToDo: add Writing data into the filesystem from queries
  //            // Standard Syntax:
  //            | INSERT INTO TABLE tablename [PARTITION (partition_columns_with_optional_values)] VALUES values_row (',' values_row)*
  public static boolean insert_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement")) return false;
    if (!nextTokenIs(b, "<insert statement>", FROM, INSERT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INSERT_STATEMENT, "<insert statement>");
    r = insert_statement_0(b, l + 1);
    if (!r) r = insert_statement_1(b, l + 1);
    if (!r) r = insert_statement_2(b, l + 1);
    if (!r) r = insert_statement_3(b, l + 1);
    if (!r) r = insert_statement_4(b, l + 1);
    if (!r) r = insert_statement_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // INSERT OVERWRITE TABLE table_name [PARTITION (partition_spec) [IF NOT EXISTS]] select_statement FROM from_statement
  private static boolean insert_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INSERT, OVERWRITE, TABLE);
    r = r && table_name(b, l + 1);
    r = r && insert_statement_0_4(b, l + 1);
    r = r && select_statement(b, l + 1);
    r = r && consumeToken(b, FROM);
    r = r && from_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [PARTITION (partition_spec) [IF NOT EXISTS]]
  private static boolean insert_statement_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_0_4")) return false;
    insert_statement_0_4_0(b, l + 1);
    return true;
  }

  // PARTITION (partition_spec) [IF NOT EXISTS]
  private static boolean insert_statement_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARTITION);
    r = r && insert_statement_0_4_0_1(b, l + 1);
    r = r && insert_statement_0_4_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (partition_spec)
  private static boolean insert_statement_0_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_0_4_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = partition_spec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [IF NOT EXISTS]
  private static boolean insert_statement_0_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_0_4_0_2")) return false;
    parseTokens(b, 0, IF, NOT, EXISTS);
    return true;
  }

  // INSERT INTO TABLE table_name [PARTITION (partition_spec)] select_statement FROM from_statement
  private static boolean insert_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INSERT, INTO, TABLE);
    r = r && table_name(b, l + 1);
    r = r && insert_statement_1_4(b, l + 1);
    r = r && select_statement(b, l + 1);
    r = r && consumeToken(b, FROM);
    r = r && from_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [PARTITION (partition_spec)]
  private static boolean insert_statement_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_1_4")) return false;
    insert_statement_1_4_0(b, l + 1);
    return true;
  }

  // PARTITION (partition_spec)
  private static boolean insert_statement_1_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_1_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARTITION);
    r = r && insert_statement_1_4_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (partition_spec)
  private static boolean insert_statement_1_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_1_4_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = partition_spec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // FROM from_statement
  //            (INSERT OVERWRITE TABLE table_name [PARTITION (partition_spec) [IF NOT EXISTS]] select_statement |
  //            INSERT INTO TABLE table_name [PARTITION (partition_spec)] select_statement)
  //            (INSERT OVERWRITE TABLE table_name [PARTITION (partition_spec) [IF NOT EXISTS]] select_statement |
  //                       INSERT INTO TABLE table_name [PARTITION (partition_spec)] select_statement)*
  private static boolean insert_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FROM);
    r = r && from_statement(b, l + 1);
    r = r && insert_statement_2_2(b, l + 1);
    r = r && insert_statement_2_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INSERT OVERWRITE TABLE table_name [PARTITION (partition_spec) [IF NOT EXISTS]] select_statement |
  //            INSERT INTO TABLE table_name [PARTITION (partition_spec)] select_statement
  private static boolean insert_statement_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_2_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = insert_statement_2_2_0(b, l + 1);
    if (!r) r = insert_statement_2_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INSERT OVERWRITE TABLE table_name [PARTITION (partition_spec) [IF NOT EXISTS]] select_statement
  private static boolean insert_statement_2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_2_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INSERT, OVERWRITE, TABLE);
    r = r && table_name(b, l + 1);
    r = r && insert_statement_2_2_0_4(b, l + 1);
    r = r && select_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [PARTITION (partition_spec) [IF NOT EXISTS]]
  private static boolean insert_statement_2_2_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_2_2_0_4")) return false;
    insert_statement_2_2_0_4_0(b, l + 1);
    return true;
  }

  // PARTITION (partition_spec) [IF NOT EXISTS]
  private static boolean insert_statement_2_2_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_2_2_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARTITION);
    r = r && insert_statement_2_2_0_4_0_1(b, l + 1);
    r = r && insert_statement_2_2_0_4_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (partition_spec)
  private static boolean insert_statement_2_2_0_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_2_2_0_4_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = partition_spec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [IF NOT EXISTS]
  private static boolean insert_statement_2_2_0_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_2_2_0_4_0_2")) return false;
    parseTokens(b, 0, IF, NOT, EXISTS);
    return true;
  }

  // INSERT INTO TABLE table_name [PARTITION (partition_spec)] select_statement
  private static boolean insert_statement_2_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_2_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INSERT, INTO, TABLE);
    r = r && table_name(b, l + 1);
    r = r && insert_statement_2_2_1_4(b, l + 1);
    r = r && select_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [PARTITION (partition_spec)]
  private static boolean insert_statement_2_2_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_2_2_1_4")) return false;
    insert_statement_2_2_1_4_0(b, l + 1);
    return true;
  }

  // PARTITION (partition_spec)
  private static boolean insert_statement_2_2_1_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_2_2_1_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARTITION);
    r = r && insert_statement_2_2_1_4_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (partition_spec)
  private static boolean insert_statement_2_2_1_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_2_2_1_4_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = partition_spec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (INSERT OVERWRITE TABLE table_name [PARTITION (partition_spec) [IF NOT EXISTS]] select_statement |
  //                       INSERT INTO TABLE table_name [PARTITION (partition_spec)] select_statement)*
  private static boolean insert_statement_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_2_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!insert_statement_2_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "insert_statement_2_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // INSERT OVERWRITE TABLE table_name [PARTITION (partition_spec) [IF NOT EXISTS]] select_statement |
  //                       INSERT INTO TABLE table_name [PARTITION (partition_spec)] select_statement
  private static boolean insert_statement_2_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_2_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = insert_statement_2_3_0_0(b, l + 1);
    if (!r) r = insert_statement_2_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INSERT OVERWRITE TABLE table_name [PARTITION (partition_spec) [IF NOT EXISTS]] select_statement
  private static boolean insert_statement_2_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_2_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INSERT, OVERWRITE, TABLE);
    r = r && table_name(b, l + 1);
    r = r && insert_statement_2_3_0_0_4(b, l + 1);
    r = r && select_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [PARTITION (partition_spec) [IF NOT EXISTS]]
  private static boolean insert_statement_2_3_0_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_2_3_0_0_4")) return false;
    insert_statement_2_3_0_0_4_0(b, l + 1);
    return true;
  }

  // PARTITION (partition_spec) [IF NOT EXISTS]
  private static boolean insert_statement_2_3_0_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_2_3_0_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARTITION);
    r = r && insert_statement_2_3_0_0_4_0_1(b, l + 1);
    r = r && insert_statement_2_3_0_0_4_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (partition_spec)
  private static boolean insert_statement_2_3_0_0_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_2_3_0_0_4_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = partition_spec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [IF NOT EXISTS]
  private static boolean insert_statement_2_3_0_0_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_2_3_0_0_4_0_2")) return false;
    parseTokens(b, 0, IF, NOT, EXISTS);
    return true;
  }

  // INSERT INTO TABLE table_name [PARTITION (partition_spec)] select_statement
  private static boolean insert_statement_2_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_2_3_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INSERT, INTO, TABLE);
    r = r && table_name(b, l + 1);
    r = r && insert_statement_2_3_0_1_4(b, l + 1);
    r = r && select_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [PARTITION (partition_spec)]
  private static boolean insert_statement_2_3_0_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_2_3_0_1_4")) return false;
    insert_statement_2_3_0_1_4_0(b, l + 1);
    return true;
  }

  // PARTITION (partition_spec)
  private static boolean insert_statement_2_3_0_1_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_2_3_0_1_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARTITION);
    r = r && insert_statement_2_3_0_1_4_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (partition_spec)
  private static boolean insert_statement_2_3_0_1_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_2_3_0_1_4_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = partition_spec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INSERT OVERWRITE TABLE tablename PARTITION (partition_columns_with_optional_values) select_statement FROM from_statement
  private static boolean insert_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INSERT, OVERWRITE, TABLE, TABLENAME, PARTITION);
    r = r && insert_statement_3_5(b, l + 1);
    r = r && select_statement(b, l + 1);
    r = r && consumeToken(b, FROM);
    r = r && from_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (partition_columns_with_optional_values)
  private static boolean insert_statement_3_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_3_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = partition_columns_with_optional_values(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INSERT INTO TABLE tablename PARTITION (partition_columns_with_optional_values) select_statement FROM from_statement
  private static boolean insert_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INSERT, INTO, TABLE, TABLENAME, PARTITION);
    r = r && insert_statement_4_5(b, l + 1);
    r = r && select_statement(b, l + 1);
    r = r && consumeToken(b, FROM);
    r = r && from_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (partition_columns_with_optional_values)
  private static boolean insert_statement_4_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_4_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = partition_columns_with_optional_values(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INSERT INTO TABLE tablename [PARTITION (partition_columns_with_optional_values)] VALUES values_row (',' values_row)*
  private static boolean insert_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INSERT, INTO, TABLE, TABLENAME);
    r = r && insert_statement_5_4(b, l + 1);
    r = r && consumeToken(b, VALUES);
    r = r && values_row(b, l + 1);
    r = r && insert_statement_5_7(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [PARTITION (partition_columns_with_optional_values)]
  private static boolean insert_statement_5_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_5_4")) return false;
    insert_statement_5_4_0(b, l + 1);
    return true;
  }

  // PARTITION (partition_columns_with_optional_values)
  private static boolean insert_statement_5_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_5_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARTITION);
    r = r && insert_statement_5_4_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (partition_columns_with_optional_values)
  private static boolean insert_statement_5_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_5_4_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = partition_columns_with_optional_values(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' values_row)*
  private static boolean insert_statement_5_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_5_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!insert_statement_5_7_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "insert_statement_5_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' values_row
  private static boolean insert_statement_5_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_statement_5_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && values_row(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LOAD DATA [LOCAL] INPATH file_path [OVERWRITE] INTO TABLE tablename [PARTITION (partition_spec)]
  public static boolean load_data(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "load_data")) return false;
    if (!nextTokenIs(b, LOAD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LOAD, DATA);
    r = r && load_data_2(b, l + 1);
    r = r && consumeToken(b, INPATH);
    r = r && file_path(b, l + 1);
    r = r && load_data_5(b, l + 1);
    r = r && consumeTokens(b, 0, INTO, TABLE, TABLENAME);
    r = r && load_data_9(b, l + 1);
    exit_section_(b, m, LOAD_DATA, r);
    return r;
  }

  // [LOCAL]
  private static boolean load_data_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "load_data_2")) return false;
    consumeToken(b, LOCAL);
    return true;
  }

  // [OVERWRITE]
  private static boolean load_data_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "load_data_5")) return false;
    consumeToken(b, OVERWRITE);
    return true;
  }

  // [PARTITION (partition_spec)]
  private static boolean load_data_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "load_data_9")) return false;
    load_data_9_0(b, l + 1);
    return true;
  }

  // PARTITION (partition_spec)
  private static boolean load_data_9_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "load_data_9_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARTITION);
    r = r && load_data_9_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (partition_spec)
  private static boolean load_data_9_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "load_data_9_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = partition_spec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MAP '<'primitive_type','data_type'>'
  public static boolean map_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_type")) return false;
    if (!nextTokenIs(b, MAP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MAP);
    r = r && consumeToken(b, "<");
    r = r && primitive_type(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && data_type(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, m, MAP_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // MERGE INTO table_name AS T USING (table_name | select_statement) AS S
  //           ON boolean_expression
  //           WHEN MATCHED [AND boolean_expression] THEN UPDATE SET set_clause_list
  //           WHEN MATCHED [AND boolean_expression] THEN DELETE
  //           WHEN NOT MATCHED [AND boolean_expression] THEN INSERT VALUES values_row
  public static boolean merge_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "merge_statement")) return false;
    if (!nextTokenIs(b, MERGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MERGE, INTO);
    r = r && table_name(b, l + 1);
    r = r && consumeTokens(b, 0, AS, T, USING);
    r = r && merge_statement_6(b, l + 1);
    r = r && consumeTokens(b, 0, AS, S, ON);
    r = r && boolean_expression(b, l + 1);
    r = r && consumeTokens(b, 0, WHEN, MATCHED);
    r = r && merge_statement_13(b, l + 1);
    r = r && consumeTokens(b, 0, THEN, UPDATE, SET);
    r = r && set_clause_list(b, l + 1);
    r = r && consumeTokens(b, 0, WHEN, MATCHED);
    r = r && merge_statement_20(b, l + 1);
    r = r && consumeTokens(b, 0, THEN, DELETE, WHEN, NOT, MATCHED);
    r = r && merge_statement_26(b, l + 1);
    r = r && consumeTokens(b, 0, THEN, INSERT, VALUES);
    r = r && values_row(b, l + 1);
    exit_section_(b, m, MERGE_STATEMENT, r);
    return r;
  }

  // table_name | select_statement
  private static boolean merge_statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "merge_statement_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = table_name(b, l + 1);
    if (!r) r = select_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [AND boolean_expression]
  private static boolean merge_statement_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "merge_statement_13")) return false;
    merge_statement_13_0(b, l + 1);
    return true;
  }

  // AND boolean_expression
  private static boolean merge_statement_13_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "merge_statement_13_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && boolean_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [AND boolean_expression]
  private static boolean merge_statement_20(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "merge_statement_20")) return false;
    merge_statement_20_0(b, l + 1);
    return true;
  }

  // AND boolean_expression
  private static boolean merge_statement_20_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "merge_statement_20_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && boolean_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [AND boolean_expression]
  private static boolean merge_statement_26(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "merge_statement_26")) return false;
    merge_statement_26_0(b, l + 1);
    return true;
  }

  // AND boolean_expression
  private static boolean merge_statement_26_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "merge_statement_26_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && boolean_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // integer
  static boolean num_buckets(PsiBuilder b, int l) {
    return consumeToken(b, INTEGER);
  }

  /* ********************************************************** */
  // integer
  static boolean offset(PsiBuilder b, int l) {
    return consumeToken(b, INTEGER);
  }

  /* ********************************************************** */
  // singlequotedstring
  static boolean output_format_classname(PsiBuilder b, int l) {
    return consumeToken(b, SINGLEQUOTEDSTRING);
  }

  /* ********************************************************** */
  // identifier
  public static boolean partition_column(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "partition_column")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, PARTITION_COLUMN, r);
    return r;
  }

  /* ********************************************************** */
  // partition_column ['=' value] (',' partition_column ['=' value])*
  static boolean partition_columns_with_optional_values(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "partition_columns_with_optional_values")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = partition_column(b, l + 1);
    r = r && partition_columns_with_optional_values_1(b, l + 1);
    r = r && partition_columns_with_optional_values_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['=' value]
  private static boolean partition_columns_with_optional_values_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "partition_columns_with_optional_values_1")) return false;
    partition_columns_with_optional_values_1_0(b, l + 1);
    return true;
  }

  // '=' value
  private static boolean partition_columns_with_optional_values_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "partition_columns_with_optional_values_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' partition_column ['=' value])*
  private static boolean partition_columns_with_optional_values_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "partition_columns_with_optional_values_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!partition_columns_with_optional_values_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "partition_columns_with_optional_values_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' partition_column ['=' value]
  private static boolean partition_columns_with_optional_values_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "partition_columns_with_optional_values_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && partition_column(b, l + 1);
    r = r && partition_columns_with_optional_values_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['=' value]
  private static boolean partition_columns_with_optional_values_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "partition_columns_with_optional_values_2_0_2")) return false;
    partition_columns_with_optional_values_2_0_2_0(b, l + 1);
    return true;
  }

  // '=' value
  private static boolean partition_columns_with_optional_values_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "partition_columns_with_optional_values_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // partition_column '=' value (',' partition_column '=' value)*
  static boolean partition_spec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "partition_spec")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = partition_column(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && value(b, l + 1);
    r = r && partition_spec_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' partition_column '=' value)*
  private static boolean partition_spec_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "partition_spec_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!partition_spec_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "partition_spec_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' partition_column '=' value
  private static boolean partition_spec_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "partition_spec_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && partition_column(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // integer
  static boolean precision(PsiBuilder b, int l) {
    return consumeToken(b, INTEGER);
  }

  /* ********************************************************** */
  // TINYINT
  //                    | SMALLINT
  //                    | INT
  //                    | BIGINT
  //                    | BOOLEAN
  //                    | FLOAT
  //                    | DOUBLE
  //                    | DOUBLE PRECISION
  //                    | STRING
  //                    | BINARY
  //                    | TIMESTAMP
  //                    | DECIMAL
  //                    | DECIMAL(precision',' scale)
  //                    | DATE
  //                    | VARCHAR
  //                    | CHAR
  public static boolean primitive_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primitive_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMITIVE_TYPE, "<primitive type>");
    r = consumeToken(b, TINYINT);
    if (!r) r = consumeToken(b, SMALLINT);
    if (!r) r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, BIGINT);
    if (!r) r = consumeToken(b, BOOLEAN);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, DOUBLE);
    if (!r) r = parseTokens(b, 0, DOUBLE, PRECISION);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, BINARY);
    if (!r) r = consumeToken(b, TIMESTAMP);
    if (!r) r = consumeToken(b, DECIMAL);
    if (!r) r = primitive_type_12(b, l + 1);
    if (!r) r = consumeToken(b, DATE);
    if (!r) r = consumeToken(b, VARCHAR);
    if (!r) r = consumeToken(b, CHAR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DECIMAL(precision',' scale)
  private static boolean primitive_type_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primitive_type_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DECIMAL);
    r = r && primitive_type_12_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // precision',' scale
  private static boolean primitive_type_12_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primitive_type_12_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = precision(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && scale(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // doublequotedstring
  static boolean property_name(PsiBuilder b, int l) {
    return consumeToken(b, DOUBLEQUOTEDSTRING);
  }

  /* ********************************************************** */
  // doublequotedstring
  static boolean property_value(PsiBuilder b, int l) {
    return consumeToken(b, DOUBLEQUOTEDSTRING);
  }

  /* ********************************************************** */
  // query ((query';')+ |';'?)
  static boolean queries_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queries_")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = query(b, l + 1);
    r = r && queries__1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (query';')+ |';'?
  private static boolean queries__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queries__1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = queries__1_0(b, l + 1);
    if (!r) r = queries__1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (query';')+
  private static boolean queries__1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queries__1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = queries__1_0_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!queries__1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "queries__1_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // query';'
  private static boolean queries__1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queries__1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = query(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'?
  private static boolean queries__1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queries__1_1")) return false;
    consumeToken(b, ";");
    return true;
  }

  /* ********************************************************** */
  // ddl|dml
  public static boolean query(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUERY, "<query>");
    r = ddl(b, l + 1);
    if (!r) r = dml(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DELIMITED [FIELDS TERMINATED BY char [ESCAPED BY char]] [COLLECTION ITEMS TERMINATED BY char]
  //                          [MAP KEYS TERMINATED BY char] [LINES TERMINATED BY char]
  //                          [NULL DEFINED AS char]
  //                    | SERDE serde_name [WITH SERDEPROPERTIES (serde_properties)]
  public static boolean row_format(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "row_format")) return false;
    if (!nextTokenIs(b, "<row format>", DELIMITED, SERDE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ROW_FORMAT, "<row format>");
    r = row_format_0(b, l + 1);
    if (!r) r = row_format_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DELIMITED [FIELDS TERMINATED BY char [ESCAPED BY char]] [COLLECTION ITEMS TERMINATED BY char]
  //                          [MAP KEYS TERMINATED BY char] [LINES TERMINATED BY char]
  //                          [NULL DEFINED AS char]
  private static boolean row_format_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "row_format_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DELIMITED);
    r = r && row_format_0_1(b, l + 1);
    r = r && row_format_0_2(b, l + 1);
    r = r && row_format_0_3(b, l + 1);
    r = r && row_format_0_4(b, l + 1);
    r = r && row_format_0_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [FIELDS TERMINATED BY char [ESCAPED BY char]]
  private static boolean row_format_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "row_format_0_1")) return false;
    row_format_0_1_0(b, l + 1);
    return true;
  }

  // FIELDS TERMINATED BY char [ESCAPED BY char]
  private static boolean row_format_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "row_format_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FIELDS, TERMINATED, BY, CHAR);
    r = r && row_format_0_1_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ESCAPED BY char]
  private static boolean row_format_0_1_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "row_format_0_1_0_4")) return false;
    parseTokens(b, 0, ESCAPED, BY, CHAR);
    return true;
  }

  // [COLLECTION ITEMS TERMINATED BY char]
  private static boolean row_format_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "row_format_0_2")) return false;
    parseTokens(b, 0, COLLECTION, ITEMS, TERMINATED, BY, CHAR);
    return true;
  }

  // [MAP KEYS TERMINATED BY char]
  private static boolean row_format_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "row_format_0_3")) return false;
    parseTokens(b, 0, MAP, KEYS, TERMINATED, BY, CHAR);
    return true;
  }

  // [LINES TERMINATED BY char]
  private static boolean row_format_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "row_format_0_4")) return false;
    parseTokens(b, 0, LINES, TERMINATED, BY, CHAR);
    return true;
  }

  // [NULL DEFINED AS char]
  private static boolean row_format_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "row_format_0_5")) return false;
    parseTokens(b, 0, NULL, DEFINED, AS, CHAR);
    return true;
  }

  // SERDE serde_name [WITH SERDEPROPERTIES (serde_properties)]
  private static boolean row_format_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "row_format_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SERDE);
    r = r && serde_name(b, l + 1);
    r = r && row_format_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [WITH SERDEPROPERTIES (serde_properties)]
  private static boolean row_format_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "row_format_1_2")) return false;
    row_format_1_2_0(b, l + 1);
    return true;
  }

  // WITH SERDEPROPERTIES (serde_properties)
  private static boolean row_format_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "row_format_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WITH, SERDEPROPERTIES);
    r = r && row_format_1_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (serde_properties)
  private static boolean row_format_1_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "row_format_1_2_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = serde_properties(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // integer
  static boolean rows(PsiBuilder b, int l) {
    return consumeToken(b, INTEGER);
  }

  /* ********************************************************** */
  // integer
  static boolean scale(PsiBuilder b, int l) {
    return consumeToken(b, INTEGER);
  }

  /* ********************************************************** */
  // STUB
  public static boolean select_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_expr")) return false;
    if (!nextTokenIs(b, STUB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STUB);
    exit_section_(b, m, SELECT_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // select_expr (',' select_expr)*
  public static boolean select_expr_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_expr_list")) return false;
    if (!nextTokenIs(b, STUB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = select_expr(b, l + 1);
    r = r && select_expr_list_1(b, l + 1);
    exit_section_(b, m, SELECT_EXPR_LIST, r);
    return r;
  }

  // (',' select_expr)*
  private static boolean select_expr_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_expr_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!select_expr_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "select_expr_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' select_expr
  private static boolean select_expr_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_expr_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && select_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [WITH common_table_expression_list]
  //                      SELECT [ALL | DISTINCT] select_expr_list
  //                        FROM table_name
  //                        [WHERE boolean_expression]
  //                        [GROUP BY columns_list]
  //                        [ORDER BY columns_list]
  //                        [CLUSTER BY columns_list
  //                          | [DISTRIBUTE BY columns_list] [SORT BY columns_list]
  //                        ]
  //                       [LIMIT [offset','] rows]
  public static boolean select_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_statement")) return false;
    if (!nextTokenIs(b, "<select statement>", SELECT, WITH)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECT_STATEMENT, "<select statement>");
    r = select_statement_0(b, l + 1);
    r = r && consumeToken(b, SELECT);
    r = r && select_statement_2(b, l + 1);
    r = r && select_expr_list(b, l + 1);
    r = r && consumeToken(b, FROM);
    r = r && table_name(b, l + 1);
    r = r && select_statement_6(b, l + 1);
    r = r && select_statement_7(b, l + 1);
    r = r && select_statement_8(b, l + 1);
    r = r && select_statement_9(b, l + 1);
    r = r && select_statement_10(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [WITH common_table_expression_list]
  private static boolean select_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_statement_0")) return false;
    select_statement_0_0(b, l + 1);
    return true;
  }

  // WITH common_table_expression_list
  private static boolean select_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WITH);
    r = r && common_table_expression_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ALL | DISTINCT]
  private static boolean select_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_statement_2")) return false;
    select_statement_2_0(b, l + 1);
    return true;
  }

  // ALL | DISTINCT
  private static boolean select_statement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_statement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ALL);
    if (!r) r = consumeToken(b, DISTINCT);
    exit_section_(b, m, null, r);
    return r;
  }

  // [WHERE boolean_expression]
  private static boolean select_statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_statement_6")) return false;
    select_statement_6_0(b, l + 1);
    return true;
  }

  // WHERE boolean_expression
  private static boolean select_statement_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_statement_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHERE);
    r = r && boolean_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [GROUP BY columns_list]
  private static boolean select_statement_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_statement_7")) return false;
    select_statement_7_0(b, l + 1);
    return true;
  }

  // GROUP BY columns_list
  private static boolean select_statement_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_statement_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, GROUP, BY);
    r = r && columns_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ORDER BY columns_list]
  private static boolean select_statement_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_statement_8")) return false;
    select_statement_8_0(b, l + 1);
    return true;
  }

  // ORDER BY columns_list
  private static boolean select_statement_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_statement_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ORDER, BY);
    r = r && columns_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [CLUSTER BY columns_list
  //                          | [DISTRIBUTE BY columns_list] [SORT BY columns_list]
  //                        ]
  private static boolean select_statement_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_statement_9")) return false;
    select_statement_9_0(b, l + 1);
    return true;
  }

  // CLUSTER BY columns_list
  //                          | [DISTRIBUTE BY columns_list] [SORT BY columns_list]
  private static boolean select_statement_9_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_statement_9_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = select_statement_9_0_0(b, l + 1);
    if (!r) r = select_statement_9_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CLUSTER BY columns_list
  private static boolean select_statement_9_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_statement_9_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CLUSTER, BY);
    r = r && columns_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [DISTRIBUTE BY columns_list] [SORT BY columns_list]
  private static boolean select_statement_9_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_statement_9_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = select_statement_9_0_1_0(b, l + 1);
    r = r && select_statement_9_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [DISTRIBUTE BY columns_list]
  private static boolean select_statement_9_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_statement_9_0_1_0")) return false;
    select_statement_9_0_1_0_0(b, l + 1);
    return true;
  }

  // DISTRIBUTE BY columns_list
  private static boolean select_statement_9_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_statement_9_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DISTRIBUTE, BY);
    r = r && columns_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [SORT BY columns_list]
  private static boolean select_statement_9_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_statement_9_0_1_1")) return false;
    select_statement_9_0_1_1_0(b, l + 1);
    return true;
  }

  // SORT BY columns_list
  private static boolean select_statement_9_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_statement_9_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SORT, BY);
    r = r && columns_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [LIMIT [offset','] rows]
  private static boolean select_statement_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_statement_10")) return false;
    select_statement_10_0(b, l + 1);
    return true;
  }

  // LIMIT [offset','] rows
  private static boolean select_statement_10_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_statement_10_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LIMIT);
    r = r && select_statement_10_0_1(b, l + 1);
    r = r && rows(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [offset',']
  private static boolean select_statement_10_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_statement_10_0_1")) return false;
    select_statement_10_0_1_0(b, l + 1);
    return true;
  }

  // offset','
  private static boolean select_statement_10_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_statement_10_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = offset(b, l + 1);
    r = r && consumeToken(b, ",");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // singlequotedstring
  static boolean serde_name(PsiBuilder b, int l) {
    return consumeToken(b, SINGLEQUOTEDSTRING);
  }

  /* ********************************************************** */
  // '('property_name'='property_value(','property_name'='property_value)*')'
  static boolean serde_properties(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "serde_properties")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && property_name(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && property_value(b, l + 1);
    r = r && serde_properties_4(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // (','property_name'='property_value)*
  private static boolean serde_properties_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "serde_properties_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!serde_properties_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "serde_properties_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','property_name'='property_value
  private static boolean serde_properties_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "serde_properties_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && property_name(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && property_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // column '=' value (',' column '=' value)*
  public static boolean set_clause_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_clause_list")) return false;
    if (!nextTokenIs(b, COLUMN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLUMN);
    r = r && consumeToken(b, "=");
    r = r && value(b, l + 1);
    r = r && set_clause_list_3(b, l + 1);
    exit_section_(b, m, SET_CLAUSE_LIST, r);
    return r;
  }

  // (',' column '=' value)*
  private static boolean set_clause_list_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_clause_list_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!set_clause_list_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "set_clause_list_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' column '=' value
  private static boolean set_clause_list_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_clause_list_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && consumeToken(b, COLUMN);
    r = r && consumeToken(b, "=");
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STRUCT '<'col_name ':' data_type [COMMENT col_comment] (',' col_name ':' data_type [COMMENT col_comment])+'>'
  public static boolean struct_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_type")) return false;
    if (!nextTokenIs(b, STRUCT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRUCT);
    r = r && consumeToken(b, "<");
    r = r && col_name(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && data_type(b, l + 1);
    r = r && struct_type_5(b, l + 1);
    r = r && struct_type_6(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, m, STRUCT_TYPE, r);
    return r;
  }

  // [COMMENT col_comment]
  private static boolean struct_type_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_type_5")) return false;
    struct_type_5_0(b, l + 1);
    return true;
  }

  // COMMENT col_comment
  private static boolean struct_type_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_type_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMENT);
    r = r && col_comment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' col_name ':' data_type [COMMENT col_comment])+
  private static boolean struct_type_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_type_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = struct_type_6_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!struct_type_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "struct_type_6", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ',' col_name ':' data_type [COMMENT col_comment]
  private static boolean struct_type_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_type_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && col_name(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && data_type(b, l + 1);
    r = r && struct_type_6_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMENT col_comment]
  private static boolean struct_type_6_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_type_6_0_4")) return false;
    struct_type_6_0_4_0(b, l + 1);
    return true;
  }

  // COMMENT col_comment
  private static boolean struct_type_6_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_type_6_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMENT);
    r = r && col_comment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // singlequotedstring
  static boolean table_comment(PsiBuilder b, int l) {
    return consumeToken(b, SINGLEQUOTEDSTRING);
  }

  /* ********************************************************** */
  // identifier
  static boolean table_name(PsiBuilder b, int l) {
    return consumeToken(b, IDENTIFIER);
  }

  /* ********************************************************** */
  // '('property_name'='property_value(','property_name'='property_value)*')'
  static boolean table_properties(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_properties")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && property_name(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && property_value(b, l + 1);
    r = r && table_properties_4(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // (','property_name'='property_value)*
  private static boolean table_properties_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_properties_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!table_properties_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "table_properties_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','property_name'='property_value
  private static boolean table_properties_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_properties_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && property_name(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && property_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TRUNCATE TABLE table_name [PARTITION partition_spec]
  public static boolean truncate_table(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "truncate_table")) return false;
    if (!nextTokenIs(b, TRUNCATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TRUNCATE, TABLE);
    r = r && table_name(b, l + 1);
    r = r && truncate_table_3(b, l + 1);
    exit_section_(b, m, TRUNCATE_TABLE, r);
    return r;
  }

  // [PARTITION partition_spec]
  private static boolean truncate_table_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "truncate_table_3")) return false;
    truncate_table_3_0(b, l + 1);
    return true;
  }

  // PARTITION partition_spec
  private static boolean truncate_table_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "truncate_table_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARTITION);
    r = r && partition_spec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // UNIONTYPE '<'data_type(',' data_type)+'>'
  public static boolean union_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_type")) return false;
    if (!nextTokenIs(b, UNIONTYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UNIONTYPE);
    r = r && consumeToken(b, "<");
    r = r && data_type(b, l + 1);
    r = r && union_type_3(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, m, UNION_TYPE, r);
    return r;
  }

  // (',' data_type)+
  private static boolean union_type_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_type_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = union_type_3_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!union_type_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "union_type_3", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ',' data_type
  private static boolean union_type_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_type_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && data_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // UPDATE table_name SET set_clause_list [WHERE boolean_expression]
  public static boolean update_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_statement")) return false;
    if (!nextTokenIs(b, UPDATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UPDATE);
    r = r && table_name(b, l + 1);
    r = r && consumeToken(b, SET);
    r = r && set_clause_list(b, l + 1);
    r = r && update_statement_4(b, l + 1);
    exit_section_(b, m, UPDATE_STATEMENT, r);
    return r;
  }

  // [WHERE boolean_expression]
  private static boolean update_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_statement_4")) return false;
    update_statement_4_0(b, l + 1);
    return true;
  }

  // WHERE boolean_expression
  private static boolean update_statement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_statement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHERE);
    r = r && boolean_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // USE (database_name | DEFAULT)
  public static boolean use_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_statement")) return false;
    if (!nextTokenIs(b, USE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USE);
    r = r && use_statement_1(b, l + 1);
    exit_section_(b, m, USE_STATEMENT, r);
    return r;
  }

  // database_name | DEFAULT
  private static boolean use_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = database_name(b, l + 1);
    if (!r) r = consumeToken(b, DEFAULT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  static boolean user_or_role(PsiBuilder b, int l) {
    return consumeToken(b, IDENTIFIER);
  }

  /* ********************************************************** */
  // string | integer
  static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    if (!nextTokenIs(b, "", INTEGER, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, INTEGER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // value (',' value)*
  static boolean values_row(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "values_row")) return false;
    if (!nextTokenIs(b, "", INTEGER, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = value(b, l + 1);
    r = r && values_row_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' value)*
  private static boolean values_row_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "values_row_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!values_row_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "values_row_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' value
  private static boolean values_row_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "values_row_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
