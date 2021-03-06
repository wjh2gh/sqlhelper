
/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the LGPL, Version 3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at  http://www.gnu.org/licenses/lgpl-3.0.html
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jn.sqlhelper.dialect;

/**
 * This represent all the parameters.
 * <p>
 * all parameters will slice 3 segments:
 * <p>
 * |------before-----|-----subquery-----|------after-----|
 * |-----------------original parameters-----------------|
 *
 * @param <P>
 */
public interface QueryParameters<P> {
    RowSelection getRowSelection();

    boolean isCallable();

    /**
     * all parameters
     */
    P getParameterValues();

    /**
     * the count of all parameters
     */
    int getParameterValuesSize();

    P getBeforeSubqueryParameterValues();

    int getBeforeSubqueryParameterCount();

    P getSubqueryParameterValues();

    P getAfterSubqueryParameterValues();

    int getAfterSubqueryParameterCount();
}
