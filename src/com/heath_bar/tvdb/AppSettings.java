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
package com.heath_bar.tvdb;


public final class AppSettings {

	public static final String API_KEY = "0A41C0DEA5531762";
	public static final String BASE_URL =  "http://thetvdb.com/api/" + API_KEY + "/";
	public static final String SERIES_BASIC_URL = "http://www.thetvdb.com/api/GetSeries.php?seriesname=";
	public static final String SERIES_FULL_URL = "http://thetvdb.com/api/0A41C0DEA5531762/series/"; // <seriesid>/all/en.xml
	public static final String EPISODE_FULL_URL = "http://thetvdb.com/api/0A41C0DEA5531762/episodes/"; // <seriesid>/all/en.xml
	public static final String SERIES_BANNER_URL = "http://thetvdb.com/banners/";
	public static final boolean LOG_ENABLED = true;
	public static final int DATABASE_VERSION = 1;
	public static final int[] listBackgroundColors = new int[]{0xff002337, 0xff001d2d};	// R.color.blue1 & R.color.blue2
	public static final String PREFS_NAME = "TheTVDBSettings";
	
}
