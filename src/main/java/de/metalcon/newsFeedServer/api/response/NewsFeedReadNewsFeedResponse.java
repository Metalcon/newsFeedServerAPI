package de.metalcon.newsFeedServer.api.response;

import java.util.List;

import org.json.simple.JSONObject;

import de.metalcon.newsFeedServer.api.NewsFeedResponse;

public class NewsFeedReadNewsFeedResponse extends NewsFeedResponse {

    /**
     * 
     */
    private static final long serialVersionUID = 544691411632784031L;

    protected List<JSONObject> newsStream;

    /**
     * Status message
     */
    public NewsFeedReadNewsFeedResponse(
            List<JSONObject> newsStream) {
        super();
        this.newsStream = newsStream;
    }

    public List<JSONObject> getNewsStream() {
        return newsStream;
    }

}
