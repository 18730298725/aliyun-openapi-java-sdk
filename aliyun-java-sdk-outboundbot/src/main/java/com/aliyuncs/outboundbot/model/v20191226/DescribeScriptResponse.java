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

package com.aliyuncs.outboundbot.model.v20191226;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.DescribeScriptResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScriptResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Boolean success;

	private String chatbotId;

	private String asrConfig;

	private String ttsConfig;

	private Script script;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getChatbotId() {
		return this.chatbotId;
	}

	public void setChatbotId(String chatbotId) {
		this.chatbotId = chatbotId;
	}

	public String getAsrConfig() {
		return this.asrConfig;
	}

	public void setAsrConfig(String asrConfig) {
		this.asrConfig = asrConfig;
	}

	public String getTtsConfig() {
		return this.ttsConfig;
	}

	public void setTtsConfig(String ttsConfig) {
		this.ttsConfig = ttsConfig;
	}

	public Script getScript() {
		return this.script;
	}

	public void setScript(Script script) {
		this.script = script;
	}

	public static class Script {

		private String debugStatus;

		private String industry;

		private Boolean isDebugDrafted;

		private Boolean isDrafted;

		private String scene;

		private String scriptDescription;

		private String scriptId;

		private String scriptName;

		private String status;

		private Long updateTime;

		private String chatbotId;

		private String asrConfig;

		private String ttsConfig;

		private Boolean miniPlaybackConfigEnabled;

		public String getDebugStatus() {
			return this.debugStatus;
		}

		public void setDebugStatus(String debugStatus) {
			this.debugStatus = debugStatus;
		}

		public String getIndustry() {
			return this.industry;
		}

		public void setIndustry(String industry) {
			this.industry = industry;
		}

		public Boolean getIsDebugDrafted() {
			return this.isDebugDrafted;
		}

		public void setIsDebugDrafted(Boolean isDebugDrafted) {
			this.isDebugDrafted = isDebugDrafted;
		}

		public Boolean getIsDrafted() {
			return this.isDrafted;
		}

		public void setIsDrafted(Boolean isDrafted) {
			this.isDrafted = isDrafted;
		}

		public String getScene() {
			return this.scene;
		}

		public void setScene(String scene) {
			this.scene = scene;
		}

		public String getScriptDescription() {
			return this.scriptDescription;
		}

		public void setScriptDescription(String scriptDescription) {
			this.scriptDescription = scriptDescription;
		}

		public String getScriptId() {
			return this.scriptId;
		}

		public void setScriptId(String scriptId) {
			this.scriptId = scriptId;
		}

		public String getScriptName() {
			return this.scriptName;
		}

		public void setScriptName(String scriptName) {
			this.scriptName = scriptName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getChatbotId() {
			return this.chatbotId;
		}

		public void setChatbotId(String chatbotId) {
			this.chatbotId = chatbotId;
		}

		public String getAsrConfig() {
			return this.asrConfig;
		}

		public void setAsrConfig(String asrConfig) {
			this.asrConfig = asrConfig;
		}

		public String getTtsConfig() {
			return this.ttsConfig;
		}

		public void setTtsConfig(String ttsConfig) {
			this.ttsConfig = ttsConfig;
		}

		public Boolean getMiniPlaybackConfigEnabled() {
			return this.miniPlaybackConfigEnabled;
		}

		public void setMiniPlaybackConfigEnabled(Boolean miniPlaybackConfigEnabled) {
			this.miniPlaybackConfigEnabled = miniPlaybackConfigEnabled;
		}
	}

	@Override
	public DescribeScriptResponse getInstance(UnmarshallerContext context) {
		return	DescribeScriptResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
