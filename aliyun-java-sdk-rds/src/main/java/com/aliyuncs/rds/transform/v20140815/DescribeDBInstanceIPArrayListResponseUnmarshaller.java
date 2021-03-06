/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.rds.transform.v20140815;

import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceIPArrayListResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceIPArrayListResponse.DBInstanceIPArray;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;

public class DescribeDBInstanceIPArrayListResponseUnmarshaller {

    public static DescribeDBInstanceIPArrayListResponse unmarshall(
            DescribeDBInstanceIPArrayListResponse describeDBInstanceIPArrayListResponse,
            UnmarshallerContext context) {

        describeDBInstanceIPArrayListResponse.setRequestId(
                context.stringValue("DescribeDBInstanceIPArrayListResponse.RequestId"));

        List<DBInstanceIPArray> items = new ArrayList<DBInstanceIPArray>();
        for (int i = 0;
             i < context.lengthValue("DescribeDBInstanceIPArrayListResponse.Items.Length"); i++) {
            DBInstanceIPArray dBInstanceIPArray = new DBInstanceIPArray();
            dBInstanceIPArray.setDBInstanceIPArrayName(context.stringValue(
                    "DescribeDBInstanceIPArrayListResponse.Items[" + i
                            + "].DBInstanceIPArrayName"));
            dBInstanceIPArray.setDBInstanceIPArrayAttribute(context.stringValue(
                    "DescribeDBInstanceIPArrayListResponse.Items[" + i
                            + "].DBInstanceIPArrayAttribute"));
            dBInstanceIPArray.setSecurityIPList(context.stringValue(
                    "DescribeDBInstanceIPArrayListResponse.Items[" + i + "].SecurityIPList"));

            items.add(dBInstanceIPArray);
        }
        describeDBInstanceIPArrayListResponse.setItems(items);

        return describeDBInstanceIPArrayListResponse;
    }
}
