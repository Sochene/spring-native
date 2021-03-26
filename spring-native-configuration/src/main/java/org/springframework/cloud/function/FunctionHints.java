/*
 * Copyright 2019-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.function;

import org.springframework.cloud.function.context.config.KotlinLambdaToFunctionAutoConfiguration;
import org.springframework.nativex.hint.InitializationHint;
import org.springframework.nativex.hint.InitializationTime;
import org.springframework.nativex.hint.NativeHint;
import org.springframework.nativex.hint.TypeHint;
import org.springframework.nativex.type.NativeConfiguration;

@InitializationHint(typeNames = "org.springframework.cloud.function.web.function.FunctionEndpointInitializer", initTime = InitializationTime.BUILD)
@NativeHint(trigger = KotlinLambdaToFunctionAutoConfiguration.class, types =
	@TypeHint(typeNames = "org.springframework.cloud.function.context.config.KotlinLambdaToFunctionAutoConfiguration$KotlinFunctionWrapper"))
public class FunctionHints implements NativeConfiguration {
}
