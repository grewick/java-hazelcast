/*
 * Copyright 2018 The OpenTracing Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package io.opentracing.contrib.hazelcast;

import java.io.Serializable;
import java.util.Map;

public class TracingMessage<E> implements Serializable {

  private final E message;

  private final Map<String, String> spanContextMap;

  public TracingMessage(E message, Map<String, String> spanContextMap) {
    this.message = message;
    this.spanContextMap = spanContextMap;
  }

  public E getMessage() {
    return message;
  }

  public Map<String, String> getSpanContextMap() {
    return spanContextMap;
  }
}