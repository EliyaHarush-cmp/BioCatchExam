package com.eliya.harush.exam.biocatch.api.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ScoreEntity {

    public String bcStatus;
    public String customerSessionID;
    public int integrated_score_rule;
    public String ip;
    public boolean isBot;
    public boolean isMalware;
    public boolean isRat;
    public int max30DayScore;
    public String muid;
    public int numberOfWups;
    public int score;

}
