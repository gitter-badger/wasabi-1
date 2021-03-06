/*******************************************************************************
 * Copyright 2016 Intuit
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.intuit.wasabi.analyticsobjects.statistics;

import com.intuit.wasabi.analyticsobjects.Event;
import com.intuit.wasabi.analyticsobjects.counts.ContainerCounts;
import java.util.Map;

/**
 * This interface holds the joint action rate and the action rates
 * per single {@link Event}.
 */
public interface ContainerStatistics extends ContainerCounts {

	/**
	 * Returns the joint action rate.
	 *
	 * @return {@link Estimate} across elements
	 */
	Estimate getJointActionRate();

	/**
	 * Returns the action rate for the events. They could be accumulated
	 * across Buckets or per Bucket.
	 *
	 * @return a {@link Map} with the event as a key and the {@link ActionRate} as value
	 */
	Map<Event.Name, ActionRate> getActionRates();
}
