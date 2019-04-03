import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class AWSJson {

    @SerializedName("rule-id")
    private String ruleId;
    @SerializedName("rule-name")
    private String ruleName;
    @SerializedName("rule-type")
    private String ruleType;
    @SerializedName("rule-action")
    private String ruleAction;
    @SerializedName("object-locator")
    private ObjectLocater objectLocator;
    @SerializedName("filters")
    private List<String> filters;

    public AWSJson(String ruleId, String ruleName, String ruleType, String ruleAction, String tableName) {
        this.ruleId = ruleId;
        this.ruleName = ruleName;
        this.ruleType = ruleType;
        this.ruleAction = ruleAction;

        this.objectLocator = new ObjectLocater(tableName);
        this.filters = new ArrayList<>();
    }

    class ObjectLocater {
        @SerializedName("schema-name")
        private String schemaName;
        @SerializedName("table-name")
        private String tableName;

        public ObjectLocater(String tableName) {
            this.tableName = tableName;
            this.schemaName = "OPS$COMMERCE";
        }

    }
}
