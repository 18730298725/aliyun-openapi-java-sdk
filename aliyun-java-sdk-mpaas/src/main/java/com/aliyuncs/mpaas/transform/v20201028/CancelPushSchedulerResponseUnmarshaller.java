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

package com.aliyuncs.mpaas.transform.v20201028;

import com.aliyuncs.mpaas.model.v20201028.CancelPushSchedulerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelPushSchedulerResponseUnmarshaller {

	public static CancelPushSchedulerResponse unmarshall(CancelPushSchedulerResponse cancelPushSchedulerResponse, UnmarshallerContext _ctx) {
		
		cancelPushSchedulerResponse.setRequestId(_ctx.stringValue("CancelPushSchedulerResponse.RequestId"));
		cancelPushSchedulerResponse.setResultCode(_ctx.stringValue("CancelPushSchedulerResponse.ResultCode"));
		cancelPushSchedulerResponse.setResultMessage(_ctx.stringValue("CancelPushSchedulerResponse.ResultMessage"));
		cancelPushSchedulerResponse.setResultContent(_ctx.stringValue("CancelPushSchedulerResponse.ResultContent"));
	 
	 	return cancelPushSchedulerResponse;
	}
}