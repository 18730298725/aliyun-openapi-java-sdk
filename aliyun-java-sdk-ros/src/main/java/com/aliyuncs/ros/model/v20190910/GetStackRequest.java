/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ros.model.v20190910;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ros.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetStackRequest extends RpcAcsRequest<GetStackResponse> {
	   

	private String clientToken;

	private String stackId;

	private String showResourceProgress;

	private String outputOption;
	public GetStackRequest() {
		super("ROS", "2019-09-10", "GetStack", "ros");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getStackId() {
		return this.stackId;
	}

	public void setStackId(String stackId) {
		this.stackId = stackId;
		if(stackId != null){
			putQueryParameter("StackId", stackId);
		}
	}

	public String getShowResourceProgress() {
		return this.showResourceProgress;
	}

	public void setShowResourceProgress(String showResourceProgress) {
		this.showResourceProgress = showResourceProgress;
		if(showResourceProgress != null){
			putQueryParameter("ShowResourceProgress", showResourceProgress);
		}
	}

	public String getOutputOption() {
		return this.outputOption;
	}

	public void setOutputOption(String outputOption) {
		this.outputOption = outputOption;
		if(outputOption != null){
			putQueryParameter("OutputOption", outputOption);
		}
	}

	@Override
	public Class<GetStackResponse> getResponseClass() {
		return GetStackResponse.class;
	}

}
