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

package com.aliyuncs.oos.model.v20190601;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.oos.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteStateConfigurationsRequest extends RpcAcsRequest<DeleteStateConfigurationsResponse> {
	   

	private String stateConfigurationIds;

	private String clientToken;
	public DeleteStateConfigurationsRequest() {
		super("oos", "2019-06-01", "DeleteStateConfigurations", "oos");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStateConfigurationIds() {
		return this.stateConfigurationIds;
	}

	public void setStateConfigurationIds(String stateConfigurationIds) {
		this.stateConfigurationIds = stateConfigurationIds;
		if(stateConfigurationIds != null){
			putQueryParameter("StateConfigurationIds", stateConfigurationIds);
		}
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

	@Override
	public Class<DeleteStateConfigurationsResponse> getResponseClass() {
		return DeleteStateConfigurationsResponse.class;
	}

}
