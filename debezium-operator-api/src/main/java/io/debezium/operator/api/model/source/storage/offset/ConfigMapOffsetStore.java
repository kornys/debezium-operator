/*
 * Copyright Debezium Authors.
 *
 * Licensed under the Apache Software License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package io.debezium.operator.api.model.source.storage.offset;

import io.debezium.operator.api.model.source.storage.ConfigMapStore;
import io.debezium.operator.docs.annotations.Documented;
import io.sundr.builder.annotations.Buildable;

@Documented
@Buildable(editableEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", lazyCollectionInitEnabled = false)
public class ConfigMapOffsetStore extends ConfigMapStore {

    public static final String TYPE = "io.debezium.storage.configmap.ConfigMapOffsetStore";

    public ConfigMapOffsetStore() {
        super(TYPE);
    }
}
