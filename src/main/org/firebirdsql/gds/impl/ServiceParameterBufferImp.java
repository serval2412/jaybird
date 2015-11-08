/*
 * Firebird Open Source JavaEE Connector - JDBC Driver
 *
 * Distributable under LGPL license.
 * You may obtain a copy of the License at http://www.gnu.org/copyleft/lgpl.html
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * LGPL License for more details.
 *
 * This file was created by members of the firebird development team.
 * All individual contributions remain the Copyright (C) of those
 * individuals.  Contributors to this file are either listed here or
 * can be obtained from a source control history command.
 *
 * All rights reserved.
 */
package org.firebirdsql.gds.impl;

import org.firebirdsql.encodings.Encoding;
import org.firebirdsql.gds.ISCConstants;
import org.firebirdsql.gds.ParameterTagMapping;
import org.firebirdsql.gds.ServiceParameterBuffer;

/**
 * Implementation of ServiceParameterBuffer.
 */
public class ServiceParameterBufferImp extends ParameterBufferBase implements ServiceParameterBuffer {

    /**
     * Creates an empty service parameter buffer
     */
    public ServiceParameterBufferImp(Encoding defaultEncoding) {
        super(ISCConstants.isc_spb_version, defaultEncoding);
    }

    @Override
    public ParameterTagMapping getTagMapping() {
        return ParameterTagMapping.SPB;
    }
}