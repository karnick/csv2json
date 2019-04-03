import com.opencsv.bean.CsvBindByName;

public class AWSRuleBean extends CsvBean {
    @CsvBindByName(column = "rule-type")
    private String ruleType;

    @CsvBindByName(column = "rule-id")
    private String ruleId;

    @CsvBindByName(column = "rule-name")
    private String ruleName;

    @CsvBindByName(column = "rule-action")
    private String ruleAction;

    @CsvBindByName(column = "schema-name")
    private String schemaName;

    @CsvBindByName(column = "table-name")
    private String tableName;

    public String getSchemaName() { return schemaName;    }

    public void setSchemaName(String schemaName) {  this.schemaName = schemaName;    }

    public String getTableName() {  return tableName;    }

    public void setTableName(String tableName) {        this.tableName = tableName;    }

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleAction() {
        return ruleAction;
    }

    public void setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
    }
}

