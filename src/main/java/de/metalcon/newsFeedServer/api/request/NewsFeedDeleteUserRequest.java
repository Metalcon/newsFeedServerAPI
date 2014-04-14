package de.metalcon.newsFeedServer.api.request;

import de.metalcon.domain.Muid;
import de.metalcon.newsFeedServer.api.NewsFeedRequest;

public class NewsFeedDeleteUserRequest extends NewsFeedRequest {

    /**
     * 
     */
    private static final long serialVersionUID = -8423905084489835155L;

    private String entityId;

    public NewsFeedDeleteUserRequest(
            Muid muid) {
        entityId = muid.toString();
    }

    public String getEntityId() {
        return entityId;
    }
}
