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

package com.aliyuncs.cloudauth.transform.v20190307;

import com.aliyuncs.cloudauth.model.v20190307.DeleteWhitelistSettingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteWhitelistSettingResponseUnmarshaller {

	public static DeleteWhitelistSettingResponse unmarshall(DeleteWhitelistSettingResponse deleteWhitelistSettingResponse, UnmarshallerContext _ctx) {
		
		deleteWhitelistSettingResponse.setRequestId(_ctx.stringValue("DeleteWhitelistSettingResponse.RequestId"));
		deleteWhitelistSettingResponse.setResultObject(_ctx.booleanValue("DeleteWhitelistSettingResponse.ResultObject"));
	 
	 	return deleteWhitelistSettingResponse;
	}
}