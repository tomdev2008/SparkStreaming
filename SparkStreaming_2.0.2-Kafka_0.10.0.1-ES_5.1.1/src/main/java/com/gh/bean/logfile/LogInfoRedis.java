package com.gh.bean.logfile;

import java.io.Serializable;

/**
 * Created by GH-GAN on 2016/11/24.
 */
public class LogInfoRedis  implements Serializable {
    String log_time;
    String warn_type;
    String message;

    public String getLog_time() {
        return log_time;
    }

    public void setLog_time(String log_time) {
        this.log_time = log_time;
    }

    public String getWarn_type() {
        return warn_type;
    }

    public void setWarn_type(String warn_type) {
        this.warn_type = warn_type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
