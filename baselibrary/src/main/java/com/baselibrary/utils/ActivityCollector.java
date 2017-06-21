package com.baselibrary.utils;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hesm on 2017/6/21.
 * 用来操作activity的工具类，用于管理所有的activities
 */

public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<>();

    /**
     * 增加activity
     * @param activity
     */
    public static void addActivity(Activity activity) {
        activities.add(activity);
    }

    /**
     * 移除activity
     * @param activity
     */
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    /**
     * 结束所有的activities，退出程序
     */
    public static void finishAll(){
        for(Activity activity:activities){
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
