package com.example.listviewpractice;

/**
 * Created by 淳中 on 2017/5/1.
 */
public class ScoreItem {
    String teamOneName;
    int teamOneScroe;
    int teamOneImage;
    String teamTwoName;
    int teamTwoScroe;
    int teamTwoImage;
    ScoreItem(String teamOneName,int teamOneScroe,int teamOneImage,String teamTwoName,int teamTwoScroe,int teamTwoImage)
    {
        this.teamOneName=teamOneName;
        this.teamOneScroe=teamOneScroe;
        this.teamOneImage=teamOneImage;
        this.teamTwoName=teamTwoName;
        this.teamTwoScroe=teamTwoScroe;
        this.teamTwoImage=teamTwoImage;
    }
}
