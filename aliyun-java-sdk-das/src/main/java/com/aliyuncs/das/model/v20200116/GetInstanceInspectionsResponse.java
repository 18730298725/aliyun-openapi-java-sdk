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

package com.aliyuncs.das.model.v20200116;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.das.transform.v20200116.GetInstanceInspectionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceInspectionsResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private String success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long pageSize;

		private Long total;

		private Long pageNo;

		private List<BaseInspection> list;

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public Long getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Long pageNo) {
			this.pageNo = pageNo;
		}

		public List<BaseInspection> getList() {
			return this.list;
		}

		public void setList(List<BaseInspection> list) {
			this.list = list;
		}

		public static class BaseInspection {

			private Integer score;

			private Long gmtCreate;

			private String scoreMap;

			private Long endTime;

			private Long startTime;

			private String data;

			private Instance instance;

			public Integer getScore() {
				return this.score;
			}

			public void setScore(Integer score) {
				this.score = score;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getScoreMap() {
				return this.scoreMap;
			}

			public void setScoreMap(String scoreMap) {
				this.scoreMap = scoreMap;
			}

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public String getData() {
				return this.data;
			}

			public void setData(String data) {
				this.data = data;
			}

			public Instance getInstance() {
				return this.instance;
			}

			public void setInstance(Instance instance) {
				this.instance = instance;
			}

			public static class Instance {

				private String engineVersion;

				private String accountId;

				private String uuid;

				private String vpcId;

				private String instanceId;

				private String networkType;

				private String nodeId;

				private String instanceArea;

				private String region;

				private String instanceClass;

				private String engine;

				public String getEngineVersion() {
					return this.engineVersion;
				}

				public void setEngineVersion(String engineVersion) {
					this.engineVersion = engineVersion;
				}

				public String getAccountId() {
					return this.accountId;
				}

				public void setAccountId(String accountId) {
					this.accountId = accountId;
				}

				public String getUuid() {
					return this.uuid;
				}

				public void setUuid(String uuid) {
					this.uuid = uuid;
				}

				public String getVpcId() {
					return this.vpcId;
				}

				public void setVpcId(String vpcId) {
					this.vpcId = vpcId;
				}

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}

				public String getNetworkType() {
					return this.networkType;
				}

				public void setNetworkType(String networkType) {
					this.networkType = networkType;
				}

				public String getNodeId() {
					return this.nodeId;
				}

				public void setNodeId(String nodeId) {
					this.nodeId = nodeId;
				}

				public String getInstanceArea() {
					return this.instanceArea;
				}

				public void setInstanceArea(String instanceArea) {
					this.instanceArea = instanceArea;
				}

				public String getRegion() {
					return this.region;
				}

				public void setRegion(String region) {
					this.region = region;
				}

				public String getInstanceClass() {
					return this.instanceClass;
				}

				public void setInstanceClass(String instanceClass) {
					this.instanceClass = instanceClass;
				}

				public String getEngine() {
					return this.engine;
				}

				public void setEngine(String engine) {
					this.engine = engine;
				}
			}
		}
	}

	@Override
	public GetInstanceInspectionsResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceInspectionsResponseUnmarshaller.unmarshall(this, context);
	}
}
