package de.metalcon.newsFeedServer.api.request;

import de.metalcon.domain.Muid;
import de.metalcon.newsFeedServer.api.NewsFeedRequest;

public class NewsFeedCreateStatusUpdateRequest extends NewsFeedRequest {

    /**
     * 
     */
    private static final long serialVersionUID = -8423905084489835155L;

    private String userId;

    private String statusUpdateMuid;

    private String message;

    private String targetMuid;

    /**
     * creates a new status update for the newsfeed
     * 
     * TODO: what about status update type?
     * 
     * @param statusUpdateMuid
     * @param userMuid
     * @param targetMuid
     * @param message
     */
    public NewsFeedCreateStatusUpdateRequest(
            Muid statusUpdateMuid,
            Muid userMuid,
            Muid targetMuid,
            String message) {
        this.message = message;
        userId = userMuid.toString();
        this.statusUpdateMuid = statusUpdateMuid.toString();
        this.targetMuid = targetMuid.toString();
    }

    public String getUserId() {
        return userId;
    }

    public String getStatusUpdateMuid() {
        return statusUpdateMuid;
    }

    public String getMessage() {
        return message;
    }

    public String getTargetMuid() {
        return targetMuid;
    }

}
