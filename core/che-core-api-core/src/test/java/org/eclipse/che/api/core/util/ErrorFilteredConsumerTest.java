/*******************************************************************************
 * Copyright (c) 2012-2017 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.api.core.util;

import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * @author Anatolii Bazko
 */
public class ErrorFilteredConsumerTest {

    @Test
    public void testRedirect() throws Exception {
        LineConsumer lineConsumer = mock(LineConsumer.class);

        ErrorFilteredConsumer errorFilteredConsumer = new ErrorFilteredConsumer(lineConsumer);

        errorFilteredConsumer.writeLine("Line 1");
        errorFilteredConsumer.writeLine("Line 2");
        errorFilteredConsumer.writeLine("[STDERR] Line 3");
        errorFilteredConsumer.writeLine("[STDERR] Line 4");
        errorFilteredConsumer.writeLine("Line 5");

        verify(lineConsumer).writeLine("[STDERR] Line 3");
        verify(lineConsumer).writeLine("[STDERR] Line 4");
    }
}
