package de.metalcon.newsFeedServer.api.request;

import de.metalcon.domain.Muid;
import de.metalcon.newsFeedServer.api.NewsFeedRequest;

public class NewsFeedReadNewsFeedRequest extends NewsFeedRequest {

    /**
     * 
     */
    private static final long serialVersionUID = -8423905084489835155L;

    private String feedOwnerMuid;

    private String requestingUserMuid;

    private int numItems;

    private boolean ownUpdates;

    public String getFeedOwnerMuid() {
        return feedOwnerMuid;
    }

    public String getRequestingUserMuid() {
        return requestingUserMuid;
    }

    public int getNumItems() {
        return numItems;
    }

    public boolean isOwnUpdates() {
        return ownUpdates;
    }

    /**
     * creates a follow edge between to users in the news feed. If the user did
     * not exist the user will be created
     * 
     * @param fromMuid
     * @param toMuid
     */
    public NewsFeedReadNewsFeedRequest(
            Muid feedOwnerMuid,
            Muid requestingUserMuid,
            int numItems,
            boolean ownUpdates) {
        this.feedOwnerMuid = feedOwnerMuid.toString();
        this.requestingUserMuid = requestingUserMuid.toString();
        this.numItems = numItems;
        this.ownUpdates = ownUpdates;
    }

}
