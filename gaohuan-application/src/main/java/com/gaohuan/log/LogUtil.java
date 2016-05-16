package com.gaohuan.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gh on 2016/4/28 0028.
 */
public class LogUtil {

    public static final Logger logger = LoggerFactory.getLogger(LogUtil.class);

    public static void main(String[] args) {
        try {
            int a = 6 / 0;
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
        }

    }
}
