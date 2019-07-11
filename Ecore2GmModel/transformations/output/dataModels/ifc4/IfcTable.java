/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcTable of the Data Model iai.
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
{@link Name}, 
{@link Rows}, 
{@link Columns}, 
{@link NumberOfCellsInRow}, 
{@link NumberOfDataRows}, 
{@link NumberOfHeadings}, 

* It provides of then following operations (getters and setters)
{@link getName},
{@link getRows},
{@link getColumns},
{@link getNumberOfCellsInRow},
{@link getNumberOfDataRows},
{@link getNumberOfHeadings},
{@link setName},
{@link setRows},
{@link setColumns},
{@link setNumberOfCellsInRow},
{@link setNumberOfDataRows},
{@link setNumberOfHeadings},
 */

@Description("")

public interface IfcTable extends GenericEntity, ifc4.IfcMetricValueSelect, ifc4.IfcObjectReferenceSelect {

	EntityType<IfcTable> T = EntityTypes.T(IfcTable.class);

	/* Constants for each property name. */
	java.lang.String Name = "Name";
	java.lang.String Rows = "Rows";
	java.lang.String Columns = "Columns";
	java.lang.String NumberOfCellsInRow = "NumberOfCellsInRow";
	java.lang.String NumberOfDataRows = "NumberOfDataRows";
	java.lang.String NumberOfHeadings = "NumberOfHeadings";

	@Description("")
	@Mandatory
	java.lang.String getName();
	void setName(java.lang.String Name);
	@Description("")
	
	java.util.List<ifc4.IfcTableRow> getRows();
	void setRows(java.util.List<ifc4.IfcTableRow> Rows);

	@Description("")
	
	java.util.List<ifc4.IfcTableColumn> getColumns();
	void setColumns(java.util.List<ifc4.IfcTableColumn> Columns);

	@Description("")
	@Mandatory
	java.lang.Long getNumberOfCellsInRow();
	void setNumberOfCellsInRow(java.lang.Long NumberOfCellsInRow);
	@Description("")
	@Mandatory
	java.lang.Long getNumberOfDataRows();
	void setNumberOfDataRows(java.lang.Long NumberOfDataRows);
	@Description("")
	@Mandatory
	java.lang.Long getNumberOfHeadings();
	void setNumberOfHeadings(java.lang.Long NumberOfHeadings);
}
