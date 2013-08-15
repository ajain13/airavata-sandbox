package org.apache.airavata.gsi.ssh.api;/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

/**
 * User: AmilaJ (amilaj@apache.org)
 * Date: 8/14/13
 * Time: 4:15 PM
 */

/**
 * Encapsulate server information.
 */
public class ServerInfo {

    private String host;
    private String userName;
    private int port = 22;

    public ServerInfo(String userName, String host) {
        this.userName = userName;
        this.host = host;
    }

    public ServerInfo(String host, String userName, int port) {
        this.host = host;
        this.userName = userName;
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}