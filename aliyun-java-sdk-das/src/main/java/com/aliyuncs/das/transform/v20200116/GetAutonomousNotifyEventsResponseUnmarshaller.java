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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.GetAutonomousNotifyEventsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAutonomousNotifyEventsResponseUnmarshaller {

	public static GetAutonomousNotifyEventsResponse unmarshall(GetAutonomousNotifyEventsResponse getAutonomousNotifyEventsResponse, UnmarshallerContext _ctx) {
		
		getAutonomousNotifyEventsResponse.setRequestId(_ctx.stringValue("GetAutonomousNotifyEventsResponse.RequestId"));
		getAutonomousNotifyEventsResponse.setMessage(_ctx.stringValue("GetAutonomousNotifyEventsResponse.Message"));
		getAutonomousNotifyEventsResponse.setData(_ctx.stringValue("GetAutonomousNotifyEventsResponse.Data"));
		getAutonomousNotifyEventsResponse.setCode(_ctx.stringValue("GetAutonomousNotifyEventsResponse.Code"));
		getAutonomousNotifyEventsResponse.setSuccess(_ctx.stringValue("GetAutonomousNotifyEventsResponse.Success"));
	 
	 	return getAutonomousNotifyEventsResponse;
	}
}