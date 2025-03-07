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

package com.aliyuncs.companyreg.model.v20201022;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.companyreg.transform.v20201022.ListEnterprisesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEnterprisesResponse extends AcsResponse {

	private String requestId;

	private List<EnterprisesListItem> enterprisesList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EnterprisesListItem> getEnterprisesList() {
		return this.enterprisesList;
	}

	public void setEnterprisesList(List<EnterprisesListItem> enterprisesList) {
		this.enterprisesList = enterprisesList;
	}

	public static class EnterprisesListItem {

		private String taxNo;

		private String enterpriseName;

		public String getTaxNo() {
			return this.taxNo;
		}

		public void setTaxNo(String taxNo) {
			this.taxNo = taxNo;
		}

		public String getEnterpriseName() {
			return this.enterpriseName;
		}

		public void setEnterpriseName(String enterpriseName) {
			this.enterpriseName = enterpriseName;
		}
	}

	@Override
	public ListEnterprisesResponse getInstance(UnmarshallerContext context) {
		return	ListEnterprisesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
