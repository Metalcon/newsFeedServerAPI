package de.metalcon.newsFeedServer.api.request;

import de.metalcon.domain.Muid;
import de.metalcon.newsFeedServer.api.NewsFeedRequest;

public class NewsFeedDeleteStatusUpdateRequest extends NewsFeedRequest {

    /**
     * 
     */
    private static final long serialVersionUID = -8423905084489835155L;

    private String userId;

    private String statusUpdateMuid;

    public String getUserId() {
        return userId;
    }

    public String getStatusUpdateMuid() {
        return statusUpdateMuid;
    }

    /**
     * deletes a new status update for the newsfeed
     * 
     * @param userMuid
     * @param statusUpdateMuid
     * @param message
     */
    public NewsFeedDeleteStatusUpdateRequest(
            Muid userMuid,
            Muid statusUpdateMuid,
            String message) {
        userId = userMuid.toString();
        this.statusUpdateMuid = this.statusUpdateMuid.toString();
    }
}
