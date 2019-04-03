import com.google.gson.Gson;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class csv2json {

    public static List<CsvBean> beanBuilder(String path, Class clazz) throws Exception {

        CsvToBean cb = new CsvToBeanBuilder(new FileReader(path))
                .withType(clazz)
                .withThrowExceptions(true)
                .build();

        return cb.parse();

    }

    public static void main(String[] args) throws Exception {

        List<CsvBean> csvResults = csv2json.beanBuilder(args[0], AWSRuleBean.class);
        List<AWSJson> awsJsonRules = new ArrayList<>();

        Iterator<CsvBean> it = csvResults.listIterator();
        while (it.hasNext()) {

            AWSRuleBean csvBean = (AWSRuleBean) it.next();
            awsJsonRules.add( new AWSJson(csvBean.getRuleId(),csvBean.getRuleName(),
                    csvBean.getRuleType(),csvBean.getRuleAction(),csvBean.getTableName()
            ) );

            System.out.println(csvBean.getRuleId());
        }

        String json = new Gson().toJson( awsJsonRules );

        FileWriter  fw = new FileWriter(args[0] + ".txt");
        fw.write(json);
        fw.close();
    }
}
