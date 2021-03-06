/*
 * FrontlineSMS <http://www.frontlinesms.com>
 * Copyright 2007, 2008 kiwanja
 * 
 * This file is part of FrontlineSMS.
 * 
 * FrontlineSMS is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 * 
 * FrontlineSMS is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with FrontlineSMS. If not, see <http://www.gnu.org/licenses/>.
 */
package net.frontlinesms.arcane.split;

import net.frontlinesms.arcane.data.ArcaneReceivedMessage_UnknownSender;

public class ReceivedMessage_UnknownSenderPattern extends SplitPattern {
	private static ReceivedMessage_UnknownSenderPattern instance;
	
	public static synchronized ReceivedMessage_UnknownSenderPattern getInstance() {
		if(instance == null) instance = new ReceivedMessage_UnknownSenderPattern();
		return instance;
	}
	
	private ReceivedMessage_UnknownSenderPattern() {
		addField(FieldType.INT, "id", 10);
		addField(FieldType.DATE, "date", 10);
		addField(FieldType.TIME, "time", 8);
		addField(FieldType.STRING, "msisdn", 18);
		addField(FieldType.STRING, "content", 320);
	}
	
	@SuppressWarnings("unchecked")
	public ArcaneReceivedMessage_UnknownSender parse(String dataString) {
		ArcaneReceivedMessage_UnknownSender message = new ArcaneReceivedMessage_UnknownSender();
		
		String[] columns = getColumns(dataString);
		
		int index = -1;
		
		message.setId(getInt(columns[++index]));
		message.setTimestamp(getTimestamp(columns[++index], columns[++index]));
		message.setMsisdn(getString(columns[++index]));
		message.setContent(getString(columns[++index]));
		
		return message;
	}
}
