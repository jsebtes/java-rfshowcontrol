package fr.jstessier.rfshowcontrol;

/*
 * Copyright (C) 2015 J.S. TESSIER
 * 
 * This file is part of rfshowcontrol.
 * 
 * java-rf24 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * rfshowcontrol is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with rfshowcontrol. If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */

public class RFShowControlException extends Exception {

	private static final long serialVersionUID = -4629001234725829612L;

	public RFShowControlException() {
		super();
	}

	public RFShowControlException(String message, Throwable cause) {
		super(message, cause);
	}

	public RFShowControlException(String message) {
		super(message);
	}

	public RFShowControlException(Throwable cause) {
		super(cause);
	}
	
}
