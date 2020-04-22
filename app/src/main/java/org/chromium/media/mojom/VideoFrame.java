
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/interfaces/media_types.mojom
//

package org.chromium.media.mojom;

import org.chromium.base.annotations.SuppressFBWarnings;
import org.chromium.mojo.bindings.DeserializationException;


public final class VideoFrame extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 64;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(64, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int format;
    public org.chromium.gfx.mojom.Size codedSize;
    public org.chromium.gfx.mojom.Rect visibleRect;
    public org.chromium.gfx.mojom.Size naturalSize;
    public boolean endOfStream;
    public org.chromium.mojo.common.mojom.TimeDelta timestamp;
    public VideoFrameData data;

    private VideoFrame(int version) {
        super(STRUCT_SIZE, version);
    }

    public VideoFrame() {
        this(0);
    }

    public static VideoFrame deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static VideoFrame deserialize(java.nio.ByteBuffer data) {
        if (data == null)
            return null;

        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static VideoFrame decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        VideoFrame result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            result = new VideoFrame(mainDataHeader.elementsOrVersion);
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.format = decoder0.readInt(8);
                    VideoPixelFormat.validate(result.format);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.endOfStream = decoder0.readBoolean(12, 0);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.codedSize = org.chromium.gfx.mojom.Size.decode(decoder1);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.visibleRect = org.chromium.gfx.mojom.Rect.decode(decoder1);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.naturalSize = org.chromium.gfx.mojom.Size.decode(decoder1);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, false);
                result.timestamp = org.chromium.mojo.common.mojom.TimeDelta.decode(decoder1);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.data = VideoFrameData.decode(decoder0, 48);
            }
        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(format, 8);
        
        encoder0.encode(endOfStream, 12, 0);
        
        encoder0.encode(codedSize, 16, false);
        
        encoder0.encode(visibleRect, 24, false);
        
        encoder0.encode(naturalSize, 32, false);
        
        encoder0.encode(timestamp, 40, false);
        
        encoder0.encode(data, 48, true);
    }

    /**
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object object) {
        if (object == this)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        VideoFrame other = (VideoFrame) object;
        if (this.format!= other.format)
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.codedSize, other.codedSize))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.visibleRect, other.visibleRect))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.naturalSize, other.naturalSize))
            return false;
        if (this.endOfStream!= other.endOfStream)
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.timestamp, other.timestamp))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.data, other.data))
            return false;
        return true;
    }

    /**
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = prime + getClass().hashCode();
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(format);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(codedSize);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(visibleRect);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(naturalSize);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(endOfStream);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(timestamp);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(data);
        return result;
    }
}