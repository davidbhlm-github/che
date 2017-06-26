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
package org.eclipse.che.api.workspace.shared.dto.event;

import org.eclipse.che.api.workspace.shared.dto.RuntimeIdentityDto;
import org.eclipse.che.dto.shared.DTO;

/**
 * Defines event format for machine logs.
 *
 * @author Anton Korneta
 */
@DTO
public interface MachineLogEvent {

    String getText();

    void setText(String text);

    MachineLogEvent withText(String text);

    String getMachineName();

    void setMachineName(String machineName);

    MachineLogEvent withMachineName(String machineName);

    RuntimeIdentityDto getRuntimeId();

    void setRuntimeId(RuntimeIdentityDto runtimeId);

    MachineLogEvent withRuntimeId(RuntimeIdentityDto runtimeId);

}
