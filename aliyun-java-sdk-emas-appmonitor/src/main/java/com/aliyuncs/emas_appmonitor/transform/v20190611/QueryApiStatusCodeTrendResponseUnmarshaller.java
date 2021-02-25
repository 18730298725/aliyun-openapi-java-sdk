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

package com.aliyuncs.emas_appmonitor.transform.v20190611;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emas_appmonitor.model.v20190611.QueryApiStatusCodeTrendResponse;
import com.aliyuncs.emas_appmonitor.model.v20190611.QueryApiStatusCodeTrendResponse.MetricResultItem;
import com.aliyuncs.emas_appmonitor.model.v20190611.QueryApiStatusCodeTrendResponse.MetricResultItem.Point;
import com.aliyuncs.emas_appmonitor.model.v20190611.QueryApiStatusCodeTrendResponse.MetricResultItem.Point.PointData;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryApiStatusCodeTrendResponseUnmarshaller {

	public static QueryApiStatusCodeTrendResponse unmarshall(QueryApiStatusCodeTrendResponse queryApiStatusCodeTrendResponse, UnmarshallerContext _ctx) {
		
		queryApiStatusCodeTrendResponse.setRequestId(_ctx.stringValue("QueryApiStatusCodeTrendResponse.RequestId"));

		List<MetricResultItem> metricResultList = new ArrayList<MetricResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryApiStatusCodeTrendResponse.MetricResultList.Length"); i++) {
			MetricResultItem metricResultItem = new MetricResultItem();
			metricResultItem.setTags(_ctx.mapValue("QueryApiStatusCodeTrendResponse.MetricResultList["+ i +"].Tags"));

			List<Point> data = new ArrayList<Point>();
			for (int j = 0; j < _ctx.lengthValue("QueryApiStatusCodeTrendResponse.MetricResultList["+ i +"].Data.Length"); j++) {
				Point point = new Point();
				point.setTime(_ctx.longValue("QueryApiStatusCodeTrendResponse.MetricResultList["+ i +"].Data["+ j +"].Time"));

				PointData pointData = new PointData();
				pointData.setStatus4xxCount(_ctx.longValue("QueryApiStatusCodeTrendResponse.MetricResultList["+ i +"].Data["+ j +"].PointData.Status4xxCount"));
				pointData.setStatus4xxRatio(_ctx.floatValue("QueryApiStatusCodeTrendResponse.MetricResultList["+ i +"].Data["+ j +"].PointData.Status4xxRatio"));
				pointData.setStatus5xxCount(_ctx.longValue("QueryApiStatusCodeTrendResponse.MetricResultList["+ i +"].Data["+ j +"].PointData.Status5xxCount"));
				pointData.setStatus5xxRatio(_ctx.floatValue("QueryApiStatusCodeTrendResponse.MetricResultList["+ i +"].Data["+ j +"].PointData.Status5xxRatio"));
				pointData.setStatusNormalCount(_ctx.longValue("QueryApiStatusCodeTrendResponse.MetricResultList["+ i +"].Data["+ j +"].PointData.StatusNormalCount"));
				pointData.setStatusNormalRatio(_ctx.floatValue("QueryApiStatusCodeTrendResponse.MetricResultList["+ i +"].Data["+ j +"].PointData.StatusNormalRatio"));
				point.setPointData(pointData);

				data.add(point);
			}
			metricResultItem.setData(data);

			metricResultList.add(metricResultItem);
		}
		queryApiStatusCodeTrendResponse.setMetricResultList(metricResultList);
	 
	 	return queryApiStatusCodeTrendResponse;
	}
}