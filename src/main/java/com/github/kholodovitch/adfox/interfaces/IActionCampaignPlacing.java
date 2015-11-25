package com.github.kholodovitch.adfox.interfaces;

import com.github.kholodovitch.adfox.exceptions.AdFoxException;
import com.github.kholodovitch.adfox.objects.ActionObject;

public interface IActionCampaignPlacing {
	boolean set(ActionObject actionObject, int actionObjectID, boolean actionStatus) throws AdFoxException;
}
