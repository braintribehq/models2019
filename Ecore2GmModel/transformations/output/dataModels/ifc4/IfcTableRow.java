/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcTableRow of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link RowCells}, 
{@link IsHeading}, 

* It provides of then following operations (getters and setters)
{@link getRowCells},
{@link getIsHeading},
{@link setRowCells},
{@link setIsHeading},
 */

@Description("")

public interface IfcTableRow extends GenericEntity {

	EntityType<IfcTableRow> T = EntityTypes.T(IfcTableRow.class);

	/* Constants for each property name. */
	java.lang.String RowCells = "RowCells";
	java.lang.String IsHeading = "IsHeading";

	@Description("")
	
	java.util.List<ifc4.IfcValue> getRowCells();
	void setRowCells(java.util.List<ifc4.IfcValue> RowCells);

	@Description("")
	@Mandatory
	ifc4.Tristate getIsHeading();
	void setIsHeading(ifc4.Tristate IsHeading);
}
