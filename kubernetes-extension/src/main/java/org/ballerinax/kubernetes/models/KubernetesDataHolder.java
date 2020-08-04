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

package org.ballerinax.kubernetes.models;

import org.ballerinalang.model.elements.PackageID;
import org.ballerinax.docker.generator.models.DockerModel;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Class to store kubernetes models.
 */
public class KubernetesDataHolder {
    private boolean canProcess;
    private DeploymentModel deploymentModel;
    private DockerModel dockerModel;
    private PodAutoscalerModel podAutoscalerModel;
    private Map<String, ServiceModel> bListenerToK8sServiceMap;
    private Map<String, Set<SecretModel>> bListenerToSecretMap;
    private Set<SecretModel> secretModelSet;
    private Set<ConfigMapModel> configMapModelSet;
    private Set<PersistentVolumeClaimModel> volumeClaimModelSet;
    private Set<ResourceQuotaModel> resourceQuotaModels;
    private JobModel jobModel;
    private Path uberJarPath;
    private Path k8sArtifactOutputPath;
    private Path dockerArtifactOutputPath;
    private String namespace;
    private Path sourceRoot;
    private PackageID packageID;
    private Path ballerinaCloudPath;

    KubernetesDataHolder(Path sourceRoot) {
        this.sourceRoot = sourceRoot;
        this.bListenerToK8sServiceMap = new HashMap<>();
        this.bListenerToSecretMap = new HashMap<>();
        this.secretModelSet = new HashSet<>();
        this.configMapModelSet = new HashSet<>();
        this.volumeClaimModelSet = new HashSet<>();
        this.deploymentModel = new DeploymentModel();
        this.resourceQuotaModels = new HashSet<>();
        this.dockerModel = new DockerModel();
    }

    public Path getSourceRoot() {
        return sourceRoot;
    }

    public DeploymentModel getDeploymentModel() {
        return deploymentModel;
    }

    public void setDeploymentModel(DeploymentModel deploymentModel) {
        this.deploymentModel = deploymentModel;
    }

    public PodAutoscalerModel getPodAutoscalerModel() {
        return podAutoscalerModel;
    }

    public void setPodAutoscalerModel(PodAutoscalerModel podAutoscalerModel) {
        this.podAutoscalerModel = podAutoscalerModel;
    }

    public Map<String, Set<SecretModel>> getSecretModels() {
        return bListenerToSecretMap;
    }

    public void addListenerSecret(String listenerName, Set<SecretModel> secretModel) {
        this.bListenerToSecretMap.put(listenerName, secretModel);
    }

    public Set<SecretModel> getSecretModelSet() {
        return secretModelSet;
    }

    public void addSecrets(Set<SecretModel> secrets) {
        this.secretModelSet.addAll(secrets);
    }

    public Set<ConfigMapModel> getConfigMapModelSet() {
        return configMapModelSet;
    }

    public void addConfigMaps(Set<ConfigMapModel> configMaps) {
        this.configMapModelSet.addAll(configMaps);
    }

    public Set<PersistentVolumeClaimModel> getVolumeClaimModelSet() {
        return volumeClaimModelSet;
    }

    public void addPersistentVolumeClaims(Set<PersistentVolumeClaimModel> persistentVolumeClaims) {
        this.volumeClaimModelSet.addAll(persistentVolumeClaims);
    }

    public Set<ResourceQuotaModel> getResourceQuotaModels() {
        return resourceQuotaModels;
    }

    public void setResourceQuotaModels(Set<ResourceQuotaModel> resourceQuotaModels) {
        this.resourceQuotaModels = resourceQuotaModels;
    }

    public Map<String, ServiceModel> getbListenerToK8sServiceMap() {
        return bListenerToK8sServiceMap;
    }

    public void addBListenerToK8sServiceMap(String listenerName, ServiceModel serviceModel) {
        this.bListenerToK8sServiceMap.put(listenerName, serviceModel);
    }

    public JobModel getJobModel() {
        return jobModel;
    }

    public void setJobModel(JobModel jobModel) {
        this.jobModel = jobModel;
    }

    public boolean isCanProcess() {
        return canProcess;
    }

    public void setCanProcess(boolean canProcess) {
        this.canProcess = canProcess;
    }

    public Path getUberJarPath() {
        return uberJarPath;
    }

    public void setUberJarPath(Path uberJarPath) {
        this.uberJarPath = uberJarPath;
    }

    public Path getK8sArtifactOutputPath() {
        return k8sArtifactOutputPath;
    }

    public void setK8sArtifactOutputPath(Path k8sArtifactOutputPath) {
        this.k8sArtifactOutputPath = k8sArtifactOutputPath;
    }

    public Path getDockerArtifactOutputPath() {
        return dockerArtifactOutputPath;
    }

    public void setDockerArtifactOutputPath(Path dockerArtifactOutputPath) {
        this.dockerArtifactOutputPath = dockerArtifactOutputPath;
    }

    public DockerModel getDockerModel() {
        return dockerModel;
    }

    public void setDockerModel(DockerModel dockerModel) {
        this.dockerModel = dockerModel;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public PackageID getPackageID() {
        return packageID;
    }

    public void setPackageID(PackageID packageID) {
        this.packageID = packageID;
    }

    public Path getBallerinaCloudPath() {
        return ballerinaCloudPath;
    }

    public void setBallerinaCloudPath(Path ballerinaCloudPath) {
        this.ballerinaCloudPath = ballerinaCloudPath;
    }
}
