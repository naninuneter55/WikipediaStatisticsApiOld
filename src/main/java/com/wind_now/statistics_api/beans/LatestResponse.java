/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wind_now.statistics_api.beans;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lombok.Data;

/**
 *
 * @author ono
 */
@Data
public class LatestResponse implements Serializable {

    @SerializedName("daily_views")
    private LinkedHashMap<String, Integer> dailyViews;

    @SerializedName("project")
    private String project;

    @SerializedName("month")
    private String month;

    @SerializedName("rank")
    private Integer rank;

    @SerializedName("title")
    private String title;

}
