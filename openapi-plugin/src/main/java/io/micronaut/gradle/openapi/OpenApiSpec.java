/*
 * Copyright 2003-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.gradle.openapi;

import org.gradle.api.provider.ListProperty;
import org.gradle.api.provider.Property;

public interface OpenApiSpec {

    Property<String> getLang();

    Property<String> getInvokerPackageName();

    Property<String> getApiPackageName();

    Property<String> getModelPackageName();

    Property<Boolean> getUseBeanValidation();

    Property<Boolean> getUseOptional();

    Property<Boolean> getUseReactive();

    Property<String> getSerializationFramework();

    Property<Boolean> getAlwaysUseGenerateHttpResponse();

    Property<Boolean> getGenerateHttpResponseWhereRequired();

    Property<Boolean> getLombok();

    Property<Boolean> getGeneratedAnnotation();

    Property<Boolean> getFluxForArrays();

    Property<String> getDateTimeFormat();

    ListProperty<ParameterMappingModel> getParameterMappings();

    ListProperty<ResponseBodyMappingModel> getResponseBodyMappings();
}
