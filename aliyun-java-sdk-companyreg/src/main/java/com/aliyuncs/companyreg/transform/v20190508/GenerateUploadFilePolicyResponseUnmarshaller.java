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

package com.aliyuncs.companyreg.transform.v20190508;

import com.aliyuncs.companyreg.model.v20190508.GenerateUploadFilePolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateUploadFilePolicyResponseUnmarshaller {

	public static GenerateUploadFilePolicyResponse unmarshall(GenerateUploadFilePolicyResponse generateUploadFilePolicyResponse, UnmarshallerContext _ctx) {
		
		generateUploadFilePolicyResponse.setRequestId(_ctx.stringValue("GenerateUploadFilePolicyResponse.RequestId"));
		generateUploadFilePolicyResponse.setEncodedPolicy(_ctx.stringValue("GenerateUploadFilePolicyResponse.EncodedPolicy"));
		generateUploadFilePolicyResponse.setAccessId(_ctx.stringValue("GenerateUploadFilePolicyResponse.AccessId"));
		generateUploadFilePolicyResponse.setSignature(_ctx.stringValue("GenerateUploadFilePolicyResponse.Signature"));
		generateUploadFilePolicyResponse.setFileDir(_ctx.stringValue("GenerateUploadFilePolicyResponse.FileDir"));
		generateUploadFilePolicyResponse.setHost(_ctx.stringValue("GenerateUploadFilePolicyResponse.Host"));
		generateUploadFilePolicyResponse.setExpireTime(_ctx.longValue("GenerateUploadFilePolicyResponse.ExpireTime"));
		generateUploadFilePolicyResponse.setFileUrl(_ctx.stringValue("GenerateUploadFilePolicyResponse.FileUrl"));
	 
	 	return generateUploadFilePolicyResponse;
	}
}