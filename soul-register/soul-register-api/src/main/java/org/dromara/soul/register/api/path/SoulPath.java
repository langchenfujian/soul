/*
 *     Licensed to the Apache Software Foundation (ASF) under one or more
 *     contributor license agreements.See the NOTICE file distributed with
 *     this work for additional information regarding copyright ownership.
 *     The ASF licenses this file to You under the Apache License, Version 2.0
 *     (the "License"); you may not use this file except in compliance with
 *     the License.You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package org.dromara.soul.register.api.path;

import lombok.Data;
import org.dromara.soul.common.http.URL;
import org.dromara.soul.common.utils.AttrMap;

/**
 * SoulPath
 * Path defined by soul.
 *
 * @author sixh
 */
@Data
public class SoulPath implements Path {

    private String key;

    private Path nativePath;

    private String protocol;

    private String host;

    private String port;

    private String path;

    private AttrMap<String, String> params;

    private Integer status;

    @Override
    public Integer status() {
        return status;
    }

    @Override
    public URL getSoulPath() {
        return null;
    }

    @Override
    public <T extends Path> T getPathObj(URL url) {
        return null;
    }

    @Override
    public String getEvn() {
        return null;
    }
}
