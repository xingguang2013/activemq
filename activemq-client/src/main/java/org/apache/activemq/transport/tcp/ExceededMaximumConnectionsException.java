/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.activemq.transport.tcp;

/**
 * Thrown to indicate that the {@link TcpTransportServer#maximumConnections} 
 * property has been exceeded. 
 * 
 * @see {@link TcpTransportServer#maximumConnections}
 * @author bsnyder
 *
 */
public class ExceededMaximumConnectionsException extends Exception {

    /**
     * Default serial version id for serialization
     */
    private static final long serialVersionUID = -1166885550766355524L;

    public ExceededMaximumConnectionsException(String message) {
        super(message);
    }

}
