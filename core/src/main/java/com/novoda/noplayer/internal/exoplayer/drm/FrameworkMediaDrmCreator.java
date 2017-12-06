package com.novoda.noplayer.internal.exoplayer.drm;

import com.google.android.exoplayer2.drm.FrameworkMediaDrm;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;

import java.util.UUID;

class FrameworkMediaDrmCreator {

    FrameworkMediaDrm create(UUID uuid) {
        try {
            return FrameworkMediaDrm.newInstance(uuid);
        } catch (UnsupportedDrmException e) {
            throw new FrameworkMediaDrmException(e.getMessage(), e.getCause());
        }
    }

    private static class FrameworkMediaDrmException extends RuntimeException {

        FrameworkMediaDrmException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
