/*
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2013 JSQLParser
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 2.1 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */
package net.sf.jsqlparser.statement.create.table;

import net.sf.jsqlparser.statement.select.PlainSelect;

import java.util.List;

public class ColDataType {

    private String dataType;
    private List<String> argumentsStringList;
    private String characterSet;

    public List<String> getArgumentsStringList() {
        return argumentsStringList;
    }

    public String getDataType() {
        return dataType;
    }

    public void setArgumentsStringList(List<String> list) {
        argumentsStringList = list;
    }

    public void setDataType(String string) {
        dataType = string;
    }

    public String getCharacterSet() {
        return characterSet;
    }

    public void setCharacterSet(String characterSet) {
        this.characterSet = characterSet;
    }

    @Override
    public String toString() {
        return dataType
                + (argumentsStringList != null ? " " + PlainSelect.getStringList(argumentsStringList, true, true) : "")
                + (characterSet != null ? " CHARACTER SET " + characterSet : "");
    }
}
