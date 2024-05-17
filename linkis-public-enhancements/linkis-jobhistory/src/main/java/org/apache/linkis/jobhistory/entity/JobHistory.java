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

package org.apache.linkis.jobhistory.entity;

import org.apache.linkis.monitor.jobhistory.entity.JobHistoryInfo;
import org.apache.linkis.monitor.jobhistory.entity.JobHistoryInfo;
public class JobHistory {

  private Long id;
  private JobHistoryInfo jobHistoryInfo; // New field to hold the common fields
  private String resultLocation;
  private String observeInfo;

  // Constructor with JobHistoryInfo parameter
  public JobHistory(
      Long id, JobHistoryInfo jobHistoryInfo, String resultLocation, String observeInfo) {
    this.id = id;
    this.jobHistoryInfo = jobHistoryInfo;
    this.resultLocation = resultLocation;
    this.observeInfo = observeInfo;
  }

  // Getters and Setters for the fields

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public JobHistoryInfo getJobHistoryInfo() {
    return jobHistoryInfo;
  }

  public void setJobHistoryInfo(JobHistoryInfo jobHistoryInfo) {
    this.jobHistoryInfo = jobHistoryInfo;
  }

  public String getResultLocation() {
    return resultLocation;
  }

  public void setResultLocation(String resultLocation) {
    this.resultLocation = resultLocation;
  }

  public String getObserveInfo() {
    return observeInfo;
  }

  public void setObserveInfo(String observeInfo) {
    this.observeInfo = observeInfo;
  }

  @Override
  public String toString() {
    return "JobHistory{"
        + "id="
        + id
        + ", jobHistoryInfo="
        + jobHistoryInfo
        + ", resultLocation='"
        + resultLocation
        + '\''
        + '}';
  }
}
