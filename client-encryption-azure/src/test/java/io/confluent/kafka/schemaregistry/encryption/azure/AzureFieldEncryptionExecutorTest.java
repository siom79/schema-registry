/*
 * Copyright 2022 Confluent Inc.
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

package io.confluent.kafka.schemaregistry.encryption.azure;

import io.confluent.kafka.schemaregistry.encryption.FieldEncryptionExecutorTest;
import io.confluent.kafka.schemaregistry.encryption.FieldEncryptionProperties;
import java.util.List;

public class AzureFieldEncryptionExecutorTest extends FieldEncryptionExecutorTest {

  public AzureFieldEncryptionExecutorTest() throws Exception {
    super();
  }

  @Override
  protected FieldEncryptionProperties getFieldEncryptionProperties(List<String> ruleNames) {
    return new AzureFieldEncryptionProperties(ruleNames);
  }
}

