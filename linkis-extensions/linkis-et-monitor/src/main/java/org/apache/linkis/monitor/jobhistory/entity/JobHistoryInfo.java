/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.linkis.monitor.jobhistory.entity;

import java.util.Date;

public class JobHistoryInfo {
  private String jobReqId;
  private String submitUser;
  private String executeUser;
  private String source;
  private String labels;
  private String params;
  private String progress;
  private String status;
  private String logPath;
  private Integer errorCode;
  private String errorDesc;
  private Date createdTime;
  private Date updatedTime;
  private String instances;
  private String metrics;
  private String engineType;
  private String executionCode;

  public JobHistoryInfo(
      String jobReqId,
      String submitUser,
      String executeUser,
      String source,
      String labels,
      String params,
      String progress,
      String status,
      String logPath,
      Integer errorCode,
      String errorDesc,
      Date createdTime,
      Date updatedTime,
      String instances,
      String metrics,
      String engineType,
      String executionCode) {
    this.jobReqId = jobReqId;
    this.submitUser = submitUser;
    this.executeUser = executeUser;
    this.source = source;
    this.labels = labels;
    this.params = params;
    this.progress = progress;
    this.status = status;
    this.logPath = logPath;
    this.errorCode = errorCode;
    this.errorDesc = errorDesc;
    this.createdTime = createdTime;
    this.updatedTime = updatedTime;
    this.instances = instances;
    this.metrics = metrics;
    this.engineType = engineType;
    this.executionCode = executionCode;
  }
}
