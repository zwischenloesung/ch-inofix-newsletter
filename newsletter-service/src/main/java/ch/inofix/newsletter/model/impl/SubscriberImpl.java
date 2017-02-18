/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package ch.inofix.newsletter.model.impl;

import aQute.bnd.annotation.ProviderType;

/**
 * The extended model implementation for the Subscriber service. Represents a
 * row in the &quot;inofix_Subscriber&quot; database table, with each column
 * mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the {@link ch.inofix.newsletter.model.Subscriber} interface.
 * </p>
 *
 * @author Christian Berndt
 */
@ProviderType
public class SubscriberImpl extends SubscriberBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a subscriber
	 * model instance should use the {@link
	 * ch.inofix.newsletter.model.Subscriber} interface instead.
	 */
	public SubscriberImpl() {
	}

	public SubscriberImpl(String firstName, String middleName, String lastName) {
		_firstName = firstName;
		_middleName = middleName;
		_lastName = lastName;
	}

	public int fullNameLength() {
		return _firstName.length() + _middleName.length() + _lastName.length();
	}

	public String getMiddleInitial() {
		return _middleName.charAt(0) + ".";
	}

	@Override
	public String toString() {
		return _firstName + " " + getMiddleInitial() + " " + _lastName;
	}

	private String _firstName;
	private String _middleName;
	private String _lastName;
}