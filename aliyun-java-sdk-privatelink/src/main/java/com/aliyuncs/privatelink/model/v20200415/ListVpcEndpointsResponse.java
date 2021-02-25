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

package com.aliyuncs.privatelink.model.v20200415;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.privatelink.transform.v20200415.ListVpcEndpointsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVpcEndpointsResponse extends AcsResponse {

	private String maxResults;

	private String nextToken;

	private String requestId;

	private List<Endpoint> endpoints;

	public String getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(String maxResults) {
		this.maxResults = maxResults;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Endpoint> getEndpoints() {
		return this.endpoints;
	}

	public void setEndpoints(List<Endpoint> endpoints) {
		this.endpoints = endpoints;
	}

	public static class Endpoint {

		private String endpointId;

		private String endpointName;

		private String endpointDescription;

		private String endpointStatus;

		private String endpointBusinessStatus;

		private String endpointDomain;

		private Long bandwidth;

		private String connectionStatus;

		private String serviceId;

		private String serviceName;

		private String vpcId;

		private String createTime;

		private String regionId;

		private Boolean resourceOwner;

		public String getEndpointId() {
			return this.endpointId;
		}

		public void setEndpointId(String endpointId) {
			this.endpointId = endpointId;
		}

		public String getEndpointName() {
			return this.endpointName;
		}

		public void setEndpointName(String endpointName) {
			this.endpointName = endpointName;
		}

		public String getEndpointDescription() {
			return this.endpointDescription;
		}

		public void setEndpointDescription(String endpointDescription) {
			this.endpointDescription = endpointDescription;
		}

		public String getEndpointStatus() {
			return this.endpointStatus;
		}

		public void setEndpointStatus(String endpointStatus) {
			this.endpointStatus = endpointStatus;
		}

		public String getEndpointBusinessStatus() {
			return this.endpointBusinessStatus;
		}

		public void setEndpointBusinessStatus(String endpointBusinessStatus) {
			this.endpointBusinessStatus = endpointBusinessStatus;
		}

		public String getEndpointDomain() {
			return this.endpointDomain;
		}

		public void setEndpointDomain(String endpointDomain) {
			this.endpointDomain = endpointDomain;
		}

		public Long getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Long bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getConnectionStatus() {
			return this.connectionStatus;
		}

		public void setConnectionStatus(String connectionStatus) {
			this.connectionStatus = connectionStatus;
		}

		public String getServiceId() {
			return this.serviceId;
		}

		public void setServiceId(String serviceId) {
			this.serviceId = serviceId;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Boolean getResourceOwner() {
			return this.resourceOwner;
		}

		public void setResourceOwner(Boolean resourceOwner) {
			this.resourceOwner = resourceOwner;
		}
	}

	@Override
	public ListVpcEndpointsResponse getInstance(UnmarshallerContext context) {
		return	ListVpcEndpointsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
