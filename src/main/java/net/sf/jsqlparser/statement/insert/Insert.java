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
package net.sf.jsqlparser.statement.insert;

import net.sf.jsqlparser.expression.operators.relational.ItemsList;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.StatementVisitor;
import net.sf.jsqlparser.statement.select.PlainSelect;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.statement.select.SelectExpressionItem;

import java.util.List;

/**
 * The insert statement. Every column name in <code>columnNames</code> matches
 * an item in <code>itemsList</code>
 */
public class Insert implements Statement {

    private Table table;
    private List<Column> columns;
    private ItemsList itemsList;
    private boolean useValues = true;
    private Select select;
    private boolean useSelectBrackets = true;

    private boolean returningAllColumns = false;

    private List<SelectExpressionItem> returningExpressionList = null;

    @Override
    public void accept(StatementVisitor statementVisitor) {
        statementVisitor.visit(this);
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table name) {
        table = name;
    }

    /**
     * Get the columns (found in "INSERT INTO (col1,col2..) [...]" )
     *
     * @return a list of {@link Column}
     */
    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> list) {
        columns = list;
    }

    /**
     * Get the values (as VALUES (...) or SELECT)
     *
     * @return the values of the insert
     */
    public ItemsList getItemsList() {
        return itemsList;
    }

    public void setItemsList(ItemsList list) {
        itemsList = list;
    }

    public boolean isUseValues() {
        return useValues;
    }

    public void setUseValues(boolean useValues) {
        this.useValues = useValues;
    }

    public boolean isReturningAllColumns() {
        return returningAllColumns;
    }

    public void setReturningAllColumns(boolean returningAllColumns) {
        this.returningAllColumns = returningAllColumns;
    }

    public List<SelectExpressionItem> getReturningExpressionList() {
        return returningExpressionList;
    }

    public void setReturningExpressionList(List<SelectExpressionItem> returningExpressionList) {
        this.returningExpressionList = returningExpressionList;
    }

    public Select getSelect() {
        return select;
    }

    public void setSelect(Select select) {
        this.select = select;
    }

    public boolean isUseSelectBrackets() {
        return useSelectBrackets;
    }

    public void setUseSelectBrackets(boolean useSelectBrackets) {
        this.useSelectBrackets = useSelectBrackets;
    }

    @Override
    public String toString() {
        StringBuilder sql = new StringBuilder();

        sql.append("INSERT INTO ");
        sql.append(table).append(" ");
        if (columns != null) {
            sql.append(PlainSelect.getStringList(columns, true, true)).append(" ");
        }

        if (useValues) {
            sql.append("VALUES ");
        }

        if (itemsList != null) {
            sql.append(itemsList);
        }

        if (useSelectBrackets) {
            sql.append("(");
        }
        if (select != null) {
            sql.append(select);
        }
        if (useSelectBrackets) {
            sql.append(")");
        }

        if (isReturningAllColumns()) {
            sql.append(" RETURNING *");
        } else if (getReturningExpressionList() != null) {
            sql.append(" RETURNING ").append(PlainSelect.getStringList(getReturningExpressionList(), true, false));
        }

        return sql.toString();
    }
}
