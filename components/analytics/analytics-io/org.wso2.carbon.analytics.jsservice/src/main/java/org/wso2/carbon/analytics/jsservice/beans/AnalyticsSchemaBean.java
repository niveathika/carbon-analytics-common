/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
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

package org.wso2.carbon.analytics.jsservice.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.util.Map;

/**
 * Bean class for representing the table schema
 */
@XmlRootElement(name = "analyticsSchema")
@XmlAccessorType(XmlAccessType.FIELD)
public class AnalyticsSchemaBean {

    @XmlElement(name = "columns", required = true)
    private Map<String, ColumnTypeBean> columns;

    @XmlElement(name = "primaryKeys", required = true)
    private List<String> primaryKeys;

    public AnalyticsSchemaBean(){

    }

    public AnalyticsSchemaBean(
            Map<String, ColumnTypeBean> columns, List<String> primaryKeys) {
        this.columns = columns;
        this.primaryKeys = primaryKeys;
    }

    public Map<String, ColumnTypeBean> getColumns() {
        return columns;
    }

    public void setColumns(Map<String, ColumnTypeBean> columns) {
        this.columns = columns;
    }

    public List<String> getPrimaryKeys() {
        return primaryKeys;
    }

    public void setPrimaryKeys(List<String> primaryKeys) {
        this.primaryKeys = primaryKeys;
    }
}
