package de.metalcon.newsFeedServer.api.request;

import de.metalcon.domain.Muid;
import de.metalcon.newsFeedServer.api.NewsFeedRequest;

public class NewsFeedRemoveFriendshipRequest extends NewsFeedRequest {

    /**
     * 
     */
    private static final long serialVersionUID = -8423905084489835155L;

    private String fromUserMuid;

    private String toUserMuid;

    public String getFromUserMuid() {
        return fromUserMuid;
    }

    public String getToUserMuid() {
        return toUserMuid;
    }

    /**
     * creates a follow edge between to users in the news feed. If the user did
     * not exist the user will be created
     * 
     * @param fromMuid
     * @param toMuid
     */
    public NewsFeedRemoveFriendshipRequest(
            Muid fromMuid,
            Muid toMuid) {
        fromUserMuid = fromMuid.toString();
        toUserMuid = toMuid.toString();
    }

}
