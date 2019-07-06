/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Column of the Data Model DB.
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
{@link table}, 
{@link type}, 

* It provides of then following operations (getters and setters)
{@link getTable},
{@link getType},
{@link setTable},
{@link setType},
 */

@Description("")

public interface Column extends GenericEntity, db.DatabaseElement {

	EntityType<Column> T = EntityTypes.T(Column.class);

	/* Constants for each property name. */
	java.lang.String table = "table";
	java.lang.String type = "type";

	@Description("")
	@Mandatory
	db.Table getTable();
	void setTable(db.Table table);
	@Description("")
	@Mandatory
	java.lang.String getType();
	void setType(java.lang.String type);
}
