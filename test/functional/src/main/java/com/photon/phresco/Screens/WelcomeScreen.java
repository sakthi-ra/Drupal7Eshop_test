/**
 * PHR_DrupalEshop
 *
 * Copyright (C) 1999-2013 Photon Infotech Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.photon.phresco.Screens;

import java.io.IOException;

import com.photon.phresco.uiconstants.CommonDrupalData;
import com.photon.phresco.uiconstants.UIConstants;
import com.photon.phresco.uiconstants.UserInfoConstants;

/**
 * Invoking the super class method through passing the vale of Browser,URL,
 * Context, then DrupalData,UIConstants,UserInfoConstants Xml Values
 * 
 * @throws InterruptedException
 * @throws IOException
 * @throws Exception
 */

public class WelcomeScreen extends PhotonAbstractScreen {
	public WelcomeScreen(String selectedBrowser, String selectedPlatform,
			String applicationURL, String applicationContext,
			CommonDrupalData drupalConstants, UIConstants uiConstants,
			UserInfoConstants userinfo) throws InterruptedException,
			IOException, Exception {
		super(selectedBrowser, selectedPlatform, applicationURL,
				applicationContext, drupalConstants, uiConstants, userinfo);

	}

}
