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
public class PullActionDataRequest extends RpcAcsRequest<PullActionDataResponse> {
	   

	private Integer partitionIndex;

	private Long storeId;

	private Long endMessageId;

	private Integer limit;

	private Long startMessageId;
	public PullActionDataRequest() {
		super("reid_cloud", "2020-10-29", "PullActionData", "1.2.2");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getPartitionIndex() {
		return this.partitionIndex;
	}

	public void setPartitionIndex(Integer partitionIndex) {
		this.partitionIndex = partitionIndex;
		if(partitionIndex != null){
			putBodyParameter("PartitionIndex", partitionIndex.toString());
		}
	}

	public Long getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putBodyParameter("StoreId", storeId.toString());
		}
	}

	public Long getEndMessageId() {
		return this.endMessageId;
	}

	public void setEndMessageId(Long endMessageId) {
		this.endMessageId = endMessageId;
		if(endMessageId != null){
			putBodyParameter("EndMessageId", endMessageId.toString());
		}
	}

	public Integer getLimit() {
		return this.limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
		if(limit != null){
			putBodyParameter("Limit", limit.toString());
		}
	}

	public Long getStartMessageId() {
		return this.startMessageId;
	}

	public void setStartMessageId(Long startMessageId) {
		this.startMessageId = startMessageId;
		if(startMessageId != null){
			putBodyParameter("StartMessageId", startMessageId.toString());
		}
	}

	@Override
	public Class<PullActionDataResponse> getResponseClass() {
		return PullActionDataResponse.class;
	}

}
