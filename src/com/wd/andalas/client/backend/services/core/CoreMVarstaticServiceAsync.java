package com.wd.andalas.client.backend.services.core;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.wd.andalas.client.frontend.models.core.CoreMVarstaticDTO;

public interface CoreMVarstaticServiceAsync {

	void selectById(String id, AsyncCallback<CoreMVarstaticDTO> callback);

}
