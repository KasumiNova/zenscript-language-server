package youyihj.probezs.api;

import java.util.Collections;
import java.util.Map;

/**
 * @author youyihj
 */
public class BracketHandlerResult {

    private final String type;
    private final Map<String, String> extras;

    public BracketHandlerResult(String type, Map<String, String> extras) {
        this.type = type;
        this.extras = extras;
    }

    public BracketHandlerResult() {
        this.type = "";
        this.extras = Collections.emptyMap();
    }

    public String getType() {
        return type;
    }

    public Map<String, String> getExtras() {
        return extras;
    }

}