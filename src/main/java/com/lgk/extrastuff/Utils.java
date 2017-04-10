package com.lgk.extrastuff;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Dunng on 27/03/2017.
 */
public class Utils {

    private static Logger logger;

    public static Logger getLogger() {
        if(logger == null) {
            logger = LogManager.getFormatterLogger(Reference.MODID);
        }
        return logger;
    }

}
