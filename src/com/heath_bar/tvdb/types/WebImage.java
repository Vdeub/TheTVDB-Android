/*
│──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────│
│                                                  TERMS OF USE: MIT License                                                   │
│                                                  Copyright © 2012 Heath Paddock                                              │
├──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┤
│Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation    │ 
│files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy,    │
│modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software│
│is furnished to do so, subject to the following conditions:                                                                   │
│                                                                                                                              │
│The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.│
│                                                                                                                              │
│THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE          │
│WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR         │
│COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,   │
│ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.                         │
├──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┤
 */
package com.heath_bar.tvdb.types;

import android.content.Context;
import android.graphics.Bitmap;

import com.heath_bar.tvdb.util.ImageUtil;

public class WebImage {

	private String id;
	private String url;
	private Bitmap bitmap;
	private WebImage thumbnail;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Bitmap getBitmap() {
		return bitmap;
	}
	public WebImage getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(WebImage thumbnail) {
		this.thumbnail = thumbnail;
	}

	public Bitmap Load(Context ctx, boolean... force) {
		return Load(ctx, 0, 0, force);
	}
	
	public Bitmap Load(Context ctx, int maxWidth, int maxHeight, boolean... force) {
		if (url != null && !url.equals("")){
    		if (bitmap == null || (force.length > 0 && force[0] == true)){
    			bitmap = ImageUtil.LoadImage(ctx, url, maxWidth, maxHeight);
    		}
		}
		return bitmap;
	}
}
