package matcher;

import org.openqa.grid.internal.utils.DefaultCapabilityMatcher;

import java.util.Map;

/**
 * Created by Furkanbirgul on 7/26/2021
 */
public class BoutiqueRugsCapabilityMatcher extends DefaultCapabilityMatcher {

    @Override
    public boolean matches(Map<String, Object> nodeCapabilities, Map<String, Object> requestedCapabilities) {

        String nodeTag = "nodeTag";

        boolean basicChecks = super.matches(nodeCapabilities, requestedCapabilities);

        // If the request does not have the special capability, we return what the DefaultCapabilityMatcher returns
        if (!requestedCapabilities.containsKey(nodeTag)) {
            return basicChecks;
        }

        // We check that the node contains the special capability and if so, we try to match the capabilities
        if (nodeCapabilities.containsKey(nodeTag)) {
            return basicChecks && nodeCapabilities.get(nodeTag).equals(requestedCapabilities.get(nodeTag));
        }

        // If none of the previous matched, the node does not have the capabilities
        return false;

    }
}
