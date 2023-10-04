package com.css.dao;

import com.css.bll.Feedback;
import java.io.IOException;
import java.util.ArrayList;

public interface FeedbackDao {

    void saveFeedback(Feedback f) throws IOException;

    ArrayList<String> getAllFeedbacks() throws IOException;
}
