/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcTableColumn of the Data Model iai.
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
{@link Identifier}, 
{@link Name}, 
{@link Description}, 
{@link Unit}, 
{@link ReferencePath}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getName},
{@link getDescription},
{@link getUnit},
{@link getReferencePath},
{@link setIdentifier},
{@link setName},
{@link setDescription},
{@link setUnit},
{@link setReferencePath},
 */

@Description("")

public interface IfcTableColumn extends GenericEntity {

	EntityType<IfcTableColumn> T = EntityTypes.T(IfcTableColumn.class);

	/* Constants for each property name. */
	java.lang.String Identifier = "Identifier";
	java.lang.String Name = "Name";
	java.lang.String Description = "Description";
	java.lang.String Unit = "Unit";
	java.lang.String ReferencePath = "ReferencePath";

	@Description("")
	@Mandatory
	java.lang.String getIdentifier();
	void setIdentifier(java.lang.String Identifier);
	@Description("")
	@Mandatory
	java.lang.String getName();
	void setName(java.lang.String Name);
	@Description("")
	@Mandatory
	java.lang.String getDescription();
	void setDescription(java.lang.String Description);
	@Description("")
	@Mandatory
	ifc4.IfcUnit getUnit();
	void setUnit(ifc4.IfcUnit Unit);
	@Description("")
	@Mandatory
	ifc4.IfcReference getReferencePath();
	void setReferencePath(ifc4.IfcReference ReferencePath);
}
