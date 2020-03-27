package sqlancer.tidb.ast;

import sqlancer.tidb.TiDBSchema.TiDBTable;

public class TiDBTableReference extends TiDBExpression {

	private TiDBTable table;

	public TiDBTableReference(TiDBTable table) {
		this.table = table;
	}
	
	public TiDBTable getTable() {
		return table;
	}

}
