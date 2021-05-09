package testData;

import testData.coreClasses.Institution;

import java.util.HashMap;
import java.util.Map;

public class TestDataCompositor {

    private Map<String, Object> $imports;

    public TestDataCompositor() {
        $imports = new HashMap<String, Object>();
    }

    public void setData(String alias, Object data) {
        $imports.put(alias, data);
    }

    public Object getData(String alias) {
        return $imports.get(alias);
    }

}
