/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.ballerina.c2c.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;

/**
 * Kubernetes Pod Autoscaler annotations model class.
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PodAutoscalerModel extends KubernetesModel {
    private int minReplicas;
    private int maxReplicas;
    private int cpuPercentage;
    private String deployment;

    public PodAutoscalerModel() {
        this.cpuPercentage = 50;
        labels = new HashMap<>();
    }

    public void addLabel(String key, String value) {
        this.labels.put(key, value);
    }
}
