package com.medone.rudev30.archtest.interactors.sendmessage;

import android.os.Build;
import android.support.annotation.RequiresApi;

/**
 * Created by Orlov Denis on 29.05.2018.
 * ru.dev30@kgk-global.com
 */
public class StorageException extends RuntimeException {
    public StorageException() {
        super();
    }

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }

    public StorageException(Throwable cause) {
        super(cause);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    protected StorageException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
