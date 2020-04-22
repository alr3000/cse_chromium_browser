// Copyright 2015 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.webapps;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import org.chromium.chrome.browser.compositor.layouts.eventfilter.EdgeSwipeHandler;
import org.chromium.chrome.browser.compositor.resources.ResourceFactory;
import org.chromium.chrome.browser.widget.ClipDrawableProgressBar.DrawingInfo;
import org.chromium.chrome.browser.widget.ControlContainer;
import org.chromium.chrome.browser.widget.ViewResourceFrameLayout;
import org.chromium.ui.resources.dynamics.ViewResourceAdapter;

/**
 * The control container used by WebApps.
 */
public class WebappControlContainer extends ViewResourceFrameLayout
        implements ControlContainer {
    private class WebAppViewResourceAdapter extends ViewResourceAdapter {
        private final Rect mToolbarRect = new Rect();
        private final Rect mLocationBarContentRect = new Rect();

        public WebAppViewResourceAdapter(View view) {
            super(view);
        }

        @Override
        public long createNativeResource() {
            mToolbarRect.set(0, 0, getWidth(), getHeight());
            mLocationBarContentRect.set(0, 0, getWidth(), getHeight());
            return ResourceFactory.createToolbarContainerResource(
                    mToolbarRect, mLocationBarContentRect, 0);
        }
    }

    /** Constructor for inflating from XML. */
    public WebappControlContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void initWithToolbar(int toolbarLayoutId) {
    }

    @Override
    protected final ViewResourceAdapter createResourceAdapter() {
        return new WebAppViewResourceAdapter(this);
    }

    @Override
    public ViewResourceAdapter getToolbarResourceAdapter() {
        return getResourceAdapter();
    }

    @Override
    public void getProgressBarDrawingInfo(DrawingInfo drawingInfoOut) {
    }

    @Override
    public void setSwipeHandler(EdgeSwipeHandler handler) {
    }

    @Override
    public int getToolbarBackgroundColor() {
        return Color.WHITE;
    }

    @Override
    public View getView() {
        return this;
    }
}
