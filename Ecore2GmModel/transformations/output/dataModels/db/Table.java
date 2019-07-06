/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Table of the Data Model DB.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package db;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link columns}, 
{@link primaryKeys}, 

* It provides of then following operations (getters and setters)
{@link getColumns},
{@link getPrimaryKeys},
{@link setColumns},
{@link setPrimaryKeys},
 */

@Description("")

public interface Table extends GenericEntity, db.DatabaseElement {

	EntityType<Table> T = EntityTypes.T(Table.class);

	/* Constants for each property name. */
	java.lang.String columns = "columns";
	java.lang.String primaryKeys = "primaryKeys";

	@Description("")
	
	java.util.List<db.Column> getColumns();
	void setColumns(java.util.List<db.Column> columns);

	@Description("")
	
	java.util.List<db.Column> getPrimaryKeys();
	void setPrimaryKeys(java.util.List<db.Column> primaryKeys);

}
