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

package com.aliyuncs.reid_cloud.model.v20201029;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.reid_cloud.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeOverviewDataRequest extends RpcAcsRequest<DescribeOverviewDataResponse> {
	   

	private String date;

	private String storeIds;
	public DescribeOverviewDataRequest() {
		super("reid_cloud", "2020-10-29", "DescribeOverviewData", "1.2.2");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
		if(date != null){
			putBodyParameter("Date", date);
		}
	}

	public String getStoreIds() {
		return this.storeIds;
	}

	public void setStoreIds(String storeIds) {
		this.storeIds = storeIds;
		if(storeIds != null){
			putBodyParameter("StoreIds", storeIds);
		}
	}

	@Override
	public Class<DescribeOverviewDataResponse> getResponseClass() {
		return DescribeOverviewDataResponse.class;
	}

}
