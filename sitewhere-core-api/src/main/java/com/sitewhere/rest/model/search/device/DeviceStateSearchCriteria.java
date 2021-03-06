/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.rest.model.search.device;

import java.util.Date;

import com.sitewhere.rest.model.search.SearchCriteria;
import com.sitewhere.spi.search.device.IDeviceStateSearchCriteria;

/**
 * Provides filter criteria for device state searches.
 * 
 * @author Derek
 */
public class DeviceStateSearchCriteria extends SearchCriteria implements IDeviceStateSearchCriteria {

    /** Filter by last interaction date before a given value */
    private Date lastInteractionDateBefore;

    public DeviceStateSearchCriteria(int pageNumber, int pageSize) {
	super(pageNumber, pageSize);
    }

    /*
     * @see com.sitewhere.spi.search.device.IDeviceStateSearchCriteria#
     * getLastInteractionDateBefore()
     */
    @Override
    public Date getLastInteractionDateBefore() {
	return lastInteractionDateBefore;
    }

    public void setLastInteractionDateBefore(Date lastInteractionDateBefore) {
	this.lastInteractionDateBefore = lastInteractionDateBefore;
    }
}