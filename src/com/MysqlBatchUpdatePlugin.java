//package com;
//
//import org.mybatis.generator.api.IntrospectedColumn;
//import org.mybatis.generator.api.IntrospectedTable;
//import org.mybatis.generator.api.PluginAdapter;
//import org.mybatis.generator.api.dom.java.Interface;
//import org.mybatis.generator.api.dom.java.TopLevelClass;
//import org.mybatis.generator.api.dom.xml.Document;
//
//import java.util.List;
//
//public class MysqlBatchUpdatePlugin extends PluginAdapter {
//
//    private final static String BATCH_UPDATE = "batchUpdate";
//
//    private final static String PARAMETER_NAME = "recordList";
//
//
//    @Override
//    public boolean validate(List<String> list) {
//        return true;
//    }
//
//    @Override
//    public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
//
//        if (introspectedTable.getTargetRuntime().equals(IntrospectedTable.TargetRuntime.MYBATIS3)) {
//            MethodGeneratorTool.defaultBatchInsertOrUpdateMethodGen(MethodGeneratorTool.UPDATE, interfaze, introspectedTable, context);
//        }
//        return super.clientGenerated(interfaze, topLevelClass, introspectedTable);
//    }
//
//    @Override
//    public boolean sqlMapDocumentGenerated(Document document, IntrospectedTable introspectedTable) {
//        if (introspectedTable.getTargetRuntime().equals(IntrospectedTable.TargetRuntime.MYBATIS3)) {
//            addSqlMapper(document, introspectedTable);
//        }
//        return super.sqlMapDocumentGenerated(document, introspectedTable);
//    }
//
//    public void addSqlMapper(Document document, IntrospectedTable introspectedTable) {
//        String tableName = introspectedTable.getFullyQualifiedTableNameAtRuntime();
//        List<IntrospectedColumn> columnList = introspectedTable.getAllColumns();
//        //primaryKey的JDBC名字
//        String primaryKeyName = introspectedTable.getPrimaryKeyColumns().get(0).getActualColumnName();
//
//        //primaryKey的JAVA变量
//        String primaryKeyParameterClause = MyBatis3FormattingUtilities.getParameterClause(introspectedTable.getPrimaryKeyColumns().get(0), "item.");
//
//        //primaryKey的JAVA名字
//        String primaryKeyJavaName = introspectedTable.getPrimaryKeyColumns().get(0).getJavaProperty();
//
//
//        XmlElement updateXmlElement = SqlMapperGeneratorTool.baseElementGenerator(SqlMapperGeneratorTool.UPDATE,
//                BATCH_UPDATE,
//                FullyQualifiedJavaType.getNewListInstance());
//
//        updateXmlElement.addElement(new TextElement(String.format("update %s ", tableName)));
//
//        XmlElement trimElement = SqlMapperGeneratorTool.baseTrimElement("set", null, ",");
//
//        for (int i = 0; i < columnList.size(); i++) {
//
//            IntrospectedColumn introspectedColumn = columnList.get(i);
//
//            String columnName = introspectedColumn.getActualColumnName();
//
//            String columnJavaTypeName = introspectedColumn.getJavaProperty("item.");
//
//            String parameterClause = MyBatis3FormattingUtilities.getParameterClause(introspectedColumn, "item.");
//
//
//            if (introspectedColumn.isIdentity()) {
//                continue;
//            }
//
//            String ifSql = String.format("when %s then %s", primaryKeyParameterClause, parameterClause);
//            XmlElement ifElement = SqlMapperGeneratorTool.baseIfJudgeElementGen(columnJavaTypeName, ifSql, false);
//
//            String ifNullSql = String.format("when %s then %s", primaryKeyParameterClause, tableName + "." + columnName);
//            XmlElement ifNullElement = SqlMapperGeneratorTool.baseIfJudgeElementGen(columnJavaTypeName, ifNullSql, true);
//
//
//            XmlElement foreachElement = SqlMapperGeneratorTool.baseForeachElementGenerator(PARAMETER_NAME, "item", "index", null);
//            foreachElement.addElement(ifElement);
//            foreachElement.addElement(ifNullElement);
//
//            XmlElement caseTrimElement = SqlMapperGeneratorTool.baseTrimElement(columnName + " =case " + primaryKeyName, "end,", null);
//            caseTrimElement.addElement(foreachElement);
//
//            trimElement.addElement(caseTrimElement);
//        }
//
//        updateXmlElement.addElement(trimElement);
//
//        XmlElement foreachElement = SqlMapperGeneratorTool.baseForeachElementGenerator(PARAMETER_NAME,
//                "item",
//                "index",
//                ",");
//        foreachElement.addElement(new TextElement(primaryKeyParameterClause));
//
//        updateXmlElement.addElement(new TextElement(String.format("where %s in(", primaryKeyName)));
//
//        updateXmlElement.addElement(foreachElement);
//
//        updateXmlElement.addElement(new TextElement(")"));
//
//        document.getRootElement().addElement(updateXmlElement);
//    }
//}
//---------------------
//版权声明：本文为CSDN博主「java劝退师」的原创文章，遵循CC 4.0 by-sa版权协议，转载请附上原文出处链接及本声明。
//原文链接：https://blog.csdn.net/HuHui_/article/details/85150537