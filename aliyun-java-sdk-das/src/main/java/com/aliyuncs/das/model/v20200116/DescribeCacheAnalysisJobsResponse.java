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
import com.aliyuncs.das.transform.v20200116.DescribeCacheAnalysisJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCacheAnalysisJobsResponse extends AcsResponse {

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

		private String extra;

		private Long pageSize;

		private Long total;

		private Long pageNo;

		private List<CacheAnalysisJob> list;

		public String getExtra() {
			return this.extra;
		}

		public void setExtra(String extra) {
			this.extra = extra;
		}

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

		public List<CacheAnalysisJob> getList() {
			return this.list;
		}

		public void setList(List<CacheAnalysisJob> list) {
			this.list = list;
		}

		public static class CacheAnalysisJob {

			private String message;

			private String instanceId;

			private String nodeId;

			private String taskState;

			private String jobId;

			private List<KeyInfo> bigKeys;

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}

			public String getTaskState() {
				return this.taskState;
			}

			public void setTaskState(String taskState) {
				this.taskState = taskState;
			}

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}

			public List<KeyInfo> getBigKeys() {
				return this.bigKeys;
			}

			public void setBigKeys(List<KeyInfo> bigKeys) {
				this.bigKeys = bigKeys;
			}

			public static class KeyInfo {

				private Long bytes;

				private String type;

				private String nodeId;

				private Long expirationTimeMillis;

				private String encoding;

				private Long count;

				private String key;

				private Integer db;

				public Long getBytes() {
					return this.bytes;
				}

				public void setBytes(Long bytes) {
					this.bytes = bytes;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getNodeId() {
					return this.nodeId;
				}

				public void setNodeId(String nodeId) {
					this.nodeId = nodeId;
				}

				public Long getExpirationTimeMillis() {
					return this.expirationTimeMillis;
				}

				public void setExpirationTimeMillis(Long expirationTimeMillis) {
					this.expirationTimeMillis = expirationTimeMillis;
				}

				public String getEncoding() {
					return this.encoding;
				}

				public void setEncoding(String encoding) {
					this.encoding = encoding;
				}

				public Long getCount() {
					return this.count;
				}

				public void setCount(Long count) {
					this.count = count;
				}

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public Integer getDb() {
					return this.db;
				}

				public void setDb(Integer db) {
					this.db = db;
				}
			}
		}
	}

	@Override
	public DescribeCacheAnalysisJobsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCacheAnalysisJobsResponseUnmarshaller.unmarshall(this, context);
	}
}
