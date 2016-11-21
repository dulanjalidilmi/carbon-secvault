/*
 *  Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.wso2.carbon.kernel.configprovider;

import java.util.Map;

/**
 * ConfigProvider provides the configuration mapping of the class namespace.
 * This will update the configuration values with
 * following placeholders ${env:alias}, ${sys:alias} and ${sec:alias}
 *
 * @since 5.2.0
 */
public interface ConfigProvider {

    /**
     * returns configuration object of the class with overriding the values of deployment.yaml, if configuration
     * exists for the given namespace in deployment.yaml
     * @param configClass configuration bean class
     * @param <T> object type
     * @return configuration bean object of given type
     * @throws CarbonConfigurationException
     */
    public <T extends Object> T getConfigurationObject(Class<T> configClass) throws CarbonConfigurationException;

    /**
     * returns configuration map of the namespace, if configuration exists for the given namespace in deployment.yaml
     * @param namespace config namespace
     * @return configuration map
     * @throws CarbonConfigurationException
     */
    public Map getConfigurationMap(String namespace) throws CarbonConfigurationException;
}